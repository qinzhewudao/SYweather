package com.weather.sy.syweather.Db;

public class City {

    private Long id;
    /** Not-null value. */
    private String citynName;
    /** Not-null value. */
    private String provinceName;
    /** Not-null value. */
    private String love;

    public City() {
    }

    public City(Long id) {
        this.id = id;
    }

    public City(Long id, String citynName, String provinceName, String love) {
        this.id = id;
        this.citynName = citynName;
        this.provinceName = provinceName;
        this.love = love;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getCitynName() {
        return citynName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCitynName(String citynName) {
        this.citynName = citynName;
    }

    /** Not-null value. */
    public String getProvinceName() {
        return provinceName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /** Not-null value. */
    public String getLove() {
        return love;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLove(String love) {
        this.love = love;
    }

}
