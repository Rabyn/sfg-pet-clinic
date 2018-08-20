package guru.springframework.sfgpetclinic.repositories;

/*
 * Created by Rabindra on 8/20/18
 */

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
