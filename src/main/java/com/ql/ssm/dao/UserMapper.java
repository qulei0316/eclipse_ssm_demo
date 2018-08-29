package com.ql.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ql.ssm.pojo.User;

public interface UserMapper {
	
	public User getUserByid(@Param("id")Integer id);
}
