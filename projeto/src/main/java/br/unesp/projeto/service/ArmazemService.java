/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Armazem;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArmazemService {

     List<Armazem> findAll();
    Armazem findById(Long id);
    boolean save(Armazem entity);
}
