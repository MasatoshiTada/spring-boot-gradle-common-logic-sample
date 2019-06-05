package com.example.uiuser;

import com.example.commonlogic.CommonLogicConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(CommonLogicConfig.class)
@SpringBootApplication
public class UiUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UiUserApplication.class, args);
    }

}
