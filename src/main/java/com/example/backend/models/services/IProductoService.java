package com.example.backend.models.services;

import java.util.List;
import com.example.backend.models.entity.Producto;

public interface IProductoService{

  public List<Producto> findAll();

  public Producto findById(Long idProducto);

  public Producto save(Producto producto);

  public void delete(Long idProducto);

}
