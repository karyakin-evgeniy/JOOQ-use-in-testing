/*
 * This file is generated by jOOQ.
 */
package org.example.jooq.db.autocreated;


import java.util.Arrays;
import java.util.List;

import org.example.jooq.db.autocreated.tables.Airplane;
import org.example.jooq.db.autocreated.tables.Company;
import org.example.jooq.db.autocreated.tables.Databasechangelog;
import org.example.jooq.db.autocreated.tables.Databasechangeloglock;
import org.example.jooq.db.autocreated.tables.Flight;
import org.example.jooq.db.autocreated.tables.Model;
import org.example.jooq.db.autocreated.tables.Passenger;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.airplane</code>.
     */
    public final Airplane AIRPLANE = Airplane.AIRPLANE;

    /**
     * The table <code>public.company</code>.
     */
    public final Company COMPANY = Company.COMPANY;

    /**
     * The table <code>public.databasechangelog</code>.
     */
    public final Databasechangelog DATABASECHANGELOG = Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>public.databasechangeloglock</code>.
     */
    public final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>public.flight</code>.
     */
    public final Flight FLIGHT = Flight.FLIGHT;

    /**
     * The table <code>public.model</code>.
     */
    public final Model MODEL = Model.MODEL;

    /**
     * The table <code>public.passenger</code>.
     */
    public final Passenger PASSENGER = Passenger.PASSENGER;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Airplane.AIRPLANE,
            Company.COMPANY,
            Databasechangelog.DATABASECHANGELOG,
            Databasechangeloglock.DATABASECHANGELOGLOCK,
            Flight.FLIGHT,
            Model.MODEL,
            Passenger.PASSENGER
        );
    }
}
