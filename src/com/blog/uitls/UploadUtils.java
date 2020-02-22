package com.blog.uitls;


import java.io.File;
import java.io.IOException;
 
import org.springframework.web.multipart.MultipartFile;
 
public class UploadUtils {
 
	public static String upload(MultipartFile file) {
 
		
		
		try {
			//定义上传的位置
			String path ="e:upload/";
			
			File filePath = new File(path);
			if(!filePath.exists()) {//如果目录不存在，创建目录
				
				filePath.mkdir();//这个函数只允许创建一层目录，mikdirs()可以创建多层
			}
 
			file.transferTo(new File(path));//上传文件
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "ture";
		
		
		 
	}
 
}