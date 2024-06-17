package com.kupreychik.zulu_boot.service;

import com.kupreychik.zulu_boot.AbstractTest;
import com.kupreychik.zulu_boot.model.sql.Config;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConfigServiceTest extends AbstractTest {

    @Autowired
    protected ConfigService configService;

    @Test
    void should_return_three_default_configs() {
        List<Config> configs = configService.getConfig();
        assertEquals(3, configs.size());

        Config newConfig = Config.builder()
                .value("adsad12312s")
                .name("sdfsdfs")
                .build();

        configService.createConfig(newConfig);

        configs = configService.getConfig();
        assertEquals(4, configs.size());
    }
}