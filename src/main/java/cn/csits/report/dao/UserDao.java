package cn.csits.report.dao;

import cn.csits.report.bean.User;

public interface UserDao {
	public abstract User findByUsername(String username);
}
