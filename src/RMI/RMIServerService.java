/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author asus
 */
public interface RMIServerService extends Remote{
    //远程方法之一
     public String send(String msg) throws RemoteException;
    //远程方法之二
     public String send(String yourNo, byte[] yourName) throws RemoteException;
}
