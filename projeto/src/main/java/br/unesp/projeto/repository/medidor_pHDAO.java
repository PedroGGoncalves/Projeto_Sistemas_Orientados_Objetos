/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.repository;
import br.unesp.projeto.model.Medidor_ph;

import org.springframework.data.jpa.repository.JpaRepository;

public interface medidor_pHDAO extends JpaRepository<Medidor_ph, Long> {

    Medidor_ph find(Long Id);
    Medidor_ph getAll(Long Id);
    void delete(int id);
}