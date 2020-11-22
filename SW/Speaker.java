package SW;

import java.util.Set;

import javax.sound.sampled.AudioInputStream;
import marytts.LocalMaryInterface;
import marytts.MaryInterface;
import marytts.exceptions.MaryConfigurationException;
import marytts.exceptions.SynthesisException;
import marytts.util.data.audio.AudioPlayer;
 
public class Speaker
{
    private MaryInterface marytts;
    private AudioPlayer ap;
    private String voiceName = "cmu-slt-hsmm";
            
    public Speaker()
    {
        try
        {
            marytts = new LocalMaryInterface();
            marytts.setVoice(voiceName);
            
            ap = new AudioPlayer();
        }
        catch (MaryConfigurationException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void say(String input)
    {
        try
        {
            AudioInputStream audio = marytts.generateAudio(input);
            
            ap.setAudio(audio);
            ap.start();
            
            
        }
        catch (SynthesisException ex)
        {
            System.err.println("Error saying phrase.");
        }
    }
    
    public void stopSaying() {
    	ap.interrupt();
    }
    
    public  Set<String> getVoices() {
    	return marytts.getAvailableVoices();
    }
}