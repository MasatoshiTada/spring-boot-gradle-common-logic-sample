package com.example.uiadmin;

import com.example.commonlogic.CommonLogicConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(CommonLogicConfig.class)
@SpringBootApplication
public class UiAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(UiAdminApplication.class, args);
    }

}
