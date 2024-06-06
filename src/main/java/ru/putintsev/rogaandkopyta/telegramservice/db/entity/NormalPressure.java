package ru.putintsev.rogaandkopyta.telegramservice.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = NormalPressure.TABLE_NAME, schema = "telegram_schema")
@SequenceGenerator(schema = "telegram_schema", name = "normal_pressure_s", sequenceName = "telegram_schema.normal_pressure_s", allocationSize = 1)
public class NormalPressure extends BusinessEntity {
    public static final String TABLE_NAME = "normal_pressure";
    public static final String COLUMN_NORMALPRESSUREID_NAME = "normal_pressure_id";
    public static final String COLUMN_PERSONID_NAME = "person_id";
    public static final String COLUMN_NORMALUPPRESSURE_NAME = "normal_up_pressure";
    public static final String COLUMN_NORMALDOWNPRESSURE_NAME = "normal_down_pressure";


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = COLUMN_NORMALPRESSUREID_NAME)
    private Long normalPressureId;

    @Column(name = COLUMN_PERSONID_NAME)
    private Long personId;

    @Column(name = COLUMN_NORMALUPPRESSURE_NAME)
    private Short normalUpPressure;

    @Column(name = COLUMN_NORMALDOWNPRESSURE_NAME)
    private Short normalDownPressure;

}