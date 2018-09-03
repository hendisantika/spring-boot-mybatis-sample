package com.hendisantika.springbootmybatissample.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hendisantika.springbootmybatissample.entity.Student;
import com.hendisantika.springbootmybatissample.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mybatis-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/09/18
 * Time: 20.10
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional(readOnly = true)
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;


    public Page<Student> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return studentMapper.findByPage();
    }

}