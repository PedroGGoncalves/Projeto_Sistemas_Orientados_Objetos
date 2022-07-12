/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Tanque;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TanqueService extends JpaRepository<Tanque, Long> {

    Tanque find(String idTanque);
    Tanque getAll(String idTanque);
    void delete(int id);
}