/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prithuuu
 */

class SignalClass{
    
    void FractolValueCalculation(){
        int fv=0;
        while(true){
            if(fv>2000){
                funNotify();
            }
        }
        
    }
    
    int calculateFractolValue(){
        int fv=0;
        //fractal value calculation
        return fv;
    }
    
    synchronized void funWait() throws InterruptedException{
        wait();
    }
    synchronized void funNotify(){
        notifyAll();
    }
}

public class ClientThread implements Runnable{
    Socket soc;
    static SignalClass s;
    public ClientThread(Socket soc,SignalClass s){
        this.soc=soc;
        this.s=s;
    }
    
    public Socket getSocket(){
        return soc;
    }
    @Override
    public void run(){
        try {
            s.funWait();
        } catch (InterruptedException ex) {
            Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Alert Received");
    }
}
