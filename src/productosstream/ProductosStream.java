package productosstream;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Yasmin
 */
public class ProductosStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        Product po1 = new Product("cod1","parafusos",3);
        Product po2 = new Product("cod2","arandelas",4);
        Product po3 = new Product();
        
        DataOutputStream write = new DataOutputStream(new FileOutputStream("productos.txt"));
        
        write.writeUTF(po1.getCodigo());
        write.writeUTF(po1.getDescripcion());
        write.writeInt(po1.getPrezo());
        
        write.writeUTF(po2.getCodigo());
        write.writeUTF(po2.getDescripcion());
        write.writeInt(po2.getPrezo());
        
        write.close();
        
        DataInputStream read=new DataInputStream(new FileInputStream("productos.txt"));
        
        po3.setCodigo(read.readUTF());
        po3.setDescripcion(read.readUTF());
        po3.setPrezo(read.readInt());
        System.out.println(po3.getCodigo());
        System.out.println(po3.getDescripcion());
        System.out.println(po3.getPrezo());
        
        read.close();
    }
    
}
