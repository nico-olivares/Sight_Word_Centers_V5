package SW;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Olivares
 */
public class Word_Bank {

    /*
    public static int sizeGetter(int theLevel) {
        int theSize = 0;
        switch (theLevel) {
            case 1:
                theSize = level1.length;
        }
        return theSize;
    }
    
    public static String wordGetter(int theLevel, int theIndex) {
        String returnWord = "";
        switch (theLevel) {
            case 1:
                returnWord = level1[theIndex];
        }
        return returnWord;
    }
     */
    public ArrayList<String> wordListGetter(int level) {

        
        
        switch (level) {
            case 1:
                String[] theLevel1 = {"a", "and", "are", "as", "at", "be", "for", "from", "have", "he", "his", "I", "in", "is", "it", "of", "on", "that", "the", "they", "this", "to", "was", "with", "you"};
                theList.clear();
                for (int i=0; i < theLevel1.length; i++) {
                    theList.add(theLevel1[i]);
                }
                break;
            case 2:
                String[] theLevel2 = {"may", "about", "all", "an", "been", "but", "by", "call", "can", "come", "could", "day", "did", "do", "down", "each", "find", "first", "get", "go", "had", "has", "her", "him", "how", "if", "into", "its", "like", "long", "look", "made", "make", "many", "more", "my", "no", "not", "now", "number", "oil", "one", "or", "other", "out", "part", "people", "said", "see", "she", "so", "some", "than", "their", "them", "then", "there", "these", "time", "two", "up", "use", "water", "way", "we", "were", "what", "when", "which", "who", "will", "word", "would", "write", "your"};
                theList.clear();
                for (int i=0; i < theLevel2.length; i++) {
                    theList.add(theLevel2[i]);
                }
                break;
               
            case 3:
                String[] theLevel3 = {"after", "also", "any", "around", "back", "before", "boy", "came", "follow", "form", "give", "good", "great", "help", "just", "know", "line", "little", "live", "man", "me", "mean", "most", "much", "name", "new", "old", "only", "our", "over", "place", "right", "same", "say", "sentence", "show", "small", "sound", "take", "tell", "thing", "think", "three", "through", "too", "very", "want", "where", "work", "year"};
                theList.clear();
                for (int i=0; i < theLevel3.length; i++) {
                    theList.add(theLevel3[i]);
                }
                break;
            case 4:
                String[] theLevel4 = {"again", "air", "America", "animal", "another", "answer", "ask", "away", "because", "big", "change", "different", "does", "end", "even", "found", "hand", "here", "home", "house", "kind", "land", "large", "learn", "letter", "men", "mother", "move", "must", "need", "off", "page", "picture", "play", "point", "put", "read", "set", "should", "spell", "still", "study", "such", "try", "turn", "us", "well", "went", "why", "world"};
                theList.clear();
                for (int i=0; i < theLevel4.length; i++) {
                    theList.add(theLevel4[i]);
                }
                break;
            case 5:
                String[] theLevel5 = {"above", "add", "almost", "along", "always", "began", "begin", "being", "below", "between", "book", "both", "car", "carry", "children", "city", "close", "country", "cut", "don’t", "earth", "eat", "enough", "every", "example", "eye", "family", "far", "father", "feet", "few", "food", "four", "girl", "got", "group", "grow", "hard", "head", "hear", "high", "idea", "important", "Indian", "it’s", "keep", "last", "later", "leave", "left", "let", "life", "light", "list", "might", "mile", "miss", "mountain", "near", "never", "next", "night", "often", "once", "open", "own", "paper", "plant", "really", "river", "run", "saw", "school", "sea", "second", "seem", "side", "something", "sometimes", "song", "soon", "start", "state", "stop", "story", "talk", "those", "thought", "together", "took", "tree", "under", "until", "walk", "watch", "while", "white", "without", "young"};
                theList.clear();
                for (int i=0; i < theLevel5.length; i++) {
                    theList.add(theLevel5[i]);
                }
                break;
            case 6:
                String[] theLevel6 = {"sun", "across", "against", "area", "become", "best", "better", "birds", "black", "body", "certain", "cold", "color", "complete", "covered", "cried", "didn’t", "dog", "door", "draw", "during", "early", "easy", "ever", "fall", "farm", "fast", "field", "figure", "fire", "fish", "five", "friends", "ground", "happened", "heard", "himself", "hold", "horse", "hours", "however", "hundred", "I’ll", "king", "knew", "listen", "low", "map", "mark", "measure", "money", "morning", "music", "north", "notice", "numeral", "order", "passed", "pattern", "piece", "plan", "problem", "products", "pulled", "question", "reached", "red", "remember", "rock", "room", "seen", "several", "ship", "short", "since", "sing", "slowly", "south", "space", "stand", "step", "sure", "table", "today", "told", "top", "toward", "town", "travel", "unit", "upon", "usually", "voice", "vowel", "war", "waves", "whole", "wind", "wood"};
                theList.clear();
                for (int i=0; i < theLevel6.length; i++) {
                    theList.add(theLevel6[i]);
                }
                break;
            case 7:
                String[] theLevel7 = {"above", "add", "almost", "along", "always", "began", "begin", "being", "below", "between", "book", "both", "car", "carry", "children", "city", "close", "country", "cut", "don’t", "earth", "eat", "enough", "every", "example", "eye", "facet", "family", "far", "father", "feet", "few", "food", "four", "girl", "got", "group", "grow", "hard", "head", "hear", "high", "idea", "important", "Indian", "it’s", "keep", "last", "later", "leave", "left", "let", "life", "light", "list", "might", "mile", "miss", "mountain", "near", "never", "next", "night", "often", "once", "open", "own", "paper", "plant", "really", "river", "run", "saw", "school", "sea", "second", "seem", "side", "something", "sometimes", "song", "soon", "start", "state", "stop", "story", "talk", "those", "thought", "together", "took", "tree", "under", "until", "walk", "watch", "while", "white", "without", "young"};
                theList.clear();
                for (int i=0; i < theLevel7.length; i++) {
                    theList.add(theLevel7[i]);
                }
                break;
            case 8:
                String[] theLevel8 = {"The people.",
                    "Write it down.",
                    "By the water.",
                    "Who will make it?",
                    "You and I.",
                    "What will they do?",
                    "He called me.",
                    "We had their dog.",
                    "What did they say?",
                    "When would you go?",
                    "No way.",
                    "A number of people.",
                    "One or two.",
                    "How long are they?",
                    "More than the other.",
                    "Come and get it.",
                    "How many words?",
                    "Part of the time.",
                    "This is a good day.",
                    "Can you see?",
                    "Sit down.",
                    "Now and then.",
                    "But not me.",
                    "Go find her.",
                    "Not now.",
                    "Look for some people.",
                    "I like him.",
                    "So there you are.",
                    "Out of the water.",
                    "A long time.",
                    "We were here.",
                    "Have you seen it?",
                    "Could you go?",
                    "One more time.",
                    "We like to write.",
                    "All day long.",
                    "Into the water.",
                    "It's about time.",
                    "The other people.",
                    "Up in the air.",
                    "She said to go.",
                    "Which way?",
                    "Each of us.",
                    "He has it.",
                    "What are these?",
                    "If we were older.",
                    "There was an old man.",
                    "It's no use.",
                    "It may fall down.",
                    "With his mom.",
                    "I need help.",
                    "I work too much.",
                    "Any old time.",
                    "Through the line.",
                    "Right now.",
                    "Mother means it.",
                    "Same time tomorrow.",
                    "Tell the truth.",
                    "A little boy.",
                    "The following day.",
                    "We came home.",
                    "We want to go.",
                    "Show us around.",
                    "Form two lines.",
                    "A small house also.",
                    "Another old picture.",
                    "Write one sentence.",
                    "This must be it.",
                    "Hand it over.",
                    "Such a big house.",
                    "The men asked for help.",
                    "A different land.",
                    "They went here.",
                    "Get to the point.",
                    "Because we should.",
                    "Even the animals.",
                    "Try your best.",
                    "Move over.",
                    "We found it here.",
                    "Study and learn.",
                    "Kind of nice.",
                    "Spell your name.",
                    "The good American.",
                    "Change your clothes.",
                    "Play it again.",
                    "Back off.",
                    "Give it away.",
                    "Answer the phone.",
                    "Turn the page.",
                    "The air is warm.",
                    "Read my letters.",
                    "It's still here.",
                    "Where in the world.",
                    "Big and small.",
                    "Home sweet home.",
                    "Around the clock.",
                    "Show and tell.",
                    "You must be right.",
                    "Tell the truth.",
                    "Good and plenty.",
                    "Help me out.",
                    "It turned out well.",
                    "Do it often.",
                    "We walked for miles.",
                    "Until the end.",
                    "A second later.",
                    "Stop the music.",
                    "Read your book.",
                    "Sing your song.",
                    "State your case.",
                    "I miss you.",
                    "A very important person.",
                    "On my side.",
                    "I took the car.",
                    "So far so good.",
                    "The young girl.",
                    "My feet hurt.",
                    "The dark night.",
                    "A good idea.",
                    "It began to grow.",
                    "Watch the river.",
                    "White clouds.",
                    "Too soon.",
                    "Leave it to me.",
                    "I hear the waves.",
                    "Almost enough.",
                    "Is it really true?",
                    "It's time to eat.",
                    "Let me carry it.",
                    "Near the sea.",
                    "Talk to my father.",
                    "The young face.",
                    "The long list.",
                    "My family.",
                    "I cut myself.",
                    "Above the clouds.",
                    "Watch the game.",
                    "The peaceful Indians.",
                    "Without a care.",
                    "I like being on the team.",
                    "The tall mountains.",
                    "Next to me.",
                    "A few children.",
                    "A long life.",
                    "A group of Indians.",
                    "He started to cry.",
                    "I hear the sea.",
                    "An important idea.",
                    "The first day of school.",
                    "Almost four miles."};
                theList.clear();
                for (int i=0; i < theLevel8.length; i++) {
                    theList.add(theLevel8[i]);
                }
                break;
            case 9:
                String[] theLevel9 = {"sat", "anything", "arms", "beautiful", "believe", "beside", "bill", "blue", "brother", "can’t", "cause", "cells", "center", "clothes", "dance", "describe", "developed", "difference", "direction", "discovered", "distance", "divided", "drive", "drop", "edge", "eggs", "energy", "Europe", "exercise", "farmers", "felt", "finished", "flowers", "forest", "general", "glass", "gone", "happy", "heart", "held", "instruments", "interest", "job", "kept", "lay", "legs", "length", "love", "main", "matter", "meet", "members", "million", "mind", "months", "moon", "paint", "paragraph", "past", "perhaps", "picked", "present", "probably", "race", "rain", "raised", "ready", "reason", "record", "region", "represent", "return", "root", "shall", "sign", "simple", "sit", "sky", "soft", "square", "store", "subject", "suddenly", "sum", "summer", "syllables", "teacher", "test", "third", "train", "wall", "weather", "west", "whether", "wide", "wild", "window", "winter", "wish", "written"};
                theList.clear();
                for (int i=0; i < theLevel9.length; i++) {
                    theList.add(theLevel9[i]);
                }
                break;
            case 10:
                String[] theLevel10 = {"act", "Africa", "age", "already", "although", "amount", "angle", "appear", "baby", "bear", "beat", "bed", "bottom", "bright", "broken", "build", "buy", "care", "case", "cat", "century", "consonant", "copy", "couldn’t", "count", "cross", "dictionary", "died", "dress", "either", "everyone", "everything", "exactly", "factors", "fight", "fingers", "floor", "fraction", "free", "French", "gold", "hair", "hill", "hole", "hope", "ice", "instead", "iron", "jumped", "killed", "lake", "laughed", "lead", "let’s", "lot", "melody", "metal", "method", "middle", "milk", "moment", "nation", "natural", "outside", "per", "phrase", "poor", "possible", "pounds", "pushed", "quiet", "quite", "remain", "result", "ride", "rolled", "sail", "scale", "section", "sleep", "smiled", "snow", "soil", "solve", "someone", "son", "speak", "speed", "spring", "stone", "surprise", "tall", "temperature", "themselves", "tiny", "trip", "type", "village", "within", "wonder"};
                theList.clear();
                for (int i=0; i < theLevel10.length; i++) {
                    theList.add(theLevel10[i]);
                }
                break;
            case 11:
                String[] theLevel11 = {"alone", "art", "bad", "bank", "bit", "break", "brown", "burning", "business", "captain", "catch", "caught", "cents", "child", "choose", "clean", "climbed", "cloud", "coast", "continued", "control", "cool", "cost", "decimal", "desert", "design", "direct", "drawing", "ears", "east", "else", "engine", "England", "equal", "experiment", "express", "feeling", "fell", "flow", "foot", "garden", "gas", "God", "grass", "grew", "history", "human", "hunting", "increase", "information", "itself", "joined", "key", "lady", "law", "least", "lost", "maybe", "mouth", "party", "pay", "period", "plains", "please", "practice", "president", "received", "report", "ring", "rise", "row", "save", "seeds", "sent", "separate", "serve", "shouted", "single", "skin", "statement", "stick", "straight", "strange", "students", "suppose", "symbols", "team", "touch", "trouble", "uncle", "valley", "visit", "wear", "whose", "wire", "woman", "wrote", "yard", "you’re", "yourself"};
                theList.clear();
                for (int i=0; i < theLevel11.length; i++) {
                    theList.add(theLevel11[i]);
                }
                break;
            case 12:
                String[] theLevel12 = {"addition", "army", "bell", "belong", "block", "blood", "blow", "board", "bones", "branches", "cattle", "chief", "compare", "compound", "consider", "cook", "corner", "crops", "crowd", "current", "doctor", "dollars", "eight", "electric", "elements", "enjoy", "entered", "except", "exciting", "expect", "famous", "fit", "flat", "fruit", "fun", "guess", "hat", "hit", "indicate", "industry", "insects", "interesting", "Japanese", "lie", "lifted", "loud", "major", "meat", "mine", "modern", "movement", "necessary", "observe", "park", "particular", "planets", "poem", "pole", "position", "process", "property", "provide", "rather", "rhythm", "rich", "safe", "sand", "science", "sell", "send", "sense", "seven", "sharp", "shoulder", "sight", "silent", "soldiers", "spot", "spread", "stream", "string", "suggested", "supply", "swim", "tail", "terms", "thick", "thin", "thus", "tied", "tone", "trade", "tube", "value", "wash", "wasn’t", "weight", "wife", "wings", "won’t"};
                theList.clear();
                for (int i=0; i < theLevel12.length; i++) {
                    theList.add(theLevel12[i]);
                }
                break;
            case 13:
                String[] theLevel13 = {"march", "action", "actually", "adjective", "afraid", "agreed", "ahead", "allow", "apple", "arrived", "born", "bought", "British", "capital", "chance", "chart", "church", "column", "company", "conditions", "corn", "cotton", "cows", "create", "dead", "deal", "death", "details", "determine", "difficult", "division", "doesn’t", "effect", "entire", "especially", "evening", "experience", "factories", "fair", "fear", "fig", "forward", "France", "fresh", "Greek", "gun", "huge", "isn’t", "led", "level", "located", "match", "molecules", "nor", "northern", "nose", "office", "opposite", "oxygen", "plural", "prepared", "pretty", "printed", "radio", "repeated", "rope", "rose", "score", "seat", "settled", "shoes", "shop", "similar", "sir", "sister", "smell", "solution", "southern", "steel", "stretched", "substances", "suffix", "sugar", "tools", "total", "track", "triangle", "truck", "underline", "various", "view", "Washington", "we’ll", "western", "win", "women", "workers", "wouldn’t", "wrong", "yellow"};
                theList.clear();
                for (int i=0; i < theLevel13.length; i++) {
                    theList.add(theLevel13[i]);
                }
                break;

            default:
                String[] theLevel14 = {"a", "and", "are", "as", "at", "be", "for", "from", "have", "he", "his", "I", "in", "is", "it", "of", "on", "that", "the", "they", "this", "to", "was", "with", "you"};
                theList.clear();
                for (int i=0; i < theLevel14.length; i++) {
                    theList.add(theLevel14[i]);
                }
                break;
        }
        return theList;
    }

    private static ArrayList<String> theList = new ArrayList<String>();
    
}
