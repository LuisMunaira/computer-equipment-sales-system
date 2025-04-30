/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L;

//import java.util.*;
import java.io.*;
import java.util.Vector;

/**
 *
 * @author Facadmin
 */
public class operacoes {
    private Vector lista;

    public operacoes() {
        lista = new Vector();
    }

    public void receber() throws IOException {
        Ficheiro nm = new Ficheiro();
        nm.ler(lista);

    }

    public int getquant() {
        return lista.size();
    }

    public void AdEquipamento() throws IOException {
        int b = 0, r = 0;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Computador \n2.Impressora");
        try {
            r = Integer.parseInt(x.readLine());
        } catch (NumberFormatException c) {
            System.out.println("Erro");
        }

        switch (r) {
            case 1:
                System.out.println("1.Desktop \n2.Leptop");
                try {
                    b = Integer.parseInt(x.readLine());
                } catch (NumberFormatException c) {
                    System.out.println("Erro");
                }
                switch (b) {
                    case 1:
                        adddesktop();
                        break;
                    case 2:
                        addLeptop();
                        break;
                    default:
                        System.out.println("Erro");
                }
                break;

            case 2:  validacao vv = new validacao();
                  
            impressora kk = new impressora(vv.validarsboolean("Scan ",0, 10),vv.validarint("Numero da Serie : ",0, 10),vv.validarstring("Marca : ", 0, 15),vv.validarfloat("Preco : ", 1000, 100000));
                   lista.addElement(kk);
                   lista.trimToSize();
                break;
        }
    }
    
    
    public void adddesktop(){
    
    
    
    }
    public void addleptop(){}
}
