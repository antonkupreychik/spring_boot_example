package com.kupreychik.zulu_boot;

import org.junit.ClassRule;
import org.testcontainers.containers.PostgreSQLContainer;

public class AbstractTest {

    @ClassRule
    protected static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:13.3")
            .withDatabaseName("integration-tests-db")
            .withUsername("sa")
            .withPassword("sa");

}
