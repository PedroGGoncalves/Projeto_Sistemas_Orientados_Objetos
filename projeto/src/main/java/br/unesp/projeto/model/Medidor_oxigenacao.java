/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Medidor_oxigenacao implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idMedidor_Oxigenacao;
    
    private float oxigenacao;
    
    
    @OneToOne
    private Tanque tanque;
    
    public Medidor_oxigenacao () {
   
    }
}
