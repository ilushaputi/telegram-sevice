package ru.putintsev.rogaandkopyta.telegramservice.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = PressureMeasurement.TABLE_NAME, schema = "telegram_schema")
@SequenceGenerator(schema = "telegram_schema", name = "pressure_measurement_s", sequenceName = "telegram_schema.pressure_measurement_s", allocationSize = 1)
public class PressureMeasurement extends BusinessEntity {
    public static final String TABLE_NAME = "pressure_measurement";
    public static final String COLUMN_MEASUREMENTD_NAME = "measurement_d";
    public static final String COLUMN_PERSONID_NAME = "person_id";
    public static final String COLUMN_UPPRESSURE_NAME = "up_pressure";
    public static final String COLUMN_DOWNPRESSURE_NAME = "down_pressure";


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = COLUMN_MEASUREMENTD_NAME)
    private Long measurementD;

    @Column(name = COLUMN_PERSONID_NAME)
    private Long personId;

    @Column(name = COLUMN_UPPRESSURE_NAME)
    private Short upPressure;

    @Column(name = COLUMN_DOWNPRESSURE_NAME)
    private Short downPressure;

}