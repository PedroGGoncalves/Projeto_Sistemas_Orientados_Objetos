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
import javax.persistence.Column;
import javax.persistence.Embeddable;




@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Login implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    
    
    @Column(name = "login_ID")
    private String ID;
    
    
    @Column(name = "login_Senha")
    private String Senha;
    
    public Login() {

    }
      
}
