/*
 * This file is generated by jOOQ.
 */
package org.example.jooq.db.autocreated.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.jooq.db.autocreated.Keys;
import org.example.jooq.db.autocreated.Public;
import org.example.jooq.db.autocreated.tables.records.ModelRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class Model extends TableImpl<ModelRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.model</code>
     */
    public static final Model MODEL = new Model();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ModelRecord> getRecordType() {
        return ModelRecord.class;
    }

    /**
     * The column <code>public.model.id</code>.
     */
    public final TableField<ModelRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.model.name</code>.
     */
    public final TableField<ModelRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.model.company</code>.
     */
    public final TableField<ModelRecord, Long> COMPANY = createField(DSL.name("company"), SQLDataType.BIGINT.nullable(false), this, "");

    private Model(Name alias, Table<ModelRecord> aliased) {
        this(alias, aliased, null);
    }

    private Model(Name alias, Table<ModelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.model</code> table reference
     */
    public Model(String alias) {
        this(DSL.name(alias), MODEL);
    }

    /**
     * Create an aliased <code>public.model</code> table reference
     */
    public Model(Name alias) {
        this(alias, MODEL);
    }

    /**
     * Create a <code>public.model</code> table reference
     */
    public Model() {
        this(DSL.name("model"), null);
    }

    public <O extends Record> Model(Table<O> child, ForeignKey<O, ModelRecord> key) {
        super(child, key, MODEL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<ModelRecord, Integer> getIdentity() {
        return (Identity<ModelRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ModelRecord> getPrimaryKey() {
        return Keys.MODEL_PKEY;
    }

    @Override
    public List<ForeignKey<ModelRecord, ?>> getReferences() {
        return Arrays.asList(Keys.MODEL__MODEL_COMPANY_FKEY);
    }

    private transient Company _company;

    /**
     * Get the implicit join path to the <code>public.company</code> table.
     */
    public Company company() {
        if (_company == null)
            _company = new Company(this, Keys.MODEL__MODEL_COMPANY_FKEY);

        return _company;
    }

    @Override
    public Model as(String alias) {
        return new Model(DSL.name(alias), this);
    }

    @Override
    public Model as(Name alias) {
        return new Model(alias, this);
    }

    @Override
    public Model as(Table<?> alias) {
        return new Model(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Model rename(String name) {
        return new Model(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Model rename(Name name) {
        return new Model(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Model rename(Table<?> name) {
        return new Model(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}