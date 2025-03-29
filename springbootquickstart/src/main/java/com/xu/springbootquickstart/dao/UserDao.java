package com.xu.springbootquickstart.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xu.springbootquickstart.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
//    @Select("select * from user")
//    public List<User> queryAll();
}
