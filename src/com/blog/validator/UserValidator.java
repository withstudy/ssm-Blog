package com.blog.validator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.blog.model.User;




@Repository("userValidator")
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors  error) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(error, "username", "username.is.empty","�û�������Ϊ��");
		User user = (User) obj;
		if(user.getUsername()!= null&& user.getUsername().length()>20){
			error.rejectValue("username", "username.too.long","�û������ܳ���20���ַ�");
		}
		if(user.getPassword() != null && user.getPassword().equals("")){
			error.rejectValue("password", "password.is.empty","���벻��Ϊ��");
		}else if(user.getPassword().length()<4){
			error.rejectValue("password", "password.too.short","����������4���ַ�");
		}
	}



}
