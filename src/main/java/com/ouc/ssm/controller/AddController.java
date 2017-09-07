package com.ouc.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ouc.ssm.bean.User;
import com.ouc.ssm.daoImp.AddUserImpl;

/**
*@title：AddController.java
* @author：被抛弃的猫咪
* @version：1.0
* @date：2017年9月6日 下午2:41:07
* @description：
*/
@Controller
public class AddController extends HttpServlet{
	private AddUserImpl addUserImpl;
	private User user;
	public void setUser(User user) {
		this.user = user;
	}

	//使用setter进行注入
	public void setAddUserImpl(AddUserImpl addUserImpl) {
		this.addUserImpl = addUserImpl;
	}

	@RequestMapping("/insertUser.action")
 public ModelAndView addUser(HttpServletRequest request) throws IOException{
	 ModelAndView modelAndView = new ModelAndView();
	 //获取数据
	 String username = request.getParameter("username");
     String password = request.getParameter("password");
	 int numId = (int) (Math.random()*10);
	 user = new User();
	 user.setUsername(username);
	 user.setPassword(password);
	 user.setId(numId);
	 boolean flag = addUserImpl.addUser(user);
	 List<User> userList = addUserImpl.SelectUser();
	 System.out.println(userList);
	 if(flag==true){
		 modelAndView.addObject("userList", userList);
		 modelAndView.setViewName("addSuccess");
		
	 }else{
		 modelAndView.setViewName("addError");
	 }
	 
	 return modelAndView;
	 
 }
}
