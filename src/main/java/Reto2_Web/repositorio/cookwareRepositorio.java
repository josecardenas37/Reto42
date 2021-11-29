/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.modelo.cookware;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceCookware;

/**
 *
 * @author USUARIO
 */
@Repository
public class cookwareRepositorio {
    @Autowired
    private InterfaceCookware repository;

    public List<cookware> getAll() {
        return repository.findAll();
    }

    public Optional<cookware> getClothe(String reference) {
        return repository.findById(reference);
    }
    public cookware create(cookware clothe) {
        return repository.save(clothe);
    }

    public void update(cookware clothe) {
        repository.save(clothe);
    }
    
    public void delete(cookware clothe) {
        repository.delete(clothe);
    }
}