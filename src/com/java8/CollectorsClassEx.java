package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsClassEx {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<> ();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));
        cities.add(new City("Dubai", 45));


        System.out.println (cities.stream ()
                .filter (city -> city.getTemperature () > 10)
                .map (city -> city.getCity ())
                .collect(Collectors.toList()));

        System.out.println (cities.stream ()
                .filter (city -> city.getTemperature () > 10)
                .map (city -> city.getCity ())
                .collect(Collectors.toSet ()));

        System.out.println (cities.stream ()
                .filter (city -> city.getTemperature () > 10)
                .collect(Collectors.toMap (City::getCity,City::getTemperature,(key, identicalKey) -> key)));

        System.out.println (cities.stream ()
                .filter (city -> city.getTemperature () > 10)
                .collect (Collectors.groupingBy (City::getCity))
        );
    }
}

class City{

    public City(String city, double temperature){
        this.city = city;
        this.temperature = temperature;
    }

    private String city;
    private double temperature;

    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}