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
import javax.persistence.ManyToMany;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity(name="Funcionário")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario implements Serializable {
   
    
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFuncionario;
   
    private String nome_completo;
    private String RG;
    private String CPF;
   // private List<Area> funcao;
    private float salario;
   
   
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_nascimento;
   
    @Temporal(TemporalType.TIMESTAMP)
    private Date contratacao;
   
   
    private boolean login;
    private List<Login> loginn;
    

    @ManyToMany(mappedBy="funcionarios", cascade = CascadeType.ALL)
    private List<Tanque> tanques;
   
   
    @OneToOne(cascade=CascadeType.ALL)
    private Login login;
    
    
    public Funcionario() {

    }
}
