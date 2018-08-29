package com.ql.ssm.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.ql.ssm.dao.UserMapper;
import com.ql.ssm.pojo.User;

@Service
@Transactional
public class UserService {
	
	@Resource
	private UserMapper usermapper;
	
	public User getUserByid(Integer id) {
		User user = null;
		user = usermapper.getUserByid(id);
		return user;
	}
}
