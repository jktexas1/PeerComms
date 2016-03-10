/**
 *
 * @author Jacob Kapusta
 */

import java.io.*;
import javax.sound.sampled.*;
import java.net.*;

public class SoundListener implements Runnable{
    private SourceDataLine speakers;
    private AudioFormat format;
    private Socket client;
    private boolean soundMuted;
    
    public SoundListener(SourceDataLine speakers, AudioFormat format, Socket client, boolean soundMuted){
        this.speakers = speakers;
        this.format = format;
        this.client = client;
        this.soundMuted = soundMuted;
    }
    @Override
    public void run(){
        try{
            //BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String incoming;
            
            InputStream in = client.getInputStream();
            //DataInputStream inFromServer = new DataInputStream(in);
            
            speakers.open(format);
            speakers.start();
            
            int numBytesRead;
            byte[] sourceData = new byte[17640];
            
            for(;;){
                //incoming = inFromServer.readLine();
                //System.out.println(incoming);
                long start = System.currentTimeMillis();
                
                numBytesRead = in.read(sourceData);
                
                long elapsedTimeMillis = System.currentTimeMillis()-start;
                
                System.out.println(elapsedTimeMillis + "\n");
                
                /*
                if(numBytesRead > 0){
                    inFromServer.readFully(sourceData);
                    System.out.println("From headphones: " + sourceData);
                }
                        */
                //SoundPlayer splayer = new SoundPlayer(speakers, format, sourceData, numBytesRead);
               // Thread t = new Thread(splayer);
                //t.start();
                if(!gui.GUI.SoundMuted()){
                    speakers.write(sourceData, 0, numBytesRead);
                }
                
            }
        }
        catch(IOException | LineUnavailableException e){
            System.err.print(e);
        }
                
    }
}
