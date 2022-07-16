/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Armazem implements Serializable {
     
    private static final long serialVersionUID = 1L;
     
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idArmazem;
     
    
    private int quantidade;
     
    
    
    public Armazem() {

    }
}
