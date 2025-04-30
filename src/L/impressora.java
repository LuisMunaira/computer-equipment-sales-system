/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L;

/**
 *
 * @author Facadmin
 */
public class impressora extends  Equipamento{
   private  boolean scan;

    public impressora(boolean scan, int numserie, String marca, float preco) {
        super(numserie, marca, preco);
        this.scan = scan;
        this.preco = preco + 1000;
    }

    public boolean isScan() {
        return scan;
    }

    public void setScan(boolean scan) {
        this.scan = scan;
    }

    @Override
    public String toString() {
        return super.toString()+"\nIMPRESSORA " + "scan  -->" + scan + "<--\n-----------************---------\n";
    }
   
}
