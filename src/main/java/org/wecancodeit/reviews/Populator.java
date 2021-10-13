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
        Region midwest = new Region("Midwest", "no longer mad");
        regionRepo.save(midwest);

        Region west = new Region("West", "West coast best coast");
        regionRepo.save(west);

        Region east = new Region("EastCoast", "East coast beast coast");
        regionRepo.save(east);

        Region south = new Region("south", "the south will rise");
        regionRepo.save(south);

        HashPage nightLife = new HashPage("Night Life", "lorem ipsum");
        hashRepo.save(nightLife);

        HashPage musicCulture = new HashPage("Music Culture", " ");
        hashRepo.save(musicCulture);

        HashPage historicAttractions = new HashPage("Historic Attractions", "Different attractions to visit");
        hashRepo.save(historicAttractions);


        CityReview cityReview1 = new CityReview("Portland", "City of Roses", 600000l, "PortlandReview", west, nightLife);
        CityReview cityReview2 = new CityReview("Seattle", "Emerald City", 7370000l, "", west, historicAttractions);
        CityReview cityReview3 = new CityReview("Columbus", "Buckeye City", 850000l, "", midwest, historicAttractions);
        CityReview cityReview4 = new CityReview("Washington D.C.", "Capital City", 500000l, "", east, historicAttractions);
        cityRepo.save(cityReview1);
        cityRepo.save(cityReview2);
        cityRepo.save(cityReview3);
        cityRepo.save(cityReview4);


    }

}
