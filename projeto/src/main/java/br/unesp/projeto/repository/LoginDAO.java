/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.repository;
import br.unesp.projeto.model.Login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDAO extends JpaRepository<Login, Long> {

    Login find(Long Id);
   Login getAll(Long Id);
    void delete(int id);
}
