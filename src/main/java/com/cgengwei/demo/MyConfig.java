package com.cgengwei.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by cgengwei
 * 2018/5/5 09:47
 */
@Component
@ConfigurationProperties(prefix = "config")
public class MyConfig {

    private String createdDate;
    private String place;

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "MyConfig{" +
                "createdDate='" + createdDate + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
