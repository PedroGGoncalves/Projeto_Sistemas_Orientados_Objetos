/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.springframework.data.annotation.Id;

@Entity(name = "Aquario")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Aquario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAquario;
    private String nome;
    private String endereco;
    private String horario_func;
    private String contato;
    private float precoIngresso;
    
    @OneToMany(
            cascade = CascadeType.ALL)
    @JoinColumn(name = "aquario_idaquario")
    private List<Funcionario> funcionario;
    
    
    
     @OneToMany(
            cascade = CascadeType.ALL)
    @JoinColumn(name = "aquario_idaquario")
    private List<Tanque> tanque;
    
    
     @OneToMany(
            cascade = CascadeType.ALL)
    @JoinColumn(name = "aquario_idaquario")
    private List<Armazem> armazem;
    
    
   
    
    public Aquario() {

    }
    
  
}
