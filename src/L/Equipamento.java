/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L;
import java.io.*;

public class Equipamento implements Serializable {
    protected int numserie;
    protected String marca;
    protected float preco;

    public Equipamento(int numserie, String marca, float preco) {
        this.numserie = numserie;
        this.marca = marca;
        this.preco = preco;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "EQUIPAMENTO" + "\nNumero serie = " + numserie + "\nMarca = " + marca + "\nPreco = " + preco + "\n";
    }
    
}
