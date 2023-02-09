//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Operations;

import Commands.Command;

public class Multiply<T> extends Command implements Calculable {

    private T argument1;
    private T argument2;
    private T argument3;
    private boolean isTwoArg;


    public Multiply(T argument1, T argument2) {
        setArgument1(argument1);
        setArgument2(argument2);
        isTwoArg = true;
    }

    public Multiply(T argument1, T argument2, T argument3) {
        setArgument1(argument1);
        setArgument2(argument2);
        setArgument3(argument3);
        isTwoArg = false;
    }

    @Override
    public T calculate() {
        T multiply;
        if (isTwoArg) {
            if (argument1 instanceof Integer) {
                Object mul1 = Integer.parseInt(argument1.toString()) * Integer.parseInt(argument2.toString());
                multiply = (T) mul1;
                return multiply;
            } else if (argument1 instanceof Float) {
                Object mul2 = Float.parseFloat(argument1.toString()) * Float.parseFloat(argument2.toString());
                multiply = (T) mul2;
                return multiply;
            }
        } else if (!isTwoArg) {
            if (argument1 instanceof Integer) {
                Object mul1 = Integer.parseInt(argument1.toString()) *
                        Integer.parseInt(argument2.toString()) *
                        Integer.parseInt(argument3.toString());
                multiply = (T) mul1;
                return multiply;
            } else if (argument1 instanceof Float) {
                Object mul2 = Float.parseFloat(argument1.toString()) *
                        Float.parseFloat(argument2.toString()) *
                        Float.parseFloat(argument3.toString());
                multiply = (T) mul2;
                return multiply;
            }
        }
        return null;
    }

    public void setArgument1(T argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(T argument2) {
        this.argument2 = argument2;
    }

    public void setArgument3(T argument3) {
        this.argument3 = argument3;
    }

}