package com.java.demo.entry;

import com.java.demo.common.Base;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by GaoTao on 2017/12/17.
 */
@Data
@Table
@EqualsAndHashCode
@Entity(name = "t_user")
public class User extends Base implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "用户名不能为空")
    @JoinColumn(name = "user_name")
    private String userName;

    @NotEmpty(message = "密码不能为空")
    private String password;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "t_user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
            @JoinColumn(name = "role_id") })
    private List<Role> roleList;// 一个用户具有多个角色

    @Transient
    public Set<String> getRolesName() {
        List<Role> roles = getRoleList();
        Set<String> set = new HashSet<>();
        for (Role role : roles) {
            set.add(role.getRoleName());
        }
        return set;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
