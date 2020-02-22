package com.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.blog.model.Category;
import com.blog.model.Comment;
import com.blog.model.Content;
import com.blog.model.Page;
import com.blog.model.User;

@Repository
public interface CommentDao {
	
	@Select("select * from comment where c_id = #{id}")
	public List<Comment> allComment(Integer id);
	
	@Select("select * from comment where c_id = #{com_id} order by id desc limit #{start},#{pageSize}")
	public List<Comment> allCommentPage(Page<Comment> page );
	
	@Delete("delete from comment where id=#{delid}")
	public void deleteComment(Integer delid);
	
	@Delete("delete from comment where c_id=#{delid}")
	public void delete_cid(Integer delid);
	
	@Delete("delete from comment where u_id=#{delid}")
	public void delete_uid(Integer delid);
	
}
