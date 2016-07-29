package cn.springmvc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;


@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(user);
	}
	
	public Map<String,Object> selectUserListPage(Map<String,Object> params) {
		// TODO Auto-generated method stub
		return userDAO.selectUserListPage(params);
	}

}
