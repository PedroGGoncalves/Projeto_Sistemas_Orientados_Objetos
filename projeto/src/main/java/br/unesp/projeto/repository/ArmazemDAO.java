/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.repository;
import br.unesp.projeto.model.Armazem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArmazemDAO extends JpaRepository<Armazem, Long> {

    Armazem find(Long Id);
    Armazem getAll(Long Id);
    void delete(int id);
}