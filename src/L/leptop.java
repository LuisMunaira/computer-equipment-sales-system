/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L;

/**
 * public boolean verificar() {
        String res = " ";
        if (this.touchpad == true) {
            res = "touch";
        } else if (this.touchpad == true) {
            res = "Nao Touch";
        }
        return res;
    }
 * @author Facadmin
 */
public class leptop extends computador {

    private boolean touchpad;

    public leptop(boolean touchpad, String capacidade, String processador, String memoria, int numserie, String marca, float preco) {
        super(capacidade, processador, memoria, numserie, marca, preco);
        this.touchpad = touchpad;//verificar();
        this.preco = preco + 1200;
    }

   

    public boolean isTouchpad() {
        return touchpad;
    }

    public void setTouchpad(boolean touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLEPTOP " + "touchpad -->" + touchpad + "<--\n-----------************---------\n";
    }

}
