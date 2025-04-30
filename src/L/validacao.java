package L;

import java.io.*;

/**
 *
 * 
 */
public class validacao {

    public validacao() {
    }

    public String validarstring(String msg, int min, int max) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String a = null;
        do {
            System.out.print(msg);
            try {
                a = x.readLine();
            } catch (NumberFormatException ff) {
                System.out.println("Ocorreu um erro na conversao");
            } catch (IOException nn) {
                System.out.println("Ocorreu um erro");
            }
            if (a.length() < min || a.length() > max) {
                System.out.println("Dado Invalido");
            }

        } while (a.length() < min || a.length() > max);
        return a;
    }

    public int validarint(String msg, int min, int max) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        do {
            System.out.print(msg);
            try {
                b = Integer.parseInt(x.readLine());
            } catch (NumberFormatException ff) {
                System.out.println("Ocorreu um erro na conversao");
            } catch (IOException nn) {
                System.out.println("Ocorreu um erro");
            }
            if (b < min || b > max) {
                System.out.println("Dado Invalido");
            }

        } while (b < min || b > max);
        return b;
    }

    public float validarfloat(String msg, int min, int max) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        float c = 0;

        do {
            System.out.print(msg);
            try {
                c = Float.parseFloat(x.readLine());
            } catch (NumberFormatException ff) {
                System.out.println("Ocorreu um erro na conversao");
            } catch (IOException nn) {
                System.out.println("Ocorreu um erro");
            }
            if (c < min || c > max) {
                System.out.println("Dado Invalido");
            }

        } while (c < min || c > max);

        return c;
    }

    public short validarresp(String msg, int min, int max) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        short d = 0;
        do {
            System.out.print(msg);
            try {
                d = Short.parseShort(x.readLine());
            } catch (NumberFormatException ff) {
                System.out.println("Ocorreu um erro na conversao");
            } catch (IOException nn) {
                System.out.println("Ocorreu um erro");
            }
            if (d < min || d > max) {
                System.out.println("Dado Invalido");
            }

        } while (d < min || d > max);
        return d;
    }
    public boolean validarsboolean(String mgs) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String a = null;
        boolean res = false; 
        int b;
           System.out.println("O Equipamento possue "+mgs+" ?");
            System.out.println("\n\t1.Verdade\n\t2.falso");
            b = Integer.parseInt(x.readLine());
            switch(b){
                case 1: res = true; break;
                case 2: res = false ; break;
                default : System.out.println("erro");
            }
       
        return res;
    }
}
