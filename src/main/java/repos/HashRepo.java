package repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.HashPage;

public interface HashRepo extends CrudRepository<HashPage,Long> {
}
