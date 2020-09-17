package pl.adrian.kanbantool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.adrian.kanbantool.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User getById(Long id);

}
