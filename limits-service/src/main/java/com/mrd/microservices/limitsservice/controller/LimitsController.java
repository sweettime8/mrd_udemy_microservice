package com.mrd.microservices.limitsservice.controller;

import com.mrd.microservices.limitsservice.bean.Limits;
import com.mrd.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ducnh
 */
@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrievelLimits() {
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
