/**
 *
 * @author Jacob Kapusta
 */

import java.io.*;
import java.net.Socket;
import java.util.LinkedList;

public class ClientHandler implements Runnable{
    private Socket client;
    private LinkedList<Socket> clients;
    
    public ClientHandler(Socket client, LinkedList<Socket> clients){
        this.client = client;
        this.clients = clients;
    }
    @Override
    public void run(){
        try{
            //BufferedReader inFromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
            //DataOutputStream outToClient = new DataOutputStream(client.getOutputStream());
            
            InputStream in = client.getInputStream();
            //DataInputStream inFromClient = new DataInputStream(in);
            
            OutputStream out;// = client.getOutputStream(); 
            DataOutputStream outToClient;// = new DataOutputStream(out);
            
            
            byte sound_digits[] = new byte[17640];
            int numBytesRead;
    
                for(;;){
                    try{
                        numBytesRead = in.read(sound_digits);

                        for(Socket socket : clients){
                            if(socket != client){
                                out = socket.getOutputStream();
                                outToClient = new DataOutputStream(out);
                                outToClient.write(sound_digits, 0, sound_digits.length);
                            }
                        }
                    }
                    catch(IOException e){
                        clients.remove(client);
                        //System.out.print(clients.size());
                        break;
                    }
                }
        }
        catch(Exception e){
            System.err.print(e);
        } 
    }
}
