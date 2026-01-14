package com.pradolabs.spring_boot_rate_limiting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String testRateLimit() {
        return "Request Successful!";
    }
}
