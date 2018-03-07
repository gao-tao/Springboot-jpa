package com.java.demo.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * Created by GaoTao on 2017/12/19.
 */
@NoRepositoryBean
    public interface BaseRepository<T, String> extends JpaRepository<T, Long>{



}
