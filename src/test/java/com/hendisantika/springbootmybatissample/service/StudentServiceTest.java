package com.hendisantika.springbootmybatissample.service;

import com.github.pagehelper.Page;
import com.hendisantika.springbootmybatissample.entity.Student;
import lombok.extern.apachecommons.CommonsLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mybatis-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/09/18
 * Time: 20.16
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringRunner.class)
@CommonsLog
@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void testFindByPage() {
        Page<Student> students = studentService.findByPage(1, 2);//Query pageNo=1, pageSize=2
        assertEquals(students.getTotal(), 5);
        assertEquals(students.getPages(), 3);
        log.debug(students.toString());
    }
}