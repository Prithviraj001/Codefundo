/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.ArrayList;
/**
 *
 * @author prithuuu
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    
    
    static ServerSocket s;
    static int port=7856;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here    
        ArrayList<Thread> t=new ArrayList();
        ArrayList<Runnable> r=new ArrayList();
        SignalClass signal=new SignalClass();
        s=new ServerSocket(port);
        while(true){
            Socket soc=s.accept(); 
            ClientThread runnable=new ClientThread(soc,signal);
            Thread thread=new Thread(runnable);
            t.add(thread);
            r.add(runnable);
            thread.start();
            
        }     
    }
        
}
    

