/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L;
import java.io.*;
import java.util.Vector;

/**
 *
 * @author FENG 08
 */
public class Ordenar{

    public Ordenar() {
    }
 
    public void ordenar(Vector val) {
        int maior;
        Equipamento aux1, aux2;
        int num = val.size();
        for (int i = 0; i < num -1; i++) {
            maior = chamarMaior(val, i);
            aux1 = (Equipamento)val.elementAt(i);
            aux2 = (Equipamento)val.elementAt(maior);
            val.setElementAt(aux2,i);
            val.setElementAt(aux1,maior);

        }

    }

    public int chamarMaior(Vector v, int valor) {
        int max = valor;
        Equipamento auxi1, auxi2;
        for (int j = valor + 1; j < v.size(); j++) {
            auxi1 = (Equipamento) v.elementAt(j);
            auxi2 = (Equipamento) v.elementAt(max);
            if (auxi1.getNumserie() > auxi2.getNumserie()) {
                max = j;
            }
        }
        return max;
    }

}
