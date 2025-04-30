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
public class computador extends Equipamento{
   protected String capacidade;
   protected String processador;
   protected String memoria;

    public computador(String capacidade, String processador, String memoria, int numserie, String marca, float preco) {
        super(numserie, marca, preco);
        this.capacidade = capacidade;
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCOMPUTADOR" + "\nCapacidade = " + capacidade + "\nProcessador = " + processador + "\nMemoria = " + memoria + "\n";
    }
   
}
