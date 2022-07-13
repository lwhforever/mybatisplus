package com.lwh.mybaitsplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwh.mybaitsplus.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User> {
    Map<String,Object> selectMapById(Long id);


}
