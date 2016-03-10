/**
 *
 * @author Jacob Kapusta
 */

import java.io.*;
import java.net.*;
import javax.sound.sampled.*;

public class client implements Runnable{
    private final String username;
    private final String hostname;
    private final String port;
    
    public client(String username, String hostname, String port){
        this.username = username;
        this.hostname = hostname;
        this.port = port;
    }
    
    @Override
    public void run(){
        AudioFormat format = new AudioFormat(44100, 16, 2, true, true);
        
        DataLine.Info targetInfo = new DataLine.Info(TargetDataLine.class, format); //Read from
        DataLine.Info sourceInfo = new DataLine.Info(SourceDataLine.class, format); //Write to
        
        
        
        String sentence;
        String modifiedSentence;
        try{
            Socket client = new Socket(hostname, Integer.parseInt(port));
            
            OutputStream out = client.getOutputStream(); 
            DataOutputStream outToServer = new DataOutputStream(out);
            InputStream in = client.getInputStream();
            
            //DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            TargetDataLine microphone = (TargetDataLine) AudioSystem.getLine(targetInfo);
            microphone.open(format);
            microphone.start();
            
            
            SourceDataLine speakers = (SourceDataLine) AudioSystem.getLine(sourceInfo);
            
            
            speakers.open(format);
            speakers.start();
            
            
            sentence = username;
            
            int numBytesRead;
            byte[] targetData = new byte[microphone.getBufferSize() / 5];
            byte[] receivedData = new byte[microphone.getBufferSize() / 5];
            
            //SoundListener soundlistener = new SoundListener(speakers, format, client, soundMuted);
            //Thread listener = new Thread(soundlistener);
            //listener.start();
            
            for(;;){
                numBytesRead = microphone.read(targetData, 0, targetData.length);
		//if (numBytesRead == -1)	break;
                //speakers.write(targetData, 0, numBytesRead);
                //System.out.println("From mic: " + targetData);
                //outToServer.writeBytes(sentence + "\n");
                outToServer.write(targetData, 0, targetData.length);
                numBytesRead = in.read(receivedData);
                
                if(!gui.GUI.SoundMuted()){
                    speakers.write(receivedData, 0, numBytesRead);
                }
                //speakers.write(receivedData, 0, numBytesRead);
                
                //modifiedSentence = inFromServer.readLine();
                //System.out.println(modifiedSentence);
            }
        }
        catch(IOException | LineUnavailableException e){
            System.err.print(e);
        }
    }
}
