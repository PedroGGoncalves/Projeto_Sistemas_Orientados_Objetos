/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Armazem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArmazemService extends JpaRepository<Armazem, Long> {

    Armazem find(String idArmazem);
    Armazem getAll(String idArmazem);
    void delete(int id);
}