package com.yisuo.yisuoplatform.system.dao;

import com.yisuo.yisuoplatform.system.entity.BaseEntity;
import com.yisuo.yisuoplatform.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author huangbentai
 * @date 2023/3/5 22:57
 */
@NoRepositoryBean
public interface BaseDao<T extends BaseEntity> extends JpaRepository<T,Integer> {

    @Override
    @Query("select t from #{#entityName} t where  t.id = ?1 and t.isDeleted = 0")
    @Transactional(readOnly = true)
    Optional<T> findById(Integer integer);

    @Override
    @Query("select t from #{#entityName} t where t.isDeleted = 0")
    @Transactional(readOnly = true)
    List<T> findAll();

    @Query("update #{#entityName} t set t.isDeleted = 1 where t.id = ?1")
    @Modifying
    @Transactional(rollbackFor = Exception.class)
    void logicDeletedById(Integer id);

    @Transactional(readOnly = true)
    User findByUsername(String username);
}
