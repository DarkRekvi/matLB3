package com.example.mylaba3;

public class ElStuff {
    private String name;
    private String type;
    private String countryFrom;

    public ElStuff(String name, String type, String countryF)
    {
        this.name=name;
        this.type=type;
        this.countryFrom=countryF;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCountryFrom() {
        return this.countryFrom;
    }
    public void setCountryFrom(int countryF) {
        this.countryFrom = countryFrom;
    }
}
