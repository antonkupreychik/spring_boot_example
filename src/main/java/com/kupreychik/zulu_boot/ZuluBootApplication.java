package com.kupreychik.zulu_boot;

import com.kupreychik.zulu_boot.model.nosql.Message;
import com.kupreychik.zulu_boot.model.sql.Config;
import com.kupreychik.zulu_boot.repository.mongo.ConfigMongoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableMongoRepositories(basePackages = "com.kupreychik.zulu_boot.repository.mongo")
@EnableJpaRepositories(basePackages = "com.kupreychik.zulu_boot.repository.jpa")
@EnableRedisRepositories(basePackages = "com.kupreychik.zulu_boot.repository.redis")

@SpringBootApplication
public class ZuluBootApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(ZuluBootApplication.class, args);

        var mongoRepository = context.getBean(ConfigMongoRepository.class);
        var configs = mongoRepository.findAll();
        System.out.println(configs);


        /*  postgres
        var configRepository = context.getBean(ConfigRepository.class);

        var systemConfig1 = buildConfig("PARAM1_15", "tr11u1e");
        var systemConfig2 = buildConfig("PARA1M1_6", "fa11k1se");
        var systemConfig3 = buildConfig("PARA1M1_7", "fa11l1se");
        var systemConfig4 = buildConfig("PARA1M1_8", "tr111ue2");

        configRepository.saveAll(List.of(systemConfig1, systemConfig2, systemConfig3, systemConfig4));

        var config = configRepository.findAll();
        System.out.println(config);
        */


       /*  redis
       var messageRepository = context.getBean(MessageRepository.class);
        var message1 = buildMessage("jsdaflksj");
        var message2 = buildMessage("jsdaflsdfsdfksj");
        var message3 = buildMessage("fsdf");
        var message4 = buildMessage("jsdafsdfsdlksj");
        var message5 = buildMessage("jsdafasalksj");

        messageRepository.saveAll(List.of(message1, message2, message3, message4, message5));
        */
    }

    private static Config buildConfig(String name, String value) {
        return Config.builder()
                .name(name)
                .value(value)
                .build();
    }

    private static Message buildMessage(String message) {
        return Message.builder()
                .message(message)
                .build();
    }
}
