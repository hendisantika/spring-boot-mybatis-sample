package com.hendisantika.springbootmybatissample.mapper;

import com.github.pagehelper.Page;
import com.hendisantika.springbootmybatissample.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mybatis-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/09/18
 * Time: 20.05
 * To change this template use File | Settings | File Templates.
 */
@Mapper
public interface StudentMapper {

    Page<Student> findByPage();
}