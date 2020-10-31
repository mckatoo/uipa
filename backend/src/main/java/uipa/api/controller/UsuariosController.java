package uipa.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uipa.api.model.UsuariosModel;
import uipa.api.repository.UsuariosRepository;

/**
 * UsersController
 */

@RestController
public class UsuariosController {

  @Autowired
  private UsuariosRepository repository;

  @GetMapping(path = "api/usuarios/id/{id}")
  public ResponseEntity<UsuariosModel> porId(@PathVariable("id") Integer id) {
    return repository.findById(id)
        .map(record -> ResponseEntity.ok().body(record))
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping(path = "api/usuarios")
  public UsuariosModel salvar(@RequestBody UsuariosModel usuario) {
    return repository.save(usuario);
  }

}
