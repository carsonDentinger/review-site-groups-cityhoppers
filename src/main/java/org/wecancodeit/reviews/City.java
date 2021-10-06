package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

    @Id
    private Long id;
    private String name;
    private String countryState;
    private String region;
    private String slogan;
    private Long population;


    public City(String name, String countryState, String region, String slogan, Long population, Long id) {
        this.name = name;
        this.countryState = countryState;
        this.region = region;
        this.slogan = slogan;
        this.population = population;
        this.id = id;
    }

    public City(){

    }

    public String getName() {
        return name;
    }

    public String getCountryState() {
        return countryState;
    }

    public String getRegion() {
        return region;
    }

    public String getSlogan() {
        return slogan;
    }

    public Long getPopulation() {
        return population;
    }

    public Long getId() {
        return id;
    }
}
