package L;


import java.io.*;
import java.util.Vector;

/**
 *
 * @author Facadmin
 */
public class Ficheiro {


  
    
    public Ficheiro(){
  
    }

    public Vector ler(Vector vet) {
        try {
            FileInputStream f = new FileInputStream("F:\\L\\src\\L\\Equipamento.dat");
            ObjectInputStream bb = new ObjectInputStream(f);
            vet = (Vector) bb.readObject();
            bb.close();
   
        } catch (ClassNotFoundException | IOException z) {
            System.out.println(z.getMessage());
        }
        return vet;
    }
    
    public void inserir(Vector vet) throws IOException{
    try {
    
    FileOutputStream fs = new FileOutputStream("F:\\L\\src\\L\\Equipamento.dat");
    ObjectOutputStream gg = new ObjectOutputStream(fs);
    gg.writeObject(vet);
    gg.close();
    
    }catch(FileNotFoundException s){System.out.println(s.getMessage());}
    
    
    }

}
