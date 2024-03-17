/*
 * This file is generated by jOOQ.
 */
package org.example.jooq.db.autocreated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.jooq.db.autocreated.Keys;
import org.example.jooq.db.autocreated.Public;
import org.example.jooq.db.autocreated.tables.records.FlightRecord;
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
public class Flight extends TableImpl<FlightRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.flight</code>
     */
    public static final Flight FLIGHT = new Flight();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FlightRecord> getRecordType() {
        return FlightRecord.class;
    }

    /**
     * The column <code>public.flight.id</code>.
     */
    public final TableField<FlightRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.flight.passenger</code>.
     */
    public final TableField<FlightRecord, Long> PASSENGER = createField(DSL.name("passenger"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.flight.airplane</code>.
     */
    public final TableField<FlightRecord, Long> AIRPLANE = createField(DSL.name("airplane"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.flight.datetime</code>.
     */
    public final TableField<FlightRecord, LocalDateTime> DATETIME = createField(DSL.name("datetime"), SQLDataType.LOCALDATETIME(6), this, "");

    private Flight(Name alias, Table<FlightRecord> aliased) {
        this(alias, aliased, null);
    }

    private Flight(Name alias, Table<FlightRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.flight</code> table reference
     */
    public Flight(String alias) {
        this(DSL.name(alias), FLIGHT);
    }

    /**
     * Create an aliased <code>public.flight</code> table reference
     */
    public Flight(Name alias) {
        this(alias, FLIGHT);
    }

    /**
     * Create a <code>public.flight</code> table reference
     */
    public Flight() {
        this(DSL.name("flight"), null);
    }

    public <O extends Record> Flight(Table<O> child, ForeignKey<O, FlightRecord> key) {
        super(child, key, FLIGHT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<FlightRecord, Integer> getIdentity() {
        return (Identity<FlightRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<FlightRecord> getPrimaryKey() {
        return Keys.FLIGHT_PKEY;
    }

    @Override
    public List<ForeignKey<FlightRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FLIGHT__FLIGHT_PASSENGER_FKEY, Keys.FLIGHT__FLIGHT_AIRPLANE_FKEY);
    }

    private transient Passenger _passenger;
    private transient Airplane _airplane;

    /**
     * Get the implicit join path to the <code>public.passenger</code> table.
     */
    public Passenger passenger() {
        if (_passenger == null)
            _passenger = new Passenger(this, Keys.FLIGHT__FLIGHT_PASSENGER_FKEY);

        return _passenger;
    }

    /**
     * Get the implicit join path to the <code>public.airplane</code> table.
     */
    public Airplane airplane() {
        if (_airplane == null)
            _airplane = new Airplane(this, Keys.FLIGHT__FLIGHT_AIRPLANE_FKEY);

        return _airplane;
    }

    @Override
    public Flight as(String alias) {
        return new Flight(DSL.name(alias), this);
    }

    @Override
    public Flight as(Name alias) {
        return new Flight(alias, this);
    }

    @Override
    public Flight as(Table<?> alias) {
        return new Flight(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Flight rename(String name) {
        return new Flight(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Flight rename(Name name) {
        return new Flight(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Flight rename(Table<?> name) {
        return new Flight(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Long, Long, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super Long, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super Long, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}