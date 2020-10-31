package uipa.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uipa.api.model.UsuariosModel;

/**
 * UsuariosRepository
 */

@Repository

public interface UsuariosRepository extends CrudRepository<UsuariosModel, Integer> {
}
