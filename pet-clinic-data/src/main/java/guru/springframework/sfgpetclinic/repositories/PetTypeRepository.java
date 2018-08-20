package guru.springframework.sfgpetclinic.repositories;

/*
 * Created by Rabindra on 8/20/18
 */

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
