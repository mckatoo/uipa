package uipa.api.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AnimaisModel
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "animal")
public class AnimaisModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CodAnimal", nullable = false)
  private Integer codAnimal;

  @Column(nullable = false, length = 50)
  private String nome;

  @Column(length = 50)
  private String especie;

  @Column(length = 1)
  private Character[] sexo;

  @Column(name = "DataNasc")
  private Timestamp dataNasc;

  @Column(length = 1)
  private Character[] porte;

  @Column(length = 1)
  private Character[] castrado;

  @Column(name = "CodAdotante")
  private Integer codAdotante;

  @Column(name = "DataAdocao")
  private Timestamp dataAdocao;

}
