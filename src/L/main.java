/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L;

import java.io.*;

/**
 *
 * @author Facadmin
 */
public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int resp, a = 0;
        validacao vv = new validacao();
        Ficheiro fch = new Ficheiro();

     
        operacoes operacao = new operacoes();
         operacao.receber();
        
        do {

            System.out.println("1.Adicionar Equipamento ");
            System.out.println("2.Ver Equipamentos ");
            System.out.println("3.Ordenar Os equipamentos/ Serie ");
            System.out.println("4.Media de cada Equipamento (Laptop)DELL");
            System.out.println("5.Estatistica dos equipamentos ");
            System.out.println("6.Sair ");
            try {
                a = Integer.parseInt(x.readLine());
            } catch (NumberFormatException ff) {
                System.out.println("Ocorreu um erro na conversao");
            } catch (IOException nn) {
                System.out.println("Ocorreu um erro");
            }
            switch (a) {
                case 1:
                    operacao.AdEquipamento();
                    operacao.inserir();
                    break;
                case 2:
                     operacao.listarEquipamentos();
                    break;
                case 3:operacao.ordenarSERIE();
                       operacao.inserir();
                    System.out.println("\n-----------************---------\nEquipamentos Ordenados com Sucesso"
                            + "\n#Continue o programa e Verifique\n-----------************---------\n");
                    break;
                case 4:operacao.calcularmediaLEPTOP_DELL();
                    break;
                case 5: operacao.estatistica();
                    break;
                case 6:System.out.println("Fechando");
                    break;
                default:
                    System.out.println("Erro");
            }
            resp = vv.validarresp("\t1.Continuar\n\t0.Encerrar\n", 0, 1);
        } while (resp == 1);
    }
}
