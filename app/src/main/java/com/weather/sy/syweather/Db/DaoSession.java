package com.weather.sy.syweather.Db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig provinceDaoConfig;
    private final DaoConfig cityDaoConfig;
    private final DaoConfig cityWeatherDaoConfig;
    private final DaoConfig directDaoConfig;
    private final DaoConfig loveCityDaoConfig;
    private final DaoConfig viewSpotDaoConfig;
    private final DaoConfig viewSpotWeatherDaoConfig;

    private final ProvinceDao provinceDao;
    private final CityDao cityDao;
    private final CityWeatherDao cityWeatherDao;
    private final DirectDao directDao;
    private final LoveCityDao loveCityDao;
    private final ViewSpotDao viewSpotDao;
    private final ViewSpotWeatherDao viewSpotWeatherDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        provinceDaoConfig = daoConfigMap.get(ProvinceDao.class).clone();
        provinceDaoConfig.initIdentityScope(type);

        cityDaoConfig = daoConfigMap.get(CityDao.class).clone();
        cityDaoConfig.initIdentityScope(type);

        cityWeatherDaoConfig = daoConfigMap.get(CityWeatherDao.class).clone();
        cityWeatherDaoConfig.initIdentityScope(type);

        directDaoConfig = daoConfigMap.get(DirectDao.class).clone();
        directDaoConfig.initIdentityScope(type);

        loveCityDaoConfig = daoConfigMap.get(LoveCityDao.class).clone();
        loveCityDaoConfig.initIdentityScope(type);

        viewSpotDaoConfig = daoConfigMap.get(ViewSpotDao.class).clone();
        viewSpotDaoConfig.initIdentityScope(type);

        viewSpotWeatherDaoConfig = daoConfigMap.get(ViewSpotWeatherDao.class).clone();
        viewSpotWeatherDaoConfig.initIdentityScope(type);


        provinceDao = new ProvinceDao(provinceDaoConfig, this);
        cityDao = new CityDao(cityDaoConfig, this);
        cityWeatherDao = new CityWeatherDao(cityWeatherDaoConfig, this);
        directDao = new DirectDao(directDaoConfig, this);
        loveCityDao = new LoveCityDao(loveCityDaoConfig, this);
        viewSpotDao = new ViewSpotDao(viewSpotDaoConfig, this);
        viewSpotWeatherDao = new ViewSpotWeatherDao(viewSpotWeatherDaoConfig, this);

        registerDao(Province.class, provinceDao);
        registerDao(City.class, cityDao);
        registerDao(CityWeather.class, cityWeatherDao);
        registerDao(Direct.class, directDao);
        registerDao(LoveCity.class, loveCityDao);
        registerDao(ViewSpot.class, viewSpotDao);
        registerDao(ViewSpotWeather.class, viewSpotWeatherDao);
    }
    
    public void clear() {
        provinceDaoConfig.getIdentityScope().clear();
        cityDaoConfig.getIdentityScope().clear();
        cityWeatherDaoConfig.getIdentityScope().clear();
        directDaoConfig.getIdentityScope().clear();
        loveCityDaoConfig.getIdentityScope().clear();
        viewSpotDaoConfig.getIdentityScope().clear();
        viewSpotWeatherDaoConfig.getIdentityScope().clear();
    }

    public ProvinceDao getProvinceDao() {
        return provinceDao;
    }

    public CityDao getCityDao() {
        return cityDao;
    }

    public CityWeatherDao getCityWeatherDao() {
        return cityWeatherDao;
    }

    public DirectDao getDirectDao() {
        return directDao;
    }

    public LoveCityDao getLoveCityDao() {
        return loveCityDao;
    }

    public ViewSpotDao getViewSpotDao() {
        return viewSpotDao;
    }

}
