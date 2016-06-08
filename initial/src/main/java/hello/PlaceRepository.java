package hello;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jjohnson on 6/7/16.
 */
@RepositoryRestResource(collectionResourceRel = "places")
public interface PlaceRepository extends MongoRepository<Place, String> {
    List<Place> findByStreetAddress(@Param("address") String address, Pageable pageable);
    List<Place> findByName(@Param("name") String name, Pageable pageable);
    List<Place> findByNameStartsWith(@Param("name") String name, Pageable pageable);
    List<Place> findByState(@Param("state") String state, Pageable pageable);
}
