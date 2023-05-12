/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomatico;


import java.util.ArrayList;
import java.util.Scanner;
import models.ListaUsuariosConstructor;
import models.UsuariosConstructor;

/**
 *
 * @author Sebas
 */
public class Usuarios {
    
    static Scanner Console = new Scanner(System.in);
    static ArrayList<ListaUsuariosConstructor> Usuarios = new ArrayList<ListaUsuariosConstructor>();
    
    static String Username, Nombre, Apellido; 
    static int ID, Codigo;
    
    public static void CrearNuevoUsuario() {
        ArrayList <UsuariosConstructor> Usuario = new ArrayList<UsuariosConstructor>();
        System.out.println("Ingrese el ID que desea colocarle a este usuario");
        ID = Console.nextInt();
        System.out.println("Ingrese el username que desea darle a su cuenta");
        Username = Console.next();
        System.out.println("Cree un codigo para su cuenta (este codigo le permitira aprobar transacciones, etc...)");
        Codigo = Console.nextInt();
        System.out.println("Ingrese su nombre");
        Nombre = Console.next();
        System.out.println("Ingrese su apellido");
        Apellido = Console.next();
        Usuario.add(new UsuariosConstructor(ID, Username, Codigo, Nombre, Apellido,0.00));
        System.out.println("Usuario agregado exitosamente");
    }
}
