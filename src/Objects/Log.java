/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ruth2
 */

public class Log {//Class Name
    //Components
    private int diveNum;
    private LocalDate diveDate;
    private int airIn;
    private int airOut;
    private int weight;
    private int depth;
    private int time;
    private double temperature;
    private int visability;
    private String weather;
    private String buddyName;
    private int buddyNum;
    private boolean safety;
    private String comments;

    //Constructor Method
    public Log(int n,LocalDate dd,int t,int d,int ai,int ao,int w,boolean s,int temp,int v,String we,String bn,int bnum,String c) {
        diveNum = n;
        diveDate = dd;
        time = t;
        depth = d;
        airIn = ai;
        airOut = ao;
        weight = w;
        safety = s;
        temperature = temp;
        visability = v;
        weather = we;
        buddyName = bn;
        buddyNum = bnum;
        comments = c;
    }
    //Accessor and Mutator Methods
    public int getDiveNum() {
        return diveNum;
    }

    public LocalDate getDiveDate() {
        return diveDate;
    }

    public int getAirIn() {
        return airIn;
    }

    public int getAirOut() {
        return airOut;
    }

    public int getWeight() {
        return weight;
    }

    public int getDepth() {
        return depth;
    }

    public int getTime() {
        return time;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getVisability() {
        return visability;
    }

    public String getWeather() {
        return weather;
    }

    public String getBuddyName() {
        return buddyName;
    }

    public int getBuddyNum() {
        return buddyNum;
    }

    public boolean isSafety() {
        return safety;
    }

    public String getComments() {
        return comments;
    }

    public void setDiveNum(int diveNum) {
        this.diveNum = diveNum;
    }

    public void setDiveDate(LocalDate diveDate) {
        this.diveDate = diveDate;
    }

    public void setAirIn(int airIn) {
        this.airIn = airIn;
    }

    public void setAirOut(int airOut) {
        this.airOut = airOut;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setVisability(int visability) {
        this.visability = visability;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setBuddyName(String buddyName) {
        this.buddyName = buddyName;
    }

    public void setBuddyNum(int buddyNum) {
        this.buddyNum = buddyNum;
    }

    public void setSafety(boolean safety) {
        this.safety = safety;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
   

    @Override
    public String toString() { //to String Method
        return "Dive Number: " + diveNum + "\nDate: " + diveDate + "\nAir In: " + airIn + "\nAir Out: " + airOut + "\nWeight: " + weight + "\nDepth: " + depth + "\nTime: " + time + "\nTemperature: " + temperature + "\nVisability: " + visability + "\nWeather: " + weather + "\nBuddy Name: " + buddyName + "\nBuddy Number: " + buddyNum + "\nSafetyStop: " + safety + "\nComments: " + comments;
    }   
}
