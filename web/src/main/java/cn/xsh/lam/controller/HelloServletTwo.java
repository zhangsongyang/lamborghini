package cn.xsh.lam.controller;

import java.io.IOException;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import cn.xsh.lam.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;  
import org.springframework.stereotype.Controller;


  
@Controller  
@Scope("prototype")  
public class HelloServletTwo extends HttpServlet {  
  
  
	private static final long serialVersionUID = 1L;
	private BaseService baseService;  
      
    @Autowired  
    public void setUserService(BaseService baseService) {
        this.baseService = baseService;  
    }  
  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        System.out.println("Get@@@");  
        baseService.saveService(); 
    }  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        System.out.println("Post");  
        baseService.saveService();
    }  
  
}  

