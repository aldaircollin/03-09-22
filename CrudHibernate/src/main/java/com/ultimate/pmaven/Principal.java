/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ultimate.pmaven;

import com.ultimate.dao.ClienteJpaController;
import com.ultimate.dao.exceptions.NonexistentEntityException;
import com.ultimate.dominio.Cliente;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author Admin
 */
public class Principal {

    private static Scanner sc = new Scanner(System.in);
    private static Scanner st = new Scanner(System.in);
    private static Cliente c;
    private static ClienteJpaController clienteDao = new ClienteJpaController();
    private static int opcion, id;

    public static void main(String[] args) throws Exception {

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("-----------Elija una opciòn: ----------");
        System.out.println("---------------------------------------");
        System.out.println("------ 1: Mostrar Clientes por Codigo ------");
        System.out.println("------ 2: Agregar Cliente ------");
        System.out.println("------ 3: Actualizar Cliente  ------");
        System.out.println("------ 4: Eliminar Cliente  ------");
        System.out.println("------ 5: Listar Clientes  ------");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                //Mostrar Cliente por ID
                c = obtenerCliente();
                System.out.println(c);
                break;
            case 2: {

                //Agregar Cliente
                c = getCliente();
                if (clienteDao.crearCliente(c)) {
                    System.out.println("Se ingreso el Cliente");
                } else {
                    System.out.println("No se ingreso el Cliente");
                }

            }
            break;

            case 3:
                //Actualizar Cliente
                c = obtenerCliente();
                System.out.println(c);
                System.out.println("Ingrese el Nombre , Apellido , Fecha Nacimiento Nuevos :");
                c = new Cliente(id, st.nextLine(), st.nextLine(), st.nextLine());

                try {
                    clienteDao.editarCliente(c);
                    System.out.println("se actualizo el cliente");
                } catch (Exception ex) {
                    System.out.println("No se pudo actualizar el Cliente ....");
                }

                break;
            case 4:
                //Eliminar Cliente

                c = obtenerCliente();
                System.out.println("Cliente a Eliminar");
                System.out.println(c);

                try {
                    clienteDao.eliminarCliente(id);
                    System.out.println("Cliente Eliminado Correctamente");
                } catch (NonexistentEntityException ex) {
                    System.out.println("No se pudo Eliminar el Cliente");
                }

                break;
            case 5:
                //listar Cliente
                List<Cliente> clientes = clienteDao.listarClientes();
                for (Iterator<Cliente> iterator = clientes.iterator(); iterator.hasNext();) {
                    Cliente next = iterator.next();
                    System.out.println(next);
                }
                break;
            default:
                System.out.println("Opcion Fuera de Rango...");
        }
        clienteDao.cerrar();

    }

    private static Cliente getCliente() {
        System.out.println("Ingrese el Codigo, Nombre , Apellido , Fecha Nacimiento :");
        Cliente c = new Cliente(sc.nextInt(), st.nextLine(), st.nextLine(), st.nextLine());
        return c;
    }

    private static Cliente obtenerCliente() {
        System.out.println("Ingrese un Codigo");
        id = sc.nextInt();
        c = clienteDao.findCliente(id);
        return c;

    }
}
