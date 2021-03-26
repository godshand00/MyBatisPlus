package com.southwind.mybatisplus.controller;


import com.southwind.mybatisplus.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Leon.King
 * @since 2021-03-19
 */
@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService cs;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("list", cs.list());
        return mav;


    }

}

