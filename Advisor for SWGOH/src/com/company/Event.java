package com.company;

public class Event {

    public String[] reqChars = new String[5];
    private String eventName = new String();
    private String reward = new String();
    private int lastDate;
    private int rotation;
    private int reqGear;
    private int recGear;

    //Constructor
    public Event() {
        this.reqChars = reqChars;
        this.eventName = eventName;
        this.reward = reward;
        this.lastDate = lastDate;
        this.rotation = rotation;
        this.reqGear = reqGear;
        this.recGear = recGear;
    }

    //Getters & Setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public int getLastDate() {
        return lastDate;
    }

    public void setLastDate(int lastDate) {
        this.lastDate = lastDate;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public int getReqGear() {
        return reqGear;
    }

    public void setReqGear(int reqGear) {
        this.reqGear = reqGear;
    }

    public int getRecGear() {
        return recGear;
    }

    public void setRecGear(int recGear) {
        this.recGear = recGear;
    }
}