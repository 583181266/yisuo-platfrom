alter table system_user
    add salt varchar(50) null comment '盐值，用于加密' after password;