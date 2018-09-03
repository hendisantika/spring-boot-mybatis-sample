package com.hendisantika.springbootmybatissample.controller;

import com.github.pagehelper.Page;
import com.hendisantika.springbootmybatissample.entity.DataTableResultInfo;
import com.hendisantika.springbootmybatissample.entity.Student;
import com.hendisantika.springbootmybatissample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mybatis-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/09/18
 * Time: 20.11
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/students")
public class StudentRestController {
    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/queryByPage", method = RequestMethod.GET)
    public DataTableResultInfo queryByPage(
            @RequestParam(value = "start", required = false, defaultValue = "0") Integer start,
            @RequestParam(value = "length", required = false, defaultValue = "10") Integer length,
            @RequestParam(value = "draw", required = false, defaultValue = "0") Integer draw) {
        int pageNo = (start) / length + 1;
        Page<Student> pageInfo = studentService.findByPage(pageNo, length);
        DataTableResultInfo dataTableResultInfo = new DataTableResultInfo();
        dataTableResultInfo.setData(pageInfo);
        dataTableResultInfo.setDraw(draw);
        dataTableResultInfo.setLength(length);
        dataTableResultInfo.setRecordsTotal(pageInfo.getTotal());
        dataTableResultInfo.setRecordsFiltered(pageInfo.getTotal());
        return dataTableResultInfo;
    }
}