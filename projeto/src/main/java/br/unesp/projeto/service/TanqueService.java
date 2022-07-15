/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Tanque;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TanqueService {

     List<Tanque> findAll();
    Tanque findById(Long id);
    Tanque save(Tanque entity);

    public void delete(Tanque tanqueDelete);

    public Tanque update(Tanque tanqueUpdate);
}