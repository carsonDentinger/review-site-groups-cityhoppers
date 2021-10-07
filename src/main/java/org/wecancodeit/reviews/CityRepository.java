package org.wecancodeit.reviews;

import java.util.HashMap;

public class CityRepository {

    public HashMap<Long, City> cities;

    public CityRepository() {
        cities = new HashMap<>();
        City city1 = new City("Portland", "Oregon, USA", "North America", "City of Roses", 600000l,1l);
        City city2 = new City("Seattle", "Washington, USA", "North America", "Emerald City", 737000l, 2l);
        City city3 = new City("Shanghai", "TBD, China", "Asia", "Wonderful Everyday!", 27795702l, 3l);
        City city4 = new City("London", "England, UK", "Europe", "City Full of Life", 8960000l, 4l);
        cities.put(city1.getId(), city1);
        cities.put(city2.getId(), city2);
        cities.put(city3.getId(), city3);
        cities.put(city4.getId(), city4);
    }

    public City getById(Long id){
        return cities.get(id);
    }

    public HashMap<Long, City> getCities(){
        return cities;
    }
}
