package ru.putintsev.rogaandkopyta.telegramservice.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class BusinessEntity {

    public static final String COLUMN_CREATIONDATE_NAME = "creation_date";
    public static final String COLUMN_LASTUPDATEDATE_NAME = "last_update_date";


    @Column(name = COLUMN_CREATIONDATE_NAME)
    private LocalDateTime creationDate;

    @Column(name = COLUMN_LASTUPDATEDATE_NAME)
    private LocalDateTime lastUpdateDate;

    @PrePersist
    public void prePersist() {
        this.creationDate = LocalDateTime.now();
        this.lastUpdateDate = LocalDateTime.now();
    }
}
