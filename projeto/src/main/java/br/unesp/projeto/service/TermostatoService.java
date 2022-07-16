/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Termostato;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TermostatoService {

     List<Termostato> findAll();
    Termostato findById(long id);
    Termostato save(Termostato entity);

    public void delete(Termostato termostatoDelete);

    public Termostato update(Termostato termostatoUpdate);
}
