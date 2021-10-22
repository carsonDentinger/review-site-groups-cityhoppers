package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.model.CityReview;
import org.wecancodeit.reviews.model.HashPage;
import org.wecancodeit.reviews.model.Region;
import org.wecancodeit.reviews.repos.CityRepo;
import org.wecancodeit.reviews.repos.HashRepo;
import org.wecancodeit.reviews.repos.RegionsRepo;

@Component
public class Populator implements CommandLineRunner {

    private CityRepo cityRepo;
    private HashRepo hashRepo;
    private RegionsRepo regionRepo;

    public Populator(CityRepo cityRepo, HashRepo hashRepo, RegionsRepo regionRepo) {
        this.cityRepo = cityRepo;
        this.hashRepo = hashRepo;
        this.regionRepo = regionRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Region midwest = new Region("Midwest", "no longer mad", "/img/midwest.jpg");
        regionRepo.save(midwest);

        Region west = new Region("West", "West coast best coast", "/img/West.jpg");
        regionRepo.save(west);

        Region east = new Region("NorthEast", "East coast beast coast", "/img/NewEngland.jpg");
        regionRepo.save(east);

        Region south = new Region("South", "the south will rise", "/img/South.jpg");
        regionRepo.save(south);

        HashPage nightLife = new HashPage("Night Life", "lorem ipsum", "/img/nightlife.jpg");
        hashRepo.save(nightLife);

        HashPage musicCulture = new HashPage("Music Culture", "", "/img/music.jpg");
        hashRepo.save(musicCulture);

        HashPage historicAttractions = new HashPage("Historic Attractions", "Different attractions to visit", "/img/history.jpg");
        hashRepo.save(historicAttractions);

        HashPage foodCulture = new HashPage("Food Culture", "", "/img/restaurant.jpg");
        hashRepo.save(foodCulture);

        CityReview cityReview1 = new CityReview("Portland", "City of Roses", 600000l, "PortlandReview", "/img/portland1.jpg", west, nightLife);
        CityReview cityReview2 = new CityReview("Seattle", "Emerald City", 7370000l, "", "/img/seattle.jpg", west, historicAttractions);
        CityReview cityReview3 = new CityReview("Columbus", "Buckeye City", 850000l, "", "/img/Columbus.jpg", midwest, historicAttractions);
        CityReview cityReview4 = new CityReview("Washington D.C.", "Capital City", 500000l, "", "img/WashingtonD_C.jpg", east, historicAttractions, musicCulture);
        cityRepo.save(cityReview1);
        cityRepo.save(cityReview2);
        cityRepo.save(cityReview3);
        cityRepo.save(cityReview4);
    }

}
