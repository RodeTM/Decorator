/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

public abstract class CafeDecorador implements Cafe {
    protected Cafe cafe;

    public CafeDecorador(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double costo() {
        return cafe.costo();
    }
}
