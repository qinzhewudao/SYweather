package com.weather.sy.syweather.Db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CITY_WEATHER".
*/
public class CityWeatherDao extends AbstractDao<CityWeather, Long> {

    public static final String TABLENAME = "CITY_WEATHER";

    /**
     * Properties of entity CityWeather.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CityName = new Property(1, String.class, "cityName", false, "CITY_NAME");
        public final static Property WeatherBean = new Property(2, byte[].class, "weatherBean", false, "WEATHER_BEAN");
        public final static Property UpdateTime = new Property(3, java.util.Date.class, "updateTime", false, "UPDATE_TIME");
    };


    public CityWeatherDao(DaoConfig config) {
        super(config);
    }
    
    public CityWeatherDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CITY_WEATHER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CITY_NAME\" TEXT," + // 1: cityName
                "\"WEATHER_BEAN\" BLOB," + // 2: weatherBean
                "\"UPDATE_TIME\" INTEGER);"); // 3: updateTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CITY_WEATHER\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CityWeather entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String cityName = entity.getCityName();
        if (cityName != null) {
            stmt.bindString(2, cityName);
        }
 
        byte[] weatherBean = entity.getWeatherBean();
        if (weatherBean != null) {
            stmt.bindBlob(3, weatherBean);
        }
 
        java.util.Date updateTime = entity.getUpdateTime();
        if (updateTime != null) {
            stmt.bindLong(4, updateTime.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public CityWeather readEntity(Cursor cursor, int offset) {
        CityWeather entity = new CityWeather( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // cityName
            cursor.isNull(offset + 2) ? null : cursor.getBlob(offset + 2), // weatherBean
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)) // updateTime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CityWeather entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCityName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setWeatherBean(cursor.isNull(offset + 2) ? null : cursor.getBlob(offset + 2));
        entity.setUpdateTime(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(CityWeather entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(CityWeather entity) {
        if(entity != null) {
            return entity.getId();
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
