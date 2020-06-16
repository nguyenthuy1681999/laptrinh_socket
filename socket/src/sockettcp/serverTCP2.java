/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockettcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;

/**
 *
 * @author Win 8.1 VS 10 Update
 */
public class serverTCP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        ServerSocket connection = new ServerSocket( 6786);
        while (true) {            
            Socket serverDk = connection.accept();
            DataOutputStream dataOut = new DataOutputStream(serverDk.getOutputStream());
            DataInputStream dataIn = new DataInputStream(serverDk.getInputStream());
            int a = dataIn.readInt();
            int b = dataIn.readInt();
            int c= a+b;
            int d = a-b;
            int e = a*b;
            float g =(float) a/(float)b;
            dataOut.writeInt(c);
            dataOut.writeInt(d);
            dataOut.writeInt(e);
             dataOut.writeFloat(g);
        }
       
        
    }
    
}