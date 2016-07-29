package cn.springmvc.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	private Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@Autowired(required = true)
	protected SqlSession sqlSessionTemplate;

	@Override
	public int insertUser(User user) {
		return sqlSessionTemplate.insert("com.xingewu.kt56.biz.dao.mybatis.impl.UserDAOImpl.insertUser", user);
	}


	@Override
	public Map<String,Object> selectUserListPage(Map<String, Object> params) {
		try {
			List<User> contentList = sqlSessionTemplate.selectList("UserMapper.selectUserList1Page", params);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("content", contentList);
			result.put("page", params.get("page"));
			return result;
		} catch (Exception e) {
			throw new RuntimeException(String.format("根据分页对象查询列表出错！语句:%s", "listPageInfo"), e);
		}
	}

}
