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
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFuncionario;
    private String nome_completo;
    private String RG;
    private String CPF;
   // private List<Area> funcao;
    private float salario;
    private Date data_nascimento;
    private Date contratacao;
    private boolean login;
    private List<Login> loginn;
    
    public Funcionario() {

    }
}
