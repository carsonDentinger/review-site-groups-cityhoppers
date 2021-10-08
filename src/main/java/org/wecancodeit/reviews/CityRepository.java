package org.wecancodeit.reviews;

import org.wecancodeit.reviews.model.CityReview;

import java.util.HashMap;

public class CityRepository {

    public HashMap<Long, CityReview> cities;

    public CityRepository() {
        cities = new HashMap<>();
        CityReview cityReview1 = new CityReview(1l, "Portland","City of Roses",600000l,"");
        CityReview cityReview2 = new CityReview(2l, "Seattle", "Emerald City",7370000l,"");
        CityReview cityReview3 = new CityReview(3l,"Columbus", "Buckeye City",850000l, "");
        CityReview cityReview4 = new CityReview(4l, "Washington D.C.","Capital City",500000l,"");
        cities.put(cityReview1.getId(), cityReview1);
        cities.put(cityReview2.getId(), cityReview2);
        cities.put(cityReview3.getId(), cityReview3);
        cities.put(cityReview4.getId(), cityReview4);
    }

    public CityReview getById(Long id){
        return cities.get(id);

    }

    public HashMap<Long, CityReview> getCities(){
         return cities;

    }


}
