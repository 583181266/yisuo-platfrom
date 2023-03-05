create table platform.system_user
(
    id           bigint auto_increment comment '主键'
        primary key,
    username     varchar(30)                        null comment '用户名',
    password     varchar(100)                       null comment '密码',
    id_card      varchar(30)                        null comment '身份证',
    gender       tinyint                            null comment '性别 0 男 1 女',
    email        varchar(50)                        null comment '邮箱',
    phone        varchar(30)                        null comment '电话',
    birthday     datetime                           null comment '生日',
    status       tinyint                            null comment '用户状态--1-正常 2-禁用',
    last_login   datetime                           null comment '上次登陆时间',
    create_by    bigint                             null comment '创建人的ID',
    create_time  datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updated_by   bigint                             null comment '修改人的ID',
    updated_time datetime default CURRENT_TIMESTAMP null comment '修改时间',
    is_deleted   tinyint  default 0                 null comment '逻辑删除的状态 0-未删除 1-删除',
    remark       varchar(200)                       null comment '备注'
)
    comment '用户表';

