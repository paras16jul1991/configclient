package com.test.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigResource {
    @Autowired
ConfigService configService;

@GetMapping("/property/{propName}")
public Object getMessage(@PathVariable("propName") String propertyName){
return configService.getPropertyAsString(propertyName);
}
}
