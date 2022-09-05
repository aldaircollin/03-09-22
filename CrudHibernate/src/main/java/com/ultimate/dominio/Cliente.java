/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ultimate.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Admin
 */
@Entity
public class Cliente implements Serializable {

    @Id
    @Column(name="cCodigo")
    private int id;
    @Column(name="cNombre")
    private String nombre;
    @Column(name="cApellido")
    private String apellido;
    @Column(name="cFechaNac")
    private String FechaNac;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String FechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaNac = FechaNac;
    }



    public Cliente(int id, String nextLine, String nextLine0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

   
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", FechaNac=" + FechaNac + '}';
    }

   

  
}
