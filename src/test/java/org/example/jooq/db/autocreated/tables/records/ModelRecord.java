/*
 * This file is generated by jOOQ.
 */
package org.example.jooq.db.autocreated.tables.records;


import org.example.jooq.db.autocreated.tables.Model;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModelRecord extends UpdatableRecordImpl<ModelRecord> implements Record3<Long, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>jooq_DB.model.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq_DB.model.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jooq_DB.model.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq_DB.model.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq_DB.model.company</code>.
     */
    public void setCompany(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq_DB.model.company</code>.
     */
    public Long getCompany() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Model.MODEL.ID;
    }

    @Override
    public Field<String> field2() {
        return Model.MODEL.NAME;
    }

    @Override
    public Field<Long> field3() {
        return Model.MODEL.COMPANY;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long component3() {
        return getCompany();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Long value3() {
        return getCompany();
    }

    @Override
    public ModelRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ModelRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ModelRecord value3(Long value) {
        setCompany(value);
        return this;
    }

    @Override
    public ModelRecord values(Long value1, String value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ModelRecord
     */
    public ModelRecord() {
        super(Model.MODEL);
    }

    /**
     * Create a detached, initialised ModelRecord
     */
    public ModelRecord(Long id, String name, Long company) {
        super(Model.MODEL);

        setId(id);
        setName(name);
        setCompany(company);
        resetChangedOnNotNull();
    }
}
