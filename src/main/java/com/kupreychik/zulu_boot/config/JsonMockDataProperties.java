package com.kupreychik.zulu_boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "jsonplaceholder")
public class JsonMockDataProperties {
    private boolean enabled;
    private String url;
    private String posts;
    private String albums;
}
