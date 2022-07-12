/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Termostato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TermostatoService extends JpaRepository<Termostato, Long> {

    Termostato find(String temperatura);
    Termostato getAll(String temperatura);
    void delete(int id);
}
