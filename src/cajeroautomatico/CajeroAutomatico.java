/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomatico;


import static cajeroautomatico.Dinero.AgregarSaldo;
import static cajeroautomatico.Dinero.StatusUsuario;
import static cajeroautomatico.Dinero.RetirarSaldo;
import static cajeroautomatico.Dinero.TransferirSaldo;
import static cajeroautomatico.IniciarSesion.MenuOpcionesIniciarSesion;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class CajeroAutomatico {
    
    static void Menu() {
        System.out.println("Que quieres hacer?");
        System.out.println("Agregar saldo....................1");
        System.out.println("Consultar saldo..................2");
        System.out.println("Retirar saldo....................3");
        System.out.println("Transferir saldo.................4");
        System.out.println("Cerrar sesion....................5");
    }
    
    static void MenuOpciones(int Opcion) {
        switch(Opcion) {
            case 1: AgregarSaldo(); break;
            case 2: StatusUsuario(); break;
            case 3: RetirarSaldo(); break;
            case 4: TransferirSaldo(); break;
            case 5: 
                System.out.println("Cerrando sesion");
                MenuOpcionesIniciarSesion(); break;
        }
    }
    
    public static void MenuOpcionesCajeroAutomatico() {
        int Opcion;
        do {
        Scanner Console = new Scanner(System.in);
        Menu();
        Opcion = Console.nextInt();
        MenuOpciones(Opcion); 
        } while(Opcion != 5);
    }
}