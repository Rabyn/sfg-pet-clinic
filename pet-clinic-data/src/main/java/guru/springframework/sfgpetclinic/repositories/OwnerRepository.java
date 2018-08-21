package guru.springframework.sfgpetclinic.repositories;

/*
 * Created by Rabindra on 8/20/18
 */

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

}
