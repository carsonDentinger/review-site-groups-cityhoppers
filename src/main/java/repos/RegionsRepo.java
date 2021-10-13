package repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Region;

public interface RegionsRepo extends CrudRepository<Region, Long> {
}
