package com.example.uiadmin;

import com.example.commonlogic.CommonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UiAdminController {

    private final String commonValue;
    private final String uiAdminValue;
    private final CommonService commonService;

    public UiAdminController(@Value("${common.value}") String commonValue,
                             @Value("${ui.admin.value}") String uiAdminValue,
                             CommonService commonService) {
        this.commonValue = commonValue;
        this.uiAdminValue = uiAdminValue;
        this.commonService = commonService;
    }

    @GetMapping("/")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("common_service", commonService.doSomething());
        map.put("common_value", commonValue);
        map.put("ui_admin_value", uiAdminValue);
        return map;
    }
}
