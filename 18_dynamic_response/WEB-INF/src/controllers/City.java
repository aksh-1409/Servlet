package controllers;

public class City{
    public int cityid;
    public String cityname;
    public State state;

    City(int cityid, String cityname, State state){
        this.cityid = cityid;
        this.cityname = cityname;
        this.state = state;
    }
}