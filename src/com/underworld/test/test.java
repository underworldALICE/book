package com.underworld.test;


import com.underworld.utils.JdbcUtils;
import org.junit.Test;

public class test {
    /**
     * 测试数据库连接
     */
    @Test
    public void testJdbcUtils(){
        System.out.println(JdbcUtils.getConnection());
    }



}
