package com.yahoo.hakunamatata.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import com.yahoo.hakunamatata.dao.Post;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table POST.
*/
public class PostDao extends AbstractDao<Post, Long> {

    public static final String TABLENAME = "POST";

    /**
     * Properties of entity Post.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property InternalId = new Property(0, Long.class, "internalId", true, "INTERNAL_ID");
        public final static Property Id = new Property(1, String.class, "id", false, "ID");
        public final static Property Created_time = new Property(2, java.util.Date.class, "created_time", false, "CREATED_TIME");
        public final static Property Message = new Property(3, String.class, "message", false, "MESSAGE");
        public final static Property Type = new Property(4, String.class, "type", false, "TYPE");
        public final static Property Picture = new Property(5, String.class, "picture", false, "PICTURE");
        public final static Property Full_picture = new Property(6, String.class, "full_picture", false, "FULL_PICTURE");
        public final static Property Link = new Property(7, String.class, "link", false, "LINK");
        public final static Property PostUserIdMapping = new Property(8, Long.class, "postUserIdMapping", false, "POST_USER_ID_MAPPING");
        public final static Property PostLikeIdMapping = new Property(9, Long.class, "postLikeIdMapping", false, "POST_LIKE_ID_MAPPING");
    };

    private DaoSession daoSession;


    public PostDao(DaoConfig config) {
        super(config);
    }
    
    public PostDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'POST' (" + //
                "'INTERNAL_ID' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: internalId
                "'ID' TEXT," + // 1: id
                "'CREATED_TIME' INTEGER," + // 2: created_time
                "'MESSAGE' TEXT," + // 3: message
                "'TYPE' TEXT," + // 4: type
                "'PICTURE' TEXT," + // 5: picture
                "'FULL_PICTURE' TEXT," + // 6: full_picture
                "'LINK' TEXT," + // 7: link
                "'POST_USER_ID_MAPPING' INTEGER," + // 8: postUserIdMapping
                "'POST_LIKE_ID_MAPPING' INTEGER);"); // 9: postLikeIdMapping
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'POST'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Post entity) {
        stmt.clearBindings();
 
        Long internalId = entity.getInternalId();
        if (internalId != null) {
            stmt.bindLong(1, internalId);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        java.util.Date created_time = entity.getCreated_time();
        if (created_time != null) {
            stmt.bindLong(3, created_time.getTime());
        }
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(4, message);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(5, type);
        }
 
        String picture = entity.getPicture();
        if (picture != null) {
            stmt.bindString(6, picture);
        }
 
        String full_picture = entity.getFull_picture();
        if (full_picture != null) {
            stmt.bindString(7, full_picture);
        }
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(8, link);
        }
 
        Long postUserIdMapping = entity.getPostUserIdMapping();
        if (postUserIdMapping != null) {
            stmt.bindLong(9, postUserIdMapping);
        }
 
        Long postLikeIdMapping = entity.getPostLikeIdMapping();
        if (postLikeIdMapping != null) {
            stmt.bindLong(10, postLikeIdMapping);
        }
    }

    @Override
    protected void attachEntity(Post entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Post readEntity(Cursor cursor, int offset) {
        Post entity = new Post( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // internalId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // created_time
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // message
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // type
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // picture
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // full_picture
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // link
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // postUserIdMapping
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9) // postLikeIdMapping
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Post entity, int offset) {
        entity.setInternalId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCreated_time(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setMessage(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setType(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPicture(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFull_picture(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setLink(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPostUserIdMapping(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setPostLikeIdMapping(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Post entity, long rowId) {
        entity.setInternalId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Post entity) {
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
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getUserDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getLikeDao().getAllColumns());
            builder.append(" FROM POST T");
            builder.append(" LEFT JOIN USER T0 ON T.'POST_USER_ID_MAPPING'=T0.'INTERNAL_ID'");
            builder.append(" LEFT JOIN LIKE T1 ON T.'POST_LIKE_ID_MAPPING'=T1.'INTERNAL_ID'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Post loadCurrentDeep(Cursor cursor, boolean lock) {
        Post entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        User user = loadCurrentOther(daoSession.getUserDao(), cursor, offset);
        entity.setUser(user);
        offset += daoSession.getUserDao().getAllColumns().length;

        Like like = loadCurrentOther(daoSession.getLikeDao(), cursor, offset);
        entity.setLike(like);

        return entity;    
    }

    public Post loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Post> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Post> list = new ArrayList<Post>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Post> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Post> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}