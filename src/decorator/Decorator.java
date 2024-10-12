/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

public class Decorator {
    public static void main(String[] args) {
        Cafe cafeSimple = new CafeSimple();
        Cafe cafeConLeche = new Leche(cafeSimple);
        Cafe cafeConLecheYAzucar = new Azucar(cafeConLeche);

        System.out.println("Costo del café con leche y azúcar: " + cafeConLecheYAzucar.costo());  // Salida: 8.0
    }
}

