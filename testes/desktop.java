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
public class desktop extends computador {
    private String marcaMonitor;

    public desktop(String marcaMonitor, String capacidade, String processador, String memoria, int numserie, String marca, float preco) {
        super(capacidade, processador, memoria, numserie, marca, preco);
        this.marcaMonitor = marcaMonitor;
    }

    public String getMarcaMonitor() {
        return marcaMonitor;
    }

    public void setMarcaMonitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }

    @Override
    public String toString() {
        return "\nDesktop.." + "Marca do Monitor=" + marcaMonitor + "\n";
    }
    
}
