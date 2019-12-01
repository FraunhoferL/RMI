/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author asus
 */

public class RMIServerServiceImpl extends UnicastRemoteObject implements RMIServerService{
    //默认构造方法
  public RMIServerServiceImpl( )throws RemoteException{ }
 
  public String send(String msg)throws RemoteException{
      System.out.println(msg);
       return "来自20171003203 张宇暄服务器的返回："+msg;
}

//第二个send()方法的实现同学们选做 
 public String send(String yourNo,byte[] yourName) throws RemoteException{
    
     String name = new String(yourName);
     System.out.println(yourNo + name);
     return "已收到" + yourNo + name;  
  //这是一段在服务器端实现的课堂实验记分程序
}
}

