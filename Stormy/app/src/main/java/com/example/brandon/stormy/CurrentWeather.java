package com.example.brandon.stormy;

/**
 * Created by Brandon on 10/3/2016.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTIme;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTIme() {
        return mTIme;
    }

    public void setTIme(long TIme) {
        mTIme = TIme;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPrecipChance() {
        return mPrecipChance;
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
