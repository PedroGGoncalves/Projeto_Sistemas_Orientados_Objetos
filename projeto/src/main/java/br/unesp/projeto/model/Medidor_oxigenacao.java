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
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;



@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity(name="Medidor de oxigenação")
public class Medidor_oxigenacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMedidor_Oxigenacao
    
    private float oxigenacao;
    
    public Medidor_oxigenacao () {
       // this.itemTermostato   = new ArrayList<>();
    }
}
