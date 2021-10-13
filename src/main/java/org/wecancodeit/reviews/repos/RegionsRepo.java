package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Region;

public interface RegionsRepo extends CrudRepository<Region, Long> {
}
