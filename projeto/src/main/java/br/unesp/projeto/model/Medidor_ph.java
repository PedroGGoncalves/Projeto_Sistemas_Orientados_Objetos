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


@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Medidor_ph {
    @Id
    private int ph;
    
    public Medidor_ph () {
       // this.itemTermostato   = new ArrayList<>();
    }
    
    public int getph() {
        return ph;
    }

    public void setph(int ph) {
        this.ph = ph;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) ((this.ph >>> 32) ^ this.ph);
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
        final Medidor_ph other = (Medidor_ph) obj;
        if (this.ph != other.ph) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medidor_ph{" + "ph=" + ph + '}';
    }
}
