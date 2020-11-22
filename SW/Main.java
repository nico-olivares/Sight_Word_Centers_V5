package SW;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       gui.setVisible(true);
    }
    
    public static void setTheLevel(int level) {
        currentLevel = level;
        System.out.println("setTheLevel was called. The current level is " + currentLevel);
    }
    
    public static void setTheSpeed(int speed) {
        currentSpeed = speed;
        switch(speed) {
            case 0:
                currentSpeed = 1000L;
                break;
            case 1:
                currentSpeed = 1500L;
                break;
            case 2:
                currentSpeed = 2000L;
                break;
            case 3:
                currentSpeed = 2500L;
                break;
            case 4:
                currentSpeed = 3000L;
                break;
            default:
                currentSpeed = 1000L;
                break;
        }
        System.out.println("setTheSpeed was called. The speed is now " + currentSpeed);
    }
    
    
    
    public static void run() {
        isRunning = true;
        play();
    }
    
    public static void stop() {
        isRunning = false;
        indexList.clear();
        
            if (!pauseBoolean) {
        gui.labelSetter("Done!");
            } else {
                gui.labelSetter(lastWord2);
            }
        
        
    }
    
    public static void pause() {
       
            isRunning = false;
            pauseBoolean = true;
            lastWord2 = lastWord1;
    }
    
    private static void play() {
        wordList = wordBank.wordListGetter(currentLevel);
        pauseBoolean = false;
        if (currentLevel == 8) {
            gui.labelSize(100);
        } else {
            gui.labelSize(150);
        }
        indexSetter();
        getAndChangeTheWord();
        System.out.println("play was called");
    }
    
    private static void indexSetter() {
        for (int i=0; i<wordList.size(); i++) {
            indexList.add(i);
        }
        System.out.println("indexSetter was called. The index size is now " + indexList.size());
    }
    
    private static String wordGetter(int theIndex) {
        String returnWord = wordList.get(theIndex);
        return returnWord;
    }
    
    
    private static void getAndChangeTheWord() {
        int randomIndex = (int) (Math.random() * (indexList.size()) + 0);
        gui.labelSetter(wordGetter(indexList.get(randomIndex)));
        lastWord1 = wordGetter(indexList.get(randomIndex));
        
        if (withSound) {
        	speakIt(wordGetter(indexList.get(randomIndex)));
        }
        
        System.out.println("getAndChangeTheWord was called. The word is " + wordGetter(indexList.get(randomIndex)) + " and the randomIndex is " + randomIndex + ". The size of indexList is now " + indexList.size());
        indexList.remove(randomIndex);
        if (indexList.isEmpty()) {
            //isRunning = false;
            stop();
           
        }
        if (isRunning) {
            timer();
        } else {
            stop();
        }

        
        System.out.println("isRunning is now " + isRunning);
        
    }
    
    public static void speakIt(String text) {
    	Speaker speaker = new Speaker();
    	speaker.say(text);
    }
    
    private static void timer() {
        
            
            TimerTask timerTrigger;
            timerTrigger = new TimerTask() {
            @Override
            public void run() {
            getAndChangeTheWord();
            }
            };
            
            Timer theTimer = new Timer(true);
            
            System.out.println("timer was called. Speed is " + currentSpeed);
            
            theTimer.schedule(timerTrigger, currentSpeed);
            
            
        
    }
    
    public static boolean getRunningStatus() {
        return isRunning;
    }
    
    public static void setUpSound(boolean sound) {
    	withSound = sound;
    }
    
    
    private static Sight_Words_GUI gui = new Sight_Words_GUI();
    private static Word_Bank wordBank = new Word_Bank();
    private static ArrayList<String> wordList;
    private static int currentLevel = 1;
    private static long currentSpeed = 1000L;
    private static boolean withSound = false;
    private static boolean isRunning = false;
    private static ArrayList<Integer> indexList = new ArrayList<Integer>();
    private static boolean pauseBoolean = false;
    private static String lastWord1 = "";
    private static String lastWord2 = "";
    
    
}