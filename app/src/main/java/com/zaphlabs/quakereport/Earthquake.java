package com.zaphlabs.quakereport;

/**
 * Created by Mohd Zaki on 1/2/2018.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;
    private String mLocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude,String location,long timeInMilliseconds){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds = timeInMilliseconds;
    }
    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
