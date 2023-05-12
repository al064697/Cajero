/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public class ListaUsuariosConstructor {
    private int ID;
    private String Username;
    private String Nombre, Apellido;
    private double SaldoActual;

    public ListaUsuariosConstructor() {
    }

    public ListaUsuariosConstructor(int ID, String Username, String Nombre, String Apellido, double SaldoActual) {
        this.ID = ID;
        this.Username = Username;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.SaldoActual = SaldoActual;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    @Override
    public String toString() {
        return ID + " - Usuario: " + Username + " | Nombre=" + Nombre +  Apellido;
    }
    
}
