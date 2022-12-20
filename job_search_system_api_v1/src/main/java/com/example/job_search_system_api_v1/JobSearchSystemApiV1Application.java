package com.example.job_search_system_api_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//        (exclude = {DataSourceAutoConfiguration.class,
//        SqlInitializationAutoConfiguration.class}, scanBasePackages = {"com.example.job_search_system_api_v1"})
public class JobSearchSystemApiV1Application {

    public static void main(String[] args) {
        SpringApplication.run(JobSearchSystemApiV1Application.class, args);
    }

}
