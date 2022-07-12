/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Aquario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAquario;
    private String nome;
    private String endereco;
    private String horario_func;
    private String contato;
    private float precoIngresso;
    
    public Aquario() {

    }
    
  
}
