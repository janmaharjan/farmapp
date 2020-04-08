/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Maharjan
 */
@Controller
@RequestMapping(value="/setup")
public class SetUpController {
    @Autowired
    private JdbcTemplate template;
    @GetMapping
    @ResponseBody
    public String index()
    {
        String sql;
      /*  String sql="create table tbl_customers("
                +"id int primary key, name varchar(50),"
                +"status boolean default true)";
        template.execute(sql); 
*/
        sql="insert into tbl_customers(id,name) values ('5','jan babu')";
        template.execute(sql);
        return "sucess";
    }
}
