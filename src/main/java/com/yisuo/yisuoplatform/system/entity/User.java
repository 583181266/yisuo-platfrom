package com.yisuo.yisuoplatform.system.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

/**
 * @author huangbentai
 * @date 2023/3/5 21:15
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "system_user")
@Data
public class User extends BaseEntity{

    /**
     * 主键 自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自动生成id
    private Integer id;

    /**
     * 用户名
     */
    @Column
    private String username;

    /**
     * 密码
     */
    @Column
    private String password;

    /**
     * 性别 0 男 1 女
     */
    @Column
    private Short gender;

    /**
     * 身份证
     */
    @Column
    private String idCard;

    /**
     * 邮箱
     */
    @Column
    private String email;

    /**
     * 电话
     */
    @Column
    private String phone;

    /**
     * 生日
     */
    @Column
    private Date birthday;

    /**
     * 状态 用户状态--1-正常 2-禁用
     */
    @Column
    private Short status;

    /**
     * 最后登陆时间
     */
    @Column
    private Date lastLogin;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", idCard='" + idCard + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", status=" + status +
                ", lastLogin=" + lastLogin +
                "} " + super.toString();
    }
}
