package com.hendisantika.springbootmybatissample.entity;

import com.github.pagehelper.Page;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mybatis-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/09/18
 * Time: 20.04
 * To change this template use File | Settings | File Templates.
 */
@Data
public class DataTableResultInfo {
    private Page<Student> data;
    private int draw;//the NO.of requests
    private int length;
    private long recordsTotal;
    private long recordsFiltered;
}