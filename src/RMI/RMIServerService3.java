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
public interface RMIServerService3 extends Remote{
    public String send(String msg) throws RemoteException;
    //客户加入群组的远程方法，在name中包含自己的学号和姓名
    public String addClientToOnLine(RMIClientService client, String name) throws RemoteException;
    //客户退出群组的远程方法
    public String delClientFromOnLine(RMIClientService client) throws RemoteException;
    //客户发送聊天信息的远程方法
    public void sendMessageToServer(String msg)throws RemoteException;
}
