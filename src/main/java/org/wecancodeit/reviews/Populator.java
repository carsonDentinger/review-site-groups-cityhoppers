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
        Region midwest = new Region("Midwest", "The Heartland of America", "/img/midwest.jpg");
        regionRepo.save(midwest);

        Region west = new Region("West", "The New Frontier!", "/img/West.jpg");
        regionRepo.save(west);

        Region east = new Region("NorthEast", "Birthplace of America", "/img/NewEngland.jpg");
        regionRepo.save(east);

        Region south = new Region("The South", "Bless Your Heart!", "/img/South.jpg");
        regionRepo.save(south);

        HashPage nightLife = new HashPage("Night Life", "Party 'til the sun comes up in America's hottest nightlife hubs!", "/img/nightlife.jpg");
        hashRepo.save(nightLife);

        HashPage musicCulture = new HashPage("Music Culture", "Explore the musical roots of America!", "/img/music.jpg");
        hashRepo.save(musicCulture);

        HashPage historicAttractions = new HashPage("Historic Attractions", "Explore the rich culture of America's most storied cities!", "/img/history.jpg");
        hashRepo.save(historicAttractions);

        HashPage foodCulture = new HashPage("Food Culture", "Enjoy the finest cuisine America has to offer!", "/img/restaurant.jpg");
        hashRepo.save(foodCulture);

        CityReview cityReview1 = new CityReview("Portland, OR", "City of Roses", 645291l, "PortlandReview", "/img/portland1.jpeg", west, foodCulture, musicCulture);
        CityReview cityReview2 = new CityReview("Seattle, WA", "Emerald City", 7370000l, "", "/img/seattle.jpg", west, historicAttractions, musicCulture);
        CityReview cityReview3 = new CityReview("Columbus, OH", "Buckeye City", 878553l, "", "/img/Columbus.jpg", midwest, foodCulture);
        CityReview cityReview4 = new CityReview("Washington D.C.", "Capital City", 500000l, "", "/img/WashingtonD_C.jpg", east, historicAttractions, musicCulture);
        CityReview cityReview5 = new CityReview("Los Angeles, CA", "City of Angels", 3900000l, "lorem", "/img/LosAngeles.jpg", west, nightLife, musicCulture, foodCulture);
        CityReview cityReview6 = new CityReview("Salt Lake City, UT", "The Crossroads of the West", 201249l, "lorem", "/img/SLC.jpg",west, nightLife, foodCulture, historicAttractions);
        CityReview cityReview7 = new CityReview("Atlanta, GA", "The Big Peach", 488800l, "lorem", "/img/ATL.jpg", south, musicCulture, foodCulture, nightLife, historicAttractions);
        CityReview cityReview8 = new CityReview("Nashville, TN", "Music City", 692587l, "lorem", "/img/Nashville.jpg",south, musicCulture, historicAttractions, nightLife);
        CityReview cityReview9 = new CityReview("New Orleans, LA", "The Big Easy", 390845l, "", "/img/NOLA.jpg", south, musicCulture, foodCulture, historicAttractions, nightLife);
        CityReview cityReview10 = new CityReview("Savannah, GA", "Hostess City of the South", 145403l, "", "/img/savannah.jpg", south, historicAttractions, musicCulture);
        CityReview cityReview11 = new CityReview("Miami, FL", "The Magic City", 442241l, "", "/img/miami.jpg", south, musicCulture, nightLife);
        CityReview cityReview12 = new CityReview("Mobile, AL", "The Azalea City", 190432l, "", "/img/Mobile.jpg", south, historicAttractions, foodCulture);
        CityReview cityReview13 = new CityReview("Boston, MA", "Beantown", 684379l, "", "/img/Boston.jpg", east, historicAttractions, musicCulture, nightLife);
        CityReview cityReview14 = new CityReview("Charleston, WV", "Charlie West", 48006l, "", "/img/Charleston.jpg", east, historicAttractions, foodCulture);
        CityReview cityReview15 = new CityReview("New York, NY", "The City that Never Sleeps", 8419000l, "", "/img/NYC.jpg", east, historicAttractions, foodCulture, nightLife, musicCulture);
        CityReview cityReview16 = new CityReview("Burlington, VT", "The Queen City", 42545l, "","/img/Burlington.jpg", east, foodCulture, musicCulture);
        CityReview cityReview17 = new CityReview("Philadelphia, PA", "City of Brotherly Love", 1579000l, "", "/img/philly.png", east, musicCulture, historicAttractions, nightLife);
        CityReview cityReview18 = new CityReview("Klamath Falls, OR", "The Dirty K", 21335l, "", "/img/KFalls.jpg", west, historicAttractions);
        CityReview cityReview19 = new CityReview("Hood River, OR", "City in the Shadow of the Mountain", 7715l, "", "/img/HoodRiver.jpg", west, foodCulture, musicCulture);
        CityReview cityReview20 = new CityReview("Chicago, IL", "The Windy City", 2710000l, "", "/img/CHI.jpg", midwest, historicAttractions, musicCulture, foodCulture, nightLife);
        CityReview cityReview21 = new CityReview("Cleveland, OH", "The Forest City", 385282l, "", "/img/CLE.jpg", midwest, foodCulture, historicAttractions);
        CityReview cityReview22 = new CityReview("Detroit, MI", "Motor City", 674841l, "", "/img/Detroit.jpg", midwest, musicCulture, historicAttractions, nightLife);
        CityReview cityReview23 = new CityReview("Milwaukee, WI", "Cream City", 594598l, "", "/img/milwaukee.jpg", midwest, foodCulture, historicAttractions);
        CityReview cityReview24 = new CityReview("St. Louis, MO", "The Gateway to the West", 308174l, "", "/img/STLouis.jpg", midwest, historicAttractions);
        cityRepo.save(cityReview1);
        cityRepo.save(cityReview2);
        cityRepo.save(cityReview3);
        cityRepo.save(cityReview4);
        cityRepo.save(cityReview5);
        cityRepo.save(cityReview6);
        cityRepo.save(cityReview7);
        cityRepo.save(cityReview8);
        cityRepo.save(cityReview9);
        cityRepo.save(cityReview10);
        cityRepo.save(cityReview11);
        cityRepo.save(cityReview12);
        cityRepo.save(cityReview13);
        cityRepo.save(cityReview14);
        cityRepo.save(cityReview15);
        cityRepo.save(cityReview16);
        cityRepo.save(cityReview17);
        cityRepo.save(cityReview18);
        cityRepo.save(cityReview19);
        cityRepo.save(cityReview20);
        cityRepo.save(cityReview21);
        cityRepo.save(cityReview22);
        cityRepo.save(cityReview23);
        cityRepo.save(cityReview24);
    }
}
