package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.CityReview;

public interface CityRepo extends CrudRepository<CityReview, Long> {
}
