package com.java.demo.entry;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaoTao on 2017/12/19.
 */
@Data
@Table
@EqualsAndHashCode
@Entity(name = "t_role")
public class Role implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "role_name")
    private String roleName;

    @OneToMany(mappedBy = "role", fetch=FetchType.EAGER)
    private List<Permission> permissionList;// 一个角色对应多个权限
    @ManyToMany
    @JoinTable(name = "t_user_role", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = {
            @JoinColumn(name = "user_id") })
    private List<User> userList;// 一个角色对应多个用户


    @Transient
    public List<String> getPermissionsName() {
        List<String> list = new ArrayList<>();
        List<Permission> perlist = getPermissionList();
        for (Permission per : perlist) {
            list.add(per.getPermissionName());
        }
        return list;
    }
}
