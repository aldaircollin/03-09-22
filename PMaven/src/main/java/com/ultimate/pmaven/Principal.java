/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ultimate.pmaven;

import com.ultimate.dominio.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author Admin
 */
public class Principal {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidadPersistencia");
        
        EntityManager em = emf.createEntityManager();
        
        Cliente c = em.find(Cliente.class, 1);
        
        System.out.println("------------------");
        System.out.println("---------RESULTADO---------");
        System.out.println("------------------");
        System.out.println("CODIGO " + c.getId());
        System.out.println("NOMBRE " + c.getNombre());
        System.out.println("APELLIDO " + c.getApellido());
        System.out.println("FECHA DE NACIMIENTO " + c.getFechaNac());
        System.out.println("------------------");
        em.close();
        emf.close();
    }
    
}
