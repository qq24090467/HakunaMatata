package com.yahoo.hakunamatata.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.yahoo.hakunamatata.dao.Picture;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table PICTURE.
*/
public class PictureDao extends AbstractDao<Picture, Long> {

    public static final String TABLENAME = "PICTURE";

    /**
     * Properties of entity Picture.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property InternalId = new Property(0, Long.class, "internalId", true, "INTERNAL_ID");
        public final static Property Id = new Property(1, String.class, "id", false, "ID");
        public final static Property Url = new Property(2, String.class, "url", false, "URL");
    };


    public PictureDao(DaoConfig config) {
        super(config);
    }
    
    public PictureDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'PICTURE' (" + //
                "'INTERNAL_ID' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: internalId
                "'ID' TEXT," + // 1: id
                "'URL' TEXT);"); // 2: url
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'PICTURE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Picture entity) {
        stmt.clearBindings();
 
        Long internalId = entity.getInternalId();
        if (internalId != null) {
            stmt.bindLong(1, internalId);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(3, url);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Picture readEntity(Cursor cursor, int offset) {
        Picture entity = new Picture( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // internalId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // url
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Picture entity, int offset) {
        entity.setInternalId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Picture entity, long rowId) {
        entity.setInternalId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Picture entity) {
        if(entity != null) {
            return entity.getInternalId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
