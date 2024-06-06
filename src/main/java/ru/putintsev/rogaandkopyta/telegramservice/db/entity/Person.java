package ru.putintsev.rogaandkopyta.telegramservice.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = Person.TABLE_NAME, schema = "telegram_schema")
@SequenceGenerator(schema = "telegram_schema", name = "person_s", sequenceName = "telegram_schema.person_s", allocationSize = 1)
public class Person extends BusinessEntity {
    public static final String TABLE_NAME = "person";
    public static final String COLUMN_PERSONID_NAME = "person_id";
    public static final String COLUMN_CHATID_NAME = "chat_id";
    public static final String COLUMN_PERSONNAME_NAME = "person_name";


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = COLUMN_PERSONID_NAME)
    private Long personId;

    @Column(name = COLUMN_CHATID_NAME)
    private Long chatId;

    @Column(name = COLUMN_PERSONNAME_NAME, length = 250)
    private String personName;

}