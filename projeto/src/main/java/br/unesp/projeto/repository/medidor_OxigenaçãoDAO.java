/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.repository;
import br.unesp.projeto.model.Medidor_oxigenacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  medidor_OxigenaçãoDAO extends JpaRepository<Medidor_oxigenacao, Long> {

    Medidor_oxigenacao find(Long Id);
    Medidor_oxigenacao getAll(Long Id);
    void delete(int id);
}