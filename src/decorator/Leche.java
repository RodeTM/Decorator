/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

public class Leche extends CafeDecorador {
    public Leche(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double costo() {
        return super.costo() + 2.0;
    }
}
