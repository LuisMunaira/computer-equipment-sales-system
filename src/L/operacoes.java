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
    private validacao vv;
    private Ficheiro nm;

    public operacoes() {
        nm = new Ficheiro();
        lista = new Vector();
        vv = new validacao();
    }

    public void receber() throws IOException {

        lista = nm.ler(lista);

    }

    public void inserir() throws IOException {
        //Ficheiro fc = new Ficheiro();
        nm.inserir(lista);

    }

    public int getquant() {
        return lista.size();
    }

    public void AdEquipamento() throws IOException {
        int b = 0, r = 0;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t1.Computador \n\t2.Impressora");
        try {
            r = Integer.parseInt(x.readLine());
        } catch (NumberFormatException c) {
            System.out.println("Erro");
        }

        switch (r) {
            case 1:
                System.out.println("\t1.Desktop \n\t2.Laptop\t");
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

            case 2:
                validacao vv = new validacao();
                impressora kk = new impressora(vv.validarsboolean("Objecto de SCANNER"),
                        vv.validarint("Numero da Serie *******: ", 1000000, 9999999),
                        vv.validarstring("Marca : ", 0, 15),
                        vv.validarfloat("Preco : ", 1000, 100000));
                lista.addElement(kk);
                lista.trimToSize();
                break;
        }
    }

    public void adddesktop() throws IOException {

        desktop dk = new desktop(vv.validarstring("Intro. Marca do Equipamento:", 1, 15),
                vv.validarstring("Capacidade do Monitor : ", 1, 15),
                vv.validarstring("Processador : ", 1, 15),
                vv.validarstring("Memoria : ", 1, 10),
                vv.validarint("Numero da Serie *******: ", 1000000, 9999999),
                vv.validarstring("Marca do Monitor : ", 2, 7),
                vv.validarfloat("Preco do Monitor : ", 1000, 100000));
        lista.addElement(dk);
        lista.trimToSize();

    }

    public void addLeptop() throws IOException {
        leptop lp = new leptop(vv.validarsboolean("Touch Screan"),
                vv.validarstring("Intro. Capacidade do Laptop :", 1, 15),
                vv.validarstring("Processador do Laptop : ", 1, 15),
                vv.validarstring("Memoria : ", 1, 10),
                vv.validarint("Numero da Serie *******: ", 1000000, 9999999),
                vv.validarstring("Marca do Laptop : ", 2, 7),
                vv.validarfloat("Preco do Laptop : ", 1000, 100000));
        lista.addElement(lp);
        lista.trimToSize();

    }

    public void listarEquipamentos() throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int m = 0, c = 0;
        System.out.println("\t1.Computador");
        System.out.println("\t2.Impressora");
        try {
            m = Integer.parseInt(x.readLine());
        } catch (NumberFormatException ff) {
            System.out.println("Ocorreu um erro na conversao");
        } catch (IOException nn) {
            System.out.println("Ocorreu um erro");
        }
        switch (m) {
            case 1: //case 1 principal
                System.out.println("\t1.Desktop\n\t2.Laptop");
                try {
                    c = Integer.parseInt(x.readLine());
                } catch (NumberFormatException ff) {
                    System.out.println("Ocorreu um erro na conversao");
                } catch (IOException nn) {
                    System.out.println("Ocorreu um erro");
                }
                switch (c) {
                    case 1:  // case 1 secundario
                        String ver = "";
                        Equipamento eq;
                        desktop ds;
                        for (int j = 0; j < lista.size(); j++) {
                            eq = (Equipamento) lista.elementAt(j);
                            if (eq instanceof desktop) {
                                ds = (desktop) eq;
                                ver += ds.toString();
                            }
                        }
                        System.out.println(ver);

                        break;
                    case 2:  // case 2 secundario
                        String v = "";
                        Equipamento equi;
                        leptop lp;
                        for (int j = 0; j < lista.size(); j++) {
                            equi = (Equipamento) lista.elementAt(j);
                            if (equi instanceof leptop) {
                                lp = (leptop) equi;
                                v += lp.toString();
                            }
                        }
                        System.out.println(v);

                        break;
                    default:
                        System.out.println("Erro!");
                }
                break;
            case 2:   // case 2 primario
                String ver = "";
                Equipamento equ;
                impressora im;
                for (int j = 0; j < lista.size(); j++) {
                    equ = (Equipamento) lista.elementAt(j);
                    if (equ instanceof impressora) {
                        im = (impressora) equ;
                        ver += im.toString();
                    }
                }
                System.out.println(ver);

                break;
            default:
                System.out.println("Erro!");
        }
    }

    public void calcularmediaLEPTOP_DELL() {
        String v = "";
        int contador = 0;
        float media = 0, soma = 0;
        Equipamento equi;
        leptop lp;
        for (int j = 0; j < lista.size(); j++) {
            equi = (Equipamento) lista.elementAt(j);
            if (equi instanceof leptop) {
                lp = (leptop) equi;
                if (lp.getMarca().equalsIgnoreCase("dell")) {
                    soma = lp.getPreco() + soma;
                    contador = contador + 1;
                }
            }

        }
        media = soma / contador;
        System.out.println("-----------******************---------\n");
        System.out.println("<><><><><><><>\nMedia dos Leptopsc da Marca Dell :  " + media + "\n<><><><><><><>");
        System.out.println("-----------******************---------\n");
    }

    public void ordenarSERIE() {
        Ordenar ord = new Ordenar();
        ord.ordenar(lista);

    }

    public void estatistica() {
        String v = "";
        int cont1 = 0, cont2 = 0, cont3 = 0;
        float media = 0, soma = 0;
        Equipamento equi;
        leptop lp;
        impressora im;
        desktop ds;
        for (int j = 0; j < lista.size(); j++) {
            equi = (Equipamento) lista.elementAt(j);
            if (equi instanceof leptop) {
                cont1 = cont1 + 1;
            } else if (equi instanceof impressora) {
                cont2 = cont2 + 1;
            } else if (equi instanceof desktop) {
                cont3 = cont3 + 1;
            }

        }
        System.out.println("-----------******ESTATISTICA******---------");
        System.out.println("Total de Laptops : " + cont1);
        System.out.println("Total de Desktop's : " + cont3);
        System.out.println("Total de Impressoras : " + cont2);
        System.out.println("\tTOTAL DE EQUIPAMENTOS : " + (cont1 + cont2 + cont3));
        System.out.println("-----------******************---------\n");

    }
}
