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


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Termostato {
    @Id
    private int temperatura;
    
    public Termostato () {
       // this.itemTermostato   = new ArrayList<>();
    }
    
    public int gettemperatura() {
        return temperatura;
    }

    public void settemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) ((this.temperatura >>> 32) ^ this.temperatura);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Termostato other = (Termostato) obj;
        if (this.temperatura != other.temperatura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Termostato{" + "temperatura=" + temperatura + '}';
    }
}
