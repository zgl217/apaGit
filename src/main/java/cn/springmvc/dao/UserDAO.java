package cn.springmvc.dao;

import java.util.List;
import java.util.Map;

import cn.springmvc.model.User;


public interface UserDAO {

	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	
	/**
	 * 查询用户列表
	 * @param user
	 * @return
	 */
	public Map<String,Object> selectUserListPage(Map<String,Object> params);
	
}
