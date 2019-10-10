package com.fpms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : YongBiao Liao
 * @date   : 2019/6/12 9:36
 */
@SpringBootApplication
@MapperScan("com.fpms.dao")
public class FpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FpmsApplication.class, args);
    }

}
