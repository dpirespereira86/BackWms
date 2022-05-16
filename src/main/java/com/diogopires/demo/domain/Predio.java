package com.diogopires.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Predio {
  /*ATRIBUTOS-------------------------------------------------------------*/
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
  private String nome;
  
  @ManyToOne
  @JoinColumn(name = "empresa_id")
  private Empresa empresa;
  
  /*CONSTRUTORES---------------------------------------------------------*/
  
  public Predio() {
  }

  public Predio(Integer id, String nome, Empresa empresa) {
    this.id = id;
    this.nome = nome;
    this.empresa = empresa;
  }

  /*GET SETS---------------------------------------------------------*/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Empresa getEmpresa() {
    return empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  /*HASH EQUALS--------------------------------------------------------------*/

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Predio other = (Predio) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
