package com.java.demo.entry;

import com.java.demo.common.Base;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by GaoTao on 2017/12/19.
 */
@Data
@Table
@EqualsAndHashCode
@Entity(name = "t_permission")
public class Permission extends Base implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "permission_name")
    private String permissionName;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;// 一个权限对应一个角色


}
