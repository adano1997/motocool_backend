package com.example.backend.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto implements Serializable {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long idProducto;

  private String nombre;

  private float precio;

  public Long getIdProducto(){
    return idProducto;
  }

  public void setIdProducto(Long idProducto){
    this.idProducto = idProducto;
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public float getPrecio(){
    return precio;
  }

  public void setPrecio(float precio){
    this.precio = precio;
  }
}
