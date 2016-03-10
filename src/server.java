/**
 *
 * @author Jacob Kapusta
 */

import java.io.*;
import java.net.*;
import java.util.LinkedList;

public class server implements Runnable {
    private final String port;
    
    public server(String p) {
        port = p;
    }
    
    @Override
    public void run() {
        try{
            ServerSocket server = new ServerSocket();
            InetSocketAddress address = new InetSocketAddress("0.0.0.0", Integer.parseInt(port));
            server.bind(address);
            
            ClientHandler client_handler;
            LinkedList<Socket> clients = new LinkedList<>();
            
            for(;;){
                clients.add(server.accept());
                //System.out.println(clients.size() + "\n");
                client_handler = new ClientHandler(clients.getLast(), clients);
                Thread t = new Thread(client_handler);
                t.start();
            }
        }
        catch(IOException e){
            System.err.print(e);
        }
    }
}
