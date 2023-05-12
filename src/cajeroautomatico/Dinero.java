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
import models.ListaUsuariosConstructor;
import models.UsuariosConstructor;

/**
 *
 * @author Sebas
 */
public class Dinero {
    
    static ArrayList<UsuariosConstructor> User = new ArrayList<>(); 
    static ArrayList<ListaUsuariosConstructor> Usuarios = new ArrayList<ListaUsuariosConstructor>();
    static Scanner Console = new Scanner(System.in);
    static int ID = 1;
    static String Username, Cancelar;
    static double SaldoActual = .00;
    
    public static void AgregarSaldo() { 
        System.out.println("Ingresa el monto a ingresar");
        System.out.print("$");
        SaldoActual = User.get(ID).getSaldoActual();
        double AñadirSaldo = Console.nextDouble();
        SaldoActual = SaldoActual + AñadirSaldo; 
        User.get(ID).setSaldoActual(SaldoActual);
        System.out.println("Saldo añadido de forma exitosa");
    }
    
    public static void StatusUsuario() {
        User.add(new UsuariosConstructor (1, "freligio008", 2522, "Sebastian", "Rios", 0.00));
        System.out.print(User.toString());
        System.out.println(User.get(ID).getSaldoActual());
    }
    
    public static void RetirarSaldo() {
        System.out.println("Ingresa la cantidad que deseas retirar");
        System.out.print("$");
        double SaldoActual = User.get(ID).getSaldoActual();
        double RetirarSaldo = Console.nextDouble();
        SaldoActual = SaldoActual - RetirarSaldo;
        User.get(ID).setSaldoActual(SaldoActual);
        System.out.println("Usted ha retirado" + SaldoActual);
        }
    
    public static void TransferirSaldo() {
        int Opcion;
        double SaldoActual;
        double TransferirSaldo;
        Usuarios.add(new ListaUsuariosConstructor(1, "manmay21", "Manuel", "May", 8000.00));
        Usuarios.add(new ListaUsuariosConstructor (2, "brayanchan", "Brayan", "Chan", 5000.00));
        Usuarios.add(new ListaUsuariosConstructor(3, "gaelmoo987", "Gael", "Moo", 6000.00));
        Usuarios.add(new ListaUsuariosConstructor(4, "abrilaglv", "Abril", "Aguilar", 7000.00));
        System.out.println("Destinatario");
        System.out.println("Nuevo....................1");
        System.out.println("Guardados................2");
        System.out.println("Cancelar operacion.......3");
        Opcion = Console.nextInt();
        switch(Opcion) {
            case 1: 
                Cancelar = "Cancelar";
                System.out.println("Guardar nuevo usuario");
                System.out.println("Ingrese un ID ");
                int NuevoUsuarioGuardadoID = Console.nextInt();
                System.out.println("Ingrese un usuario");
                String NuevoUsuarioGuardadoUsername = Console.next();
                System.out.println("Ingrese un nombre");
                String NuevoUsuarioGuardadoNombre = Console.next();
                System.out.println("Ingrese un apellido");
                String NuevoUsuarioGuardadoApellido = Console.next();
                Usuarios.add(new ListaUsuariosConstructor(NuevoUsuarioGuardadoID, NuevoUsuarioGuardadoUsername, NuevoUsuarioGuardadoNombre, NuevoUsuarioGuardadoApellido, 0.00));
                System.out.println("Usuario guardado exitosamente");
                System.out.println("");
                System.out.println("Importe");
                System.out.print("$");
                SaldoActual = User.get(ID).getSaldoActual();
                TransferirSaldo = Console.nextDouble();
                System.out.println("Tienes $" + SaldoActual + "pesos");
                if(TransferirSaldo > SaldoActual) {
                    System.out.println(ANSI_RED + "Saldo insuficiente. Ingresa un importe igual o menos a tu saldo de");
                    System.out.println(ANSI_RED + "$" + SaldoActual + "para completar la transferencia" + ANSI_WHITE);
                } else {
                    if(TransferirSaldo < SaldoActual) {
                        SaldoActual = SaldoActual - TransferirSaldo;
                        System.out.println("Despues de la transferencia en tu cuenta quedaran" + SaldoActual);
                        System.out.println("Concepto");
                        String Concepto = Console.next();
                        Concepto = Console.nextLine();
                        System.out.println("Transferencia exitosa de: "+ TransferirSaldo);
                        System.out.println("Esta transferencia no genera comision");
                        System.out.println("");
                        int UsuarioGuardadoID = NuevoUsuarioGuardadoID;
                        System.out.println(User.get(ID).getUsername() + " -> " + Usuarios.get(UsuarioGuardadoID).getUsername());
                        System.out.println("");
                        System.out.println("Concepto");
                        System.out.println(Concepto);
                    } else {
                        if(Cancelar == "Cancelar") {
                            MenuOpcionesCajeroAutomatico();
                        }     
                    }
                }
                break;
            case 2: 
                Cancelar = "Cancelar";
                System.out.println("Ingresa el ID del usuario al que le deseas transferir una cantidad");
                int UsuarioReceptorID = Console.nextInt();
                Usuarios.get(UsuarioReceptorID);
                System.out.println("Importe");
                System.out.print("$");
                SaldoActual = User.get(ID).getSaldoActual();
                System.out.println("Tienes $" + SaldoActual + " pesos");
                TransferirSaldo = Console.nextDouble();
                if(TransferirSaldo > SaldoActual) {
                    System.out.println("Saldo insuficiente. Ingresa un importe igual o menos a tu saldo de");
                    System.out.println("$" + SaldoActual + " pesos para completar la transferencia");
                } else {
                    if(TransferirSaldo < SaldoActual) {
                        SaldoActual = SaldoActual - TransferirSaldo;
                        System.out.println("Despues de la transferencia en tu cuenta quedaran" + SaldoActual + " pesos");
                        System.out.println("Concepto");
                        String Concepto = Console.next();
                        Concepto = Console.nextLine();
                        System.out.println("Transferencia exitosa de: "+ TransferirSaldo);
                        System.out.println("Esta transferencia no genera comision");
                        System.out.println("");
                        System.out.println(User.get(ID).getUsername() + " -> " + Usuarios.get(UsuarioReceptorID).getUsername());
                        System.out.println("");
                        System.out.println("Concepto");
                        System.out.println(Concepto);
                    } else {
                        if(Cancelar == "Cancelar") {
                            MenuOpcionesCajeroAutomatico();
                        }
                    }
                }
                break;
            case 3: MenuOpcionesCajeroAutomatico(); break;
        }
    }
}
