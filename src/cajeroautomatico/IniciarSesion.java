/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomatico;

import static Resources.Colors.ANSI_RED;
import static Resources.Colors.ANSI_WHITE;
import static cajeroautomatico.CajeroAutomatico.MenuOpcionesCajeroAutomatico;
import java.util.ArrayList;
import java.util.Scanner;
import models.UsuariosConstructor;

/**
 *
 * @author Sebas
 */
public class IniciarSesion {
    static Scanner Console = new Scanner(System.in);
    static ArrayList <UsuariosConstructor> Usuario = new ArrayList<UsuariosConstructor>();
    
    static String Username, Nombre, Apellido; 
    static int ID, Codigo;
    
    static void CrearNuevoUsuario() {
        System.out.println("Ingresa tus datos correctos para ingresar a tu cuenta de forma exitosa");
        System.out.println("ID");
        ID = Console.nextInt();
        System.out.print("Username: ");
        Username = Console.next();
        System.out.println("Codigo");
        Codigo = Console.nextInt();
        System.out.println("Ingrese su nombre");
        Nombre = Console.next();
        System.out.println("Ingrese su apellido");
        Apellido = Console.next();
        Usuario.add(new UsuariosConstructor(ID, Username, Codigo, Nombre, Apellido,0.00));
        System.out.println("Usuario añadido con exito");
    }
    
    static void IniciarSesion() {
        do{
            System.out.println("Ingresa a tu cuenta para consultar tu estatus");
            System.out.println("Username");
            Username = Console.next();
            System.out.println("Codigo");
            Codigo = Console.nextInt();
            if(Codigo == 2522) {
                System.out.println("En breve se te redireccionara al menu principal");
                Usuario.add(new UsuariosConstructor(1, Username, Codigo, "Sebastian", "Rios", 0.00));
                MenuOpcionesCajeroAutomatico(); 
            } else {
                if (Codigo != 2522) {
                    System.out.println(ANSI_RED + "Usuario y/o contraseña incorrectos" + ANSI_WHITE);
                }
            }
        } while (Codigo != 2522);
    }
    
    static void Menu() {
        System.out.println("Bienvenido al cajero mas seguro y confiable");
        System.out.println("Que desea. hacer?");
        System.out.println("Crear nuevo usuario..............................1");
        System.out.println("Iniciar sesion...................................2");
    }
    
    static void MenuOpciones(int Opcion) {
        switch(Opcion) {
            case 1: CrearNuevoUsuario(); break;
            case 2: IniciarSesion(); break;
        }
    }
    
    public static void MenuOpcionesIniciarSesion() {
        int Opcion;
        do {
        Menu();
        Opcion = Console.nextInt();
        MenuOpciones(Opcion);
        }while (Opcion != 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuOpcionesIniciarSesion();
    }   
}