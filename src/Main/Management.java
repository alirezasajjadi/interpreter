//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Main;

import Recognize.*;

import java.util.HashMap;

public class Management {
    private String[] tokens;
    public static boolean separator = false;
    public static HashMap<String, Integer> integerHashMap = new HashMap<>();
    public static HashMap<String, Float> floatHashMap = new HashMap<>();
    public static boolean isFor = false;

    public Management(String[] tokens) {
        setTokens(tokens);
        RecognizeType rectype = new RecognizeType(getTokens());
        RecognizeCommand reccom = new RecognizeCommand(getTokens());

        if (this.tokens[0].equalsIgnoreCase("%%")) {
            separator = true;
        }
        if (separator) {
            try {
                reccom.recognizeCommand();
            } catch (NullPointerException | IllegalArgumentException e) {
                e.printStackTrace();
            }
        } else {
            try {
                rectype.recognizeDataType();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }

    }

    public String[] getTokens() {
        return tokens;
    }

    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }

}
