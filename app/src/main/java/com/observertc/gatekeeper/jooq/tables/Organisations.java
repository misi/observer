/*
 * This file is generated by jOOQ.
 */
package com.observertc.gatekeeper.jooq.tables;


import com.observertc.gatekeeper.jooq.Keys;
import com.observertc.gatekeeper.jooq.Observertc;
import com.observertc.gatekeeper.jooq.tables.records.OrganisationsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Organizations
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Organisations extends TableImpl<OrganisationsRecord> {

    private static final long serialVersionUID = 233172568;

    /**
     * The reference instance of <code>ObserveRTC.Organisations</code>
     */
    public static final Organisations ORGANISATIONS = new Organisations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganisationsRecord> getRecordType() {
        return OrganisationsRecord.class;
    }

    /**
     * The column <code>ObserveRTC.Organisations.id</code>. The identifier of the organization for inside relations, never outside
     */
    public final TableField<OrganisationsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "The identifier of the organization for inside relations, never outside");

    /**
     * The column <code>ObserveRTC.Organisations.uuid</code>. The UUID of the organization published outside 
     */
    public final TableField<OrganisationsRecord, byte[]> UUID = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.BINARY(16), this, "The UUID of the organization published outside ");

    /**
     * The column <code>ObserveRTC.Organisations.name</code>. The name of the organization
     */
    public final TableField<OrganisationsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "The name of the organization");

    /**
     * The column <code>ObserveRTC.Organisations.description</code>. The description for the organization
     */
    public final TableField<OrganisationsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "The description for the organization");

    /**
     * Create a <code>ObserveRTC.Organisations</code> table reference
     */
    public Organisations() {
        this(DSL.name("Organisations"), null);
    }

    /**
     * Create an aliased <code>ObserveRTC.Organisations</code> table reference
     */
    public Organisations(String alias) {
        this(DSL.name(alias), ORGANISATIONS);
    }

    /**
     * Create an aliased <code>ObserveRTC.Organisations</code> table reference
     */
    public Organisations(Name alias) {
        this(alias, ORGANISATIONS);
    }

    private Organisations(Name alias, Table<OrganisationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Organisations(Name alias, Table<OrganisationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Organizations"), TableOptions.table());
    }

    public <O extends Record> Organisations(Table<O> child, ForeignKey<O, OrganisationsRecord> key) {
        super(child, key, ORGANISATIONS);
    }

    @Override
    public Schema getSchema() {
        return Observertc.OBSERVERTC;
    }

    @Override
    public Identity<OrganisationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORGANISATIONS;
    }

    @Override
    public UniqueKey<OrganisationsRecord> getPrimaryKey() {
        return Keys.KEY_ORGANISATIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrganisationsRecord>> getKeys() {
        return Arrays.<UniqueKey<OrganisationsRecord>>asList(Keys.KEY_ORGANISATIONS_PRIMARY, Keys.KEY_ORGANISATIONS_UUID, Keys.KEY_ORGANISATIONS_NAME);
    }

    @Override
    public Organisations as(String alias) {
        return new Organisations(DSL.name(alias), this);
    }

    @Override
    public Organisations as(Name alias) {
        return new Organisations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Organisations rename(String name) {
        return new Organisations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Organisations rename(Name name) {
        return new Organisations(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, byte[], String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
