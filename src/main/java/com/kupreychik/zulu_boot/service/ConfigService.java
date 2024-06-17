package com.kupreychik.zulu_boot.service;

import com.kupreychik.zulu_boot.model.sql.Config;
import com.kupreychik.zulu_boot.repository.jpa.ConfigRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ConfigService {

    private final ConfigRepository configRepository;

    @PostConstruct
    public void init() {
        configRepository.save(new Config("asdasd", "asda"));
        configRepository.save(new Config("asdasd1", "3asda"));
        configRepository.save(new Config("asda2sd", "as4a"));
    }

    public List<Config> getConfig() {
        return configRepository.findAll();
    }

    public Config createConfig(Config config) {
        return configRepository.save(config);
    }
}
