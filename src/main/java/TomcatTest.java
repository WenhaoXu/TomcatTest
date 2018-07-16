package java;

import java.net.ServerSocket;

public class TomcatTest {
    private  final static int PORT=8080;

    public static void main(String[] args) {
        try{
            ServerSocket server =new ServerSocket(PORT);
            ServletHander servletHander=new ServletHander(server);
            servletHander.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
