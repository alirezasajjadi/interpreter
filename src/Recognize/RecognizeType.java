//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************

package Recognize;

import java.lang.String;

import Main.Management;

public class RecognizeType {

    private String[] tokens;

    public RecognizeType(String[] tokens) {
        setTokens(tokens);
    }

    public void recognizeDataType() throws IllegalArgumentException {
        if (tokens[0].equals("int")) {
            if (!Management.integerHashMap.containsKey(tokens[1])) {
                if (tokens.length == 4)
                    Management.integerHashMap.put(tokens[1], Integer.parseInt(tokens[3]));
                else
                    Management.integerHashMap.put(tokens[1], 0);
            } else {
                throw new IllegalArgumentException("duplicate variable exists");
            }
        } else if (tokens[0].equals("float")) {
            if (!Management.floatHashMap.containsKey(tokens[1])) {
                if (tokens.length == 4)
                    Management.floatHashMap.put(tokens[1], Float.parseFloat(tokens[3]));
                else
                    Management.floatHashMap.put(tokens[1], (float) 0);
            } else {
                throw new IllegalArgumentException("duplicate variable exists");
            }
        }
    }

    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }

}


