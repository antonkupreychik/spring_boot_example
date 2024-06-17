package com.kupreychik.zulu_boot.model.sql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@Entity
@Table(name = "config")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SequenceGenerator(name = "config_id_seq", sequenceName = "config_id_seq", allocationSize = 1)
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "config_id_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "vall")
    private String value;

    public Config(String name, String value) {
        this.name = name;
        this.value = value;
    }
}