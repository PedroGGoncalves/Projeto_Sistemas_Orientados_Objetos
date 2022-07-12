/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Medidor_ph;

import org.springframework.data.jpa.repository.JpaRepository;

public interface medidor_pHService extends JpaRepository<Medidor_ph, Long> {

    Medidor_ph find(String ph);
    Medidor_ph getAll(String ph);
    void delete(int id);
}