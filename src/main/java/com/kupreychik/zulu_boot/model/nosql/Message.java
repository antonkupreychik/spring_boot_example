package com.kupreychik.zulu_boot.model.nosql;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@Builder
@RedisHash("Message")
public class Message implements Serializable {
    private String id;
    @Getter
    private String message;
}
