package uipa.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UsuariosModel
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "usuario")
public class UsuariosModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="CodUsuario", nullable = false)
  private Integer codUsuario;

  @Column(nullable = false, length = 100)
  private String login;

  @Column(nullable = false, length = 100)
  private String senha;
  
}
