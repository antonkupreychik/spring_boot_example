package com.kupreychik.zulu_boot.repository.redis;

import com.kupreychik.zulu_boot.model.nosql.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
}
