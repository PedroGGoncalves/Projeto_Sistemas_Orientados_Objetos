/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Medidor_salinidade;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface medidor_SalinidadeService {

     List<Medidor_salinidade> findAll();
    Medidor_salinidade findById(Long id);
    boolean save(Medidor_salinidade entity);
}