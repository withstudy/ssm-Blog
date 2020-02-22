package com.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.blog.model.Category;
import com.blog.model.Content;
import com.blog.model.Page;
import com.blog.model.User;

@Repository
public interface ContentDao {
	
	@Select("select * from content")
	public List<Content> allContent();
	
	@Select("select * from content order by id desc limit #{start},#{pageSize}")
	public List<Content> allContentPage(Page<Content> page);
	
	@Delete("delete from content where id=#{delid}")
	public void deleteContent(Integer delid);
	
	@Select("select * from content where id=#{editid}")
	public Content findContent(Integer editid);
	
	@Update("update content set c_id=#{c_id},title=#{title} , comment = #{comment} ,content=#{content} where id=#{id}")
	public void updateContent(Content content);
	
	@Insert("insert into content(id,c_id,title,comment,content,date,u_id) values(null,#{c_id},#{title},#{comment},#{content},#{date},#{u_id})")
	public void addContent(Content content);
}
