//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Commands;

import Main.Management;

public class Print extends Command {

    private String print;

    public Print(String print) {
        setPrint(print);

    }

    public void print() throws Exception {

        if (Management.integerHashMap.containsKey(print)) {
            System.out.println(Management.integerHashMap.get(print));

        } else if (Management.floatHashMap.containsKey(print)) {
            System.out.println(Management.floatHashMap.get(print));

        } else {
            throw new Exception("There isn't variable with name you want to print");
        }
    }

    public void setPrint(String print) {
        this.print = print;
    }

}
