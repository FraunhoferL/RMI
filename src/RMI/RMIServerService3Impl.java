/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author asus
 */
public class RMIServerService3Impl extends UnicastRemoteObject implements RMIServerService3{

      //默认构造方法
   public RMIServerService3Impl( )throws RemoteException{ }
 
    
    HashSet<RMIClientService>  onLine=new HashSet<RMIClientService>();
    
    @Override
    public String send(String msg) throws RemoteException {
        System.out.println(msg);
        return "来自20171003203 张宇暄服务器的返回："+msg;
    }

    @Override
    public String addClientToOnLine(RMIClientService client, String name) throws RemoteException {
        onLine.add(client);
        return name;
    }

    @Override
    public String delClientFromOnLine(RMIClientService client) throws RemoteException {
        onLine.remove(client);
        return client.toString();
    }

    @Override
    public void sendMessageToServer(String msg) throws RemoteException {
       Iterator<RMIClientService> it = onLine.iterator();
       while(it.hasNext()){
           it.next().showMessageToClient(msg);
       }
    }
    
}
