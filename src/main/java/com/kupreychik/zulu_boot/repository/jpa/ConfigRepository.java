package com.kupreychik.zulu_boot.repository.jpa;

import com.kupreychik.zulu_boot.model.sql.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Long> {
}
