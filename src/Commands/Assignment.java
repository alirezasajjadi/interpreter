//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Commands;

import Main.Management;

public class Assignment extends Command {

    public Assignment(String arg1, int arg2) {
        operator = arg2;
        try {
            Management.integerHashMap.put(arg1, operator);
        } catch (IllegalArgumentException e) {
            System.err.println("can't assignment");
        }
    }

    public Assignment(String arg1, float arg2) {
        operator1 = arg2;
        try {
            Management.floatHashMap.put(arg1, operator1);
        } catch (IllegalArgumentException e) {
            System.err.println("can't assignment");
        }
    }

}
