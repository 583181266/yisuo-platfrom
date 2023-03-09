package com.yisuo.yisuoplatform.system.service;

import com.yisuo.yisuoplatform.system.entity.BaseEntity;

public interface BaseService<T extends BaseEntity> {

    T findById(Integer id);

    void save(T entity);

    void updateById(T entity);

    void deleteById(Integer id);
}
