/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.repository;
import br.unesp.projeto.model.Tanque;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TanqueDAO extends JpaRepository<Tanque, Long> {

    Tanque findByCpf(String cpf);
    Tanque getAll(String cpf);
    void delete(int id);
}