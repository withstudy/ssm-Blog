package com.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.blog.model.Category;
import com.blog.model.Page;
import com.blog.model.User;

@Repository
public interface CategoryDao {
	
	@Select("select * from category")
	public List<Category> allCategory();
	
	@Select("select * from category order by id desc limit #{start},#{pageSize}")
	public List<Category> allCategoryPage(Page<Category> page);
	
	@Delete("delete from category where id=#{delid}")
	public void deleteCategory(Integer delid);
	
	@Select("select * from category where id=#{editid}")
	public Category findCategory(Integer editid);
	
	@Update("update category set name=#{name} , comment = #{comment} where id=#{id}")
	public void updateCategory(Category category);
	
	@Insert("insert into category values(null,#{name},#{comment})")
	public void addCategory(Category category);
}
