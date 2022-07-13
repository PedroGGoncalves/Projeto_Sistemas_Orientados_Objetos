/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Medidor_salinidade implements Serializable {
   
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idMedidor_Salinidade;
        
        
    private float salinidade;
    
    public Medidor_salinidade () {
       // this.itemTermostato   = new ArrayList<>();
    
}
}
