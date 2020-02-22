package com.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.blog.model.User;

@Repository
public interface UserDao {
	
	@Select("select * from user where username = #{username} and password = #{password}")
	public User login(User user);
	
	@Select("select * from user where username = #{username} ")
	public User register(User user);
	
	@Insert("insert into user values(null,#{username},#{password})")
	public void add(User user);
	
	@Select("select * from user")
	public List<User> users();
	
}
