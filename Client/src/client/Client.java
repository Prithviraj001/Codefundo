/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.io.IOException;
import java.net.InetAddress;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.Clock;
import java.util.Scanner;
/**
 *
 * @author prithuuu
 */
public class Client{

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
        InetAddress inet=InetAddress.getLocalHost();
        Socket s=new Socket(inet.getHostName(), 7856);
        s.close();        
    }
    
}
