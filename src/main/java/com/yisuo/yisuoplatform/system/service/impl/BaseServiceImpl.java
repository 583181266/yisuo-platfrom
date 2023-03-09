package com.yisuo.yisuoplatform.system.service.impl;

import com.yisuo.yisuoplatform.system.dao.BaseDao;
import com.yisuo.yisuoplatform.system.entity.BaseEntity;
import com.yisuo.yisuoplatform.system.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huangbentai
 * @date 2023/3/8 23:21
 */
@Service
public class BaseServiceImpl<D extends BaseDao<T>, T extends BaseEntity> implements BaseService<T> {

    @Resource
    private BaseDao<T> dao;

    @Override
    public T findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void save(T entity) {
        dao.save(entity);
    }

    @Override
    public void updateById(T entity) {
        dao.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
