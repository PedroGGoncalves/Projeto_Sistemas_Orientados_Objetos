/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Login;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginService {

     List<Login> findAll();
    Login findById(Long id);
    boolean save(Login entity);
}
