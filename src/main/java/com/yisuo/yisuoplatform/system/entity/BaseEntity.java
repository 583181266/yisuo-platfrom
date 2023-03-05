package com.yisuo.yisuoplatform.system.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author huangbentai
 * @date 2023/3/5 21:43
 */
@Data
@MappedSuperclass
public class BaseEntity {


    /**
     * 创建人
     */
    @Column
    private Integer createBy;

    /**
     * 创建时间
     */
    @Column
    private Date createTime;

    /**
     * 修改人
     */
    @Column
    private Integer updatedBy;
    /**
     * 修改时间
     */
    @Column
    private Date updatedTime;
    /**
     * 逻辑删除 0 未删除 1 删除
     */
    @Column
    private Short isDeleted;

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updatedBy +
                ", updateTime=" + updatedTime +
                ", isDeleted=" + isDeleted +
                ", remark='" + remark + '\'' +
                '}';
    }

    /**
     * 备注
     */
    @Column
    private String remark;
}
