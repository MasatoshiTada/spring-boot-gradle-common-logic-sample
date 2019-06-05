package com.example.uiuser;

import com.example.commonlogic.CommonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UiUserController {

    private final String commonValue;
    private final String uiUserValue;
    private final CommonService commonService;

    public UiUserController(@Value("${common.value}") String commonValue,
                            @Value("${ui.user.value}") String uiUserValue,
                            CommonService commonService) {
        this.commonValue = commonValue;
        this.uiUserValue = uiUserValue;
        this.commonService = commonService;
    }

    @GetMapping("/")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("common_service", commonService.doSomething());
        map.put("common_value", commonValue);
        map.put("ui_user_value", uiUserValue);
        return map;
    }
}
