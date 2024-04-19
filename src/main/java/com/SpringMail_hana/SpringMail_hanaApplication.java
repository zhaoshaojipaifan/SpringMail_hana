package com.SpringMail_hana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling    // 开启基于注解的定时任务支持
@EnableAsync        // 开启基于注解的异步任务支持
@SpringBootApplication
public class SpringMail_hanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMail_hanaApplication.class, args);
    }

}
