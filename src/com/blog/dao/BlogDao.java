package com.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.blog.model.Page;
import com.blog.model.User;

@Repository
public interface BlogDao {

	@Select("select * from user")
	public List<User> allUser();
	
	@Select("select * from user order by id desc limit #{start},#{pageSize}")
	public List<User> allUserPage(Page<User> page);
	
	@Delete("delete from user where id=#{delid}")
	public void deleteUser(Integer delid);
	
	@Select("select * from user where id=#{editid}")
	public User findUser(Integer editid);
	
	@Update("update user set username=#{username} , password = #{password} where id=#{id}")
	public void updateUser(User user);
	
}
