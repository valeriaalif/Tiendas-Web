/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiendas.demo.service;

import Tiendas.demo.entity.Pais;
import Tiendas.demo.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService implements IPaisService {
    @Autowired
    private PaisRepository paisRepository;


      @Override
    public List<Pais> listCountry() {
        return (List<Pais>)paisRepository.findAll();
        }
}
