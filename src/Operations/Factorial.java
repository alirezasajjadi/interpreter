//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Operations;

import Commands.Command;

public class Factorial extends Command {
    private int fact = 1;
    private int argument;

    public Factorial(int argument) {
        setArgument(argument);
    }

    public int calculate1() {

        for (int i = 1; i <= argument; i++) {
            fact *= i;
        }

        return fact;
    }

    public void setArgument(int argument) {
        this.argument = argument;
    }
}
