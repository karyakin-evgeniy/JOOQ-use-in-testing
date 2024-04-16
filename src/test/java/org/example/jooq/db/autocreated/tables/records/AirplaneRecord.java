/*
 * This file is generated by jOOQ.
 */
package org.example.jooq.db.autocreated.tables.records;


import java.time.LocalDate;

import org.example.jooq.db.autocreated.tables.Airplane;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirplaneRecord extends UpdatableRecordImpl<AirplaneRecord> implements Record4<Long, String, Long, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>jooq_DB.airplane.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq_DB.airplane.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jooq_DB.airplane.number</code>.
     */
    public void setNumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq_DB.airplane.number</code>.
     */
    public String getNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq_DB.airplane.model</code>.
     */
    public void setModel(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq_DB.airplane.model</code>.
     */
    public Long getModel() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>jooq_DB.airplane.released</code>.
     */
    public void setReleased(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq_DB.airplane.released</code>.
     */
    public LocalDate getReleased() {
        return (LocalDate) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, Long, LocalDate> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, Long, LocalDate> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Airplane.AIRPLANE.ID;
    }

    @Override
    public Field<String> field2() {
        return Airplane.AIRPLANE.NUMBER;
    }

    @Override
    public Field<Long> field3() {
        return Airplane.AIRPLANE.MODEL;
    }

    @Override
    public Field<LocalDate> field4() {
        return Airplane.AIRPLANE.RELEASED;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getNumber();
    }

    @Override
    public Long component3() {
        return getModel();
    }

    @Override
    public LocalDate component4() {
        return getReleased();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getNumber();
    }

    @Override
    public Long value3() {
        return getModel();
    }

    @Override
    public LocalDate value4() {
        return getReleased();
    }

    @Override
    public AirplaneRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AirplaneRecord value2(String value) {
        setNumber(value);
        return this;
    }

    @Override
    public AirplaneRecord value3(Long value) {
        setModel(value);
        return this;
    }

    @Override
    public AirplaneRecord value4(LocalDate value) {
        setReleased(value);
        return this;
    }

    @Override
    public AirplaneRecord values(Long value1, String value2, Long value3, LocalDate value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AirplaneRecord
     */
    public AirplaneRecord() {
        super(Airplane.AIRPLANE);
    }

    /**
     * Create a detached, initialised AirplaneRecord
     */
    public AirplaneRecord(Long id, String number, Long model, LocalDate released) {
        super(Airplane.AIRPLANE);

        setId(id);
        setNumber(number);
        setModel(model);
        setReleased(released);
        resetChangedOnNotNull();
    }
}
