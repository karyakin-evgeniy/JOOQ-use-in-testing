/*
 * This file is generated by jOOQ.
 */
package org.example.jooq.db.autocreated.tables;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.jooq.db.autocreated.Keys;
import org.example.jooq.db.autocreated.Public;
import org.example.jooq.db.autocreated.tables.records.AirplaneRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Airplane extends TableImpl<AirplaneRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.airplane</code>
     */
    public static final Airplane AIRPLANE = new Airplane();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AirplaneRecord> getRecordType() {
        return AirplaneRecord.class;
    }

    /**
     * The column <code>public.airplane.id</code>.
     */
    public final TableField<AirplaneRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.airplane.number</code>.
     */
    public final TableField<AirplaneRecord, String> NUMBER = createField(DSL.name("number"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.airplane.model</code>.
     */
    public final TableField<AirplaneRecord, Long> MODEL = createField(DSL.name("model"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.airplane.release</code>.
     */
    public final TableField<AirplaneRecord, LocalDate> RELEASE = createField(DSL.name("release"), SQLDataType.LOCALDATE, this, "");

    private Airplane(Name alias, Table<AirplaneRecord> aliased) {
        this(alias, aliased, null);
    }

    private Airplane(Name alias, Table<AirplaneRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.airplane</code> table reference
     */
    public Airplane(String alias) {
        this(DSL.name(alias), AIRPLANE);
    }

    /**
     * Create an aliased <code>public.airplane</code> table reference
     */
    public Airplane(Name alias) {
        this(alias, AIRPLANE);
    }

    /**
     * Create a <code>public.airplane</code> table reference
     */
    public Airplane() {
        this(DSL.name("airplane"), null);
    }

    public <O extends Record> Airplane(Table<O> child, ForeignKey<O, AirplaneRecord> key) {
        super(child, key, AIRPLANE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<AirplaneRecord, Integer> getIdentity() {
        return (Identity<AirplaneRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<AirplaneRecord> getPrimaryKey() {
        return Keys.AIRPLANE_PKEY;
    }

    @Override
    public List<ForeignKey<AirplaneRecord, ?>> getReferences() {
        return Arrays.asList(Keys.AIRPLANE__AIRPLANE_MODEL_FKEY);
    }

    private transient Model _model;

    /**
     * Get the implicit join path to the <code>public.model</code> table.
     */
    public Model model() {
        if (_model == null)
            _model = new Model(this, Keys.AIRPLANE__AIRPLANE_MODEL_FKEY);

        return _model;
    }

    @Override
    public Airplane as(String alias) {
        return new Airplane(DSL.name(alias), this);
    }

    @Override
    public Airplane as(Name alias) {
        return new Airplane(alias, this);
    }

    @Override
    public Airplane as(Table<?> alias) {
        return new Airplane(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Airplane rename(String name) {
        return new Airplane(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Airplane rename(Name name) {
        return new Airplane(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Airplane rename(Table<?> name) {
        return new Airplane(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Long, LocalDate> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super Long, ? super LocalDate, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super Long, ? super LocalDate, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
