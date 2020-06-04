package com.atguigu.springboot.repository;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 设置一个接口，用于操作数据表user
 * 继承JpaRepository来完成数据库的操作，其中JpaRepository<User,Integer> 代表的是 < 实体类，主键类型 >
 */
public interface UserRepository extends JpaRepository<User,Integer>{


}
