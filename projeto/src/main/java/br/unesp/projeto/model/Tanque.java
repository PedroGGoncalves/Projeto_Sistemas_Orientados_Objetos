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


@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Tanque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // private List<Comida> alimento;
    // private List<Especies> especie;
    private long idTanque;
    private int individuos;
    private float ph;
    private float salinidade;
    private float oxigenacao;
    private String horario_alimento;
    private boolean filtro;
    private String QR_CODE;
    private Termostato termostato;
    private Medidor_ph medidor_ph;
    private Medidor_salinidade medidor_salinidade;
    private Medidor_oxigenacao medidor_oxigenacao;
    /*temperatura termostato seria a msm do tanque?*/
    
    public Tanque() {

    }

}
