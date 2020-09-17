package pl.adrian.kanbantool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.adrian.kanbantool.domain.Backlog;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {

    Backlog findByProjectIdentifier(String Identifier);
}
