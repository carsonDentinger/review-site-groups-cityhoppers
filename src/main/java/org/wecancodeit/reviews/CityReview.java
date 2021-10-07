package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class CityReview {

    @Id
    private Long id;
    private String name;
    private String slogan;
    private Long population;
    private String review;


    public CityReview(Long id, String name, String slogan, Long population, String review) {
        this.id = id;
        this.name = name;
        this.slogan = slogan;
        this.population = population;
        this.review = review;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlogan() {
        return slogan;
    }

    public Long getPopulation() {
        return population;
    }

    public String getReview() {
        return review;
    }

}
