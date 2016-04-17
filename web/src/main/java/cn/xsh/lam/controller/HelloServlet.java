package cn.xsh.lam.controller;

import java.io.IOException;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

import cn.xsh.lam.entity.Car;
import cn.xsh.lam.entity.Person;
import cn.xsh.lam.entity.UserBean;
import cn.xsh.lam.service.BaseService;
import cn.xsh.lam.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;  
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.WebApplicationContextUtils;


@Controller
@Scope("prototype")  
public class HelloServlet extends HttpServlet {  
  
	private static final long serialVersionUID = 1L;
	private BaseService baseService;

//    @Autowired
//    private UserBean userBean;

    @Autowired  
    public void setUserService(BaseService baseService) {
        this.baseService = baseService;  
    }  
  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        System.out.println("Get111");
        UserBean userBean = SpringUtils.getBean("userBean");
        System.out.println(userBean.toString());

        Person person = SpringUtils.getBean("person");
        System.out.println("person: " + person);

        Person person1 = SpringUtils.getBean("person1");
        System.out.println("person1: " + person1);

//        Person person2 = SpringUtils.getBean("person2");
//        System.out.println("person2: " + person2);

        Person person3 = SpringUtils.getBean("person3");
        System.out.println("person3: " + person3);

        Person person4 = SpringUtils.getBean("person4");
        System.out.println("person4: " + person4);

        Car car2 = SpringUtils.getBean("car2");
        Car car3 = SpringUtils.getBean("car2");
        System.out.println("car2 or car3 : " + (car2 == car3));

        Person person5 = SpringUtils.getBean("person5");
        System.out.println("person5: " + person5);

        UserBean userBean1 = SpringUtils.getBean("userBean1");
        System.out.println("userBean1: " + userBean1.toString());
        System.out.println("userBean1 or userBean: " + (userBean == userBean1));

        Car car4 = SpringUtils.getBean("car4");
        System.out.println("car4: " + car4);

        Car car5 = SpringUtils.getBean("car5");
        System.out.println("car5: " + car5);

        Car car6 = SpringUtils.getBean("car6");
        System.out.println("car6: " + car6);

        baseService.saveService();
    }  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        System.out.println("Post");  
        baseService.saveService();
    }  
  
}  

