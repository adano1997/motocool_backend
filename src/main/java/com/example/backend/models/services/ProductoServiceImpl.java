package com.example.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.backend.models.dao.IProductoDao;
import com.example.backend.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

  @Autowired
  private IProductoDao productoDao;

  @Override
  @Transactional(readOnly = true)
  public List<Producto> findAll(){
    return (List<Producto>) productoDao.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Producto findById(Long idProducto){
    return productoDao.findById(idProducto).orElse(null);
  }

  @Override
  @Transactional
  public Producto save(Producto producto){
    System.out.println("Guardo producto");
    return productoDao.save(producto);
  }

  @Override
  @Transactional
  public void delete(Long idProducto){
    productoDao.deleteById(idProducto);
  }
}
