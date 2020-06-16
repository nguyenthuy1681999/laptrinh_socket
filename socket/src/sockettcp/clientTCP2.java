/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockettcp;

import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 */
public class clientTCP2 {
    
    public static void main(String[] args) throws IOException {
        Scanner input  = new Scanner(System.in);
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        Socket client = new  Socket("127.0.0.1",  6786);
        DataOutputStream data = new DataOutputStream(client.getOutputStream());
        System.out.println("Nhap a:");
        int a = input.nextInt();
        data.writeInt(a);
          System.out.println("Nhap b:");
          
          int b ;
          while (true) {            
            b= input.nextInt();
              if (b!=0) {
                break;  
              }
            System.out.println("Nhap b !=0");   
        }
          
        data.writeInt(b);
        
        DataInputStream dataIn = new DataInputStream(client.getInputStream());
        int c= dataIn.readInt();
        System.out.println(a+" + "+b+ " = "+c);
         int d= dataIn.readInt();
        System.out.println(a+" - "+b+ " = "+d);
           int e= dataIn.readInt();
        System.out.println(a+" * "+b+ " = "+e);
           float g= dataIn.readFloat();
        System.out.println(a+" / "+b+ " = "+g);
    }
            
}
