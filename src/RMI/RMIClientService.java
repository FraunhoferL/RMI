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
public interface RMIClientService extends Remote{
     //刷新聊天信息的方法，该方法供服务器调用
    public void showMessageToClient(String msg)throws RemoteException;
}
