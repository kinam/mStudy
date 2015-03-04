package com.study.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/getUserInfo")
    public ModelAndView getUserInfo(HttpServletRequest request) throws Exception{
System.out.println("####################### Controller #################################");
        ModelAndView mav = new ModelAndView("userInfo");
        
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("userId", request.getParameter("userId"));
        paramMap.put("userPw", request.getParameter("userPw"));
        
        HashMap<String, Object> userInfo = userService.selectUserInfo(paramMap);
System.out.println("# userInfo : " + userInfo);
        mav.addObject("userInfo", userInfo);
        
        
        return mav;
    }
}