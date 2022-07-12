/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import java.io.Serializable;



@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Termostato implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTermostato;
    
    
    private float temperatura;
    
    public Termostato () {
       // this.itemTermostato   = new ArrayList<>();
    }
   
}
