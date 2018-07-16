package java;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServletHander extends Thread {

    ServerSocket serverSocket=null;

    public ServletHander(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        while (true){
            Socket client=null;
            try {
                client =serverSocket.accept();//ServerSocket阻塞等待客户端请求数据
                if(client!=null){
                    try{
                        System.out.println("接收到客户端的一个请求");
                        
                    }catch(){

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
