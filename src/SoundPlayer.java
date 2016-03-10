/**
 *
 * @author Jacob
 */

import javax.sound.sampled.*;

public class SoundPlayer implements Runnable{
    private SourceDataLine speakers;
    private AudioFormat format;
    private byte[] data;
    private int numBytesRead;
    
    
    public SoundPlayer(SourceDataLine speakers, AudioFormat format, byte[] data, int numBytesRead){
        this.speakers = speakers;
        this.format = format;
        this.data = data;
        this.numBytesRead = numBytesRead;
    }
    @Override
    public void run(){
        try{
            speakers.open(format);
            speakers.start();
            speakers.write(data, 0, numBytesRead);
        }
        catch(LineUnavailableException e){
            System.err.print(e);
        }
    }
}
