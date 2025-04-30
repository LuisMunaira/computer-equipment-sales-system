package L;


import java.io.*;
import java.util.Vector;

/**
 *
 * @author Facadmin
 */
public class Ficheiro {
//private Vector list;

    private Vector vet;
    
    public Ficheiro(){
     vet = new Vector();
    }

    public void ler(Vector vet) {
        try {
            FileInputStream f = new FileInputStream("C:\\Users\\Facadmin\\Documents\\NetBeansProjects\\ValidacaoPOO\\src\\L\\Equipamento.java");
            ObjectInputStream bb = new ObjectInputStream(f);
            vet = (Vector) bb.readObject();
            bb.close();
   
        } catch (ClassNotFoundException | IOException z) {
            System.out.println(z.getMessage());
        }
    }
    
    public void inserir(Vector vet) throws IOException{
    try {
    
    FileOutputStream fs = new FileOutputStream("C:\\Users\\Facadmin\\Documents\\NetBeansProjects\\ValidacaoPOO\\src\\L\\Equipamento.java");
    ObjectOutputStream gg = new ObjectOutputStream(fs);
    gg.writeObject(vet);
    gg.close();
    
    }catch(FileNotFoundException s){System.out.println(s.getMessage());}
    
    
    }

}
