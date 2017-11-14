package uk.co.rbrt;

import org.springframework.data.repository.CrudRepository;

/**
 * @author <a href="mailto:roberthunt87@gmail.com">Robert Hunt</a>
 */
public interface PersonRepository extends CrudRepository<Person, Long>, PersonRepositoryCustom
{
}
