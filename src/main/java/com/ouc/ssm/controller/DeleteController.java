package com.ouc.ssm.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ouc.ssm.daoImp.DeleteUserImp;

/**
*@title：DeleteController.java
* @author：被抛弃的猫咪
* @version：1.0
* @date：2017年9月7日 上午10:09:26
* @description：
*/
@Controller
public class DeleteController {
 private DeleteUserImp deleteUserImp;
//使用set方法进行对象的注入
public void setDeleteUserImp(DeleteUserImp deleteUserImp) {
	this.deleteUserImp = deleteUserImp;
}
@RequestMapping("/deleteUser.action")
 public ModelAndView DeleteUser(HttpServletRequest request) throws IOException{
	 ModelAndView modelAndView = new ModelAndView();
	 String str_id = request.getParameter("id");
	 int id = Integer.parseInt(str_id);
	 deleteUserImp.deleteUser(id);
	 modelAndView.setViewName("delete/deleteSuccess");
	return modelAndView;
	 
 }
}
