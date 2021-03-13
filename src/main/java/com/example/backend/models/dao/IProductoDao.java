package com.example.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.backend.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
  
}
