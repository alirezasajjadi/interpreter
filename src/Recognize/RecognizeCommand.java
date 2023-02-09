//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Recognize;

import Main.*;
import Commands.*;
import Operations.*;

public class RecognizeCommand {
    private String[] tokens;

    public RecognizeCommand(String[] tokens) {
        setTokens(tokens);
    }

    public void recognizeCommand() throws NullPointerException, IllegalArgumentException {
        String arg1, arg2, arg3;
        String[] numbers = new String[99999];
        Sum sum = null;
        Submission submission = null;
        Divide divide = null;
        Multiply multiply = null;
        Factorial fact = null;

        for (int i = 0; i <= 99998; i++) {
            numbers[i] = String.valueOf(i);
            Management.integerHashMap.put(numbers[i], Integer.parseInt(numbers[i]));
        }
        if (tokens.length > 1) {
            if (tokens[1].equals("=")) {
                if (tokens.length == 5) {
                    arg1 = tokens[2];
                    arg2 = tokens[4];
                    switch (tokens[3]) {
                        case "+":
                            if (Management.integerHashMap.containsKey(arg1) && Management.integerHashMap.containsKey(arg2)) {
                                sum = new Sum<Integer>(Management.integerHashMap.get(arg1), Management.integerHashMap.get(arg2));
                                new Assignment(tokens[0], (int) sum.calculate());

                            } else if (Management.floatHashMap.containsKey(arg1) && Management.floatHashMap.containsKey(arg2)) {
                                sum = new Sum<Float>(Management.floatHashMap.get(arg1), Management.floatHashMap.get(arg2));
                                new Assignment(tokens[0], (float) sum.calculate());

                            } else {
                                throw new IllegalArgumentException("can't add two different types");
                            }
                            break;
                        case "-":
                            if (Management.integerHashMap.containsKey(arg1) && Management.integerHashMap.containsKey(arg2)) {
                                submission = new Submission<Integer>(Management.integerHashMap.get(arg1), Management.integerHashMap.get(arg2));
                                new Assignment(tokens[0], (int) submission.calculate());

                            } else if (Management.floatHashMap.containsKey(arg1) && Management.floatHashMap.containsKey(arg2)) {
                                submission = new Submission<Float>(Management.floatHashMap.get(arg1), Management.floatHashMap.get(arg2));
                                new Assignment(tokens[0], (float) submission.calculate());

                            } else {
                                throw new IllegalArgumentException("can't add two different types");
                            }
                            break;
                        case "/":
                            if (Management.integerHashMap.containsKey(arg1) && Management.integerHashMap.containsKey(arg2)) {
                                divide = new Divide<Integer>(Management.integerHashMap.get(arg1), Management.integerHashMap.get(arg2));
                                new Assignment(tokens[0], (int) divide.calculate());

                            } else if (Management.floatHashMap.containsKey(arg1) && Management.floatHashMap.containsKey(arg2)) {
                                divide = new Divide<Float>(Management.floatHashMap.get(arg1), Management.floatHashMap.get(arg2));
                                new Assignment(tokens[0], (float) divide.calculate());

                            } else {
                                throw new IllegalArgumentException("can't add two different types");
                            }
                            break;
                        case "*":
                            if (Management.integerHashMap.containsKey(arg1) && Management.integerHashMap.containsKey(arg2)) {
                                multiply = new Multiply<Integer>(Management.integerHashMap.get(arg1), Management.integerHashMap.get(arg2));
                                new Assignment(tokens[0], (int) multiply.calculate());

                            } else if (Management.floatHashMap.containsKey(arg1) && Management.floatHashMap.containsKey(arg2)) {
                                multiply = new Multiply<Float>(Management.floatHashMap.get(arg1), Management.floatHashMap.get(arg2));
                                new Assignment(tokens[0], (float) multiply.calculate());

                            } else {
                                throw new IllegalArgumentException("can't add two different types");
                            }
                            break;
                    }
                } else if (tokens.length == 7) {
                    arg1 = tokens[2];
                    arg2 = tokens[4];
                    arg3 = tokens[6];
                    if (tokens[3].equals("+") && tokens[5].equals("+")) {
                        if (Management.integerHashMap.containsKey(arg1) && Management.integerHashMap.containsKey(arg2) && Management.integerHashMap.containsKey(arg3)) {
                            sum = new Sum<Integer>(Management.integerHashMap.get(arg1), Management.integerHashMap.get(arg2), Management.integerHashMap.get(arg3));
                            new Assignment(tokens[0], (int) sum.calculate());
                        } else if (Management.floatHashMap.containsKey(arg1) && Management.floatHashMap.containsKey(arg2) && Management.floatHashMap.containsKey(arg3)) {
                            sum = new Sum<Float>(Management.floatHashMap.get(arg1), Management.floatHashMap.get(arg2), Management.floatHashMap.get(arg3));
                            new Assignment(tokens[0], (float) sum.calculate());
                        } else {
                            throw new IllegalArgumentException("can't add tree different types");
                        }

                    } else if (tokens[3].equals("-") && tokens[5].equals("-")) {
                        if (Management.integerHashMap.containsKey(arg1) && Management.integerHashMap.containsKey(arg2) && Management.integerHashMap.containsKey(arg3)) {
                            submission = new Submission<Integer>(Management.integerHashMap.get(arg1), Management.integerHashMap.get(arg2), Management.integerHashMap.get(arg3));
                            new Assignment(tokens[0], (int) submission.calculate());
                        } else if (Management.floatHashMap.containsKey(arg1) && Management.floatHashMap.containsKey(arg2) && Management.floatHashMap.containsKey(arg3)) {
                            submission = new Submission<Float>(Management.floatHashMap.get(arg1), Management.floatHashMap.get(arg2), Management.floatHashMap.get(arg3));
                            new Assignment(tokens[0], (float) submission.calculate());
                        } else {
                            throw new IllegalArgumentException("can't add tree different types");
                        }

                    } else if (tokens[3].equals("/") && tokens[5].equals("/")) {
                        if (Management.integerHashMap.containsKey(arg1) && Management.integerHashMap.containsKey(arg2) && Management.integerHashMap.containsKey(arg3)) {
                            divide = new Divide<Integer>(Management.integerHashMap.get(arg1), Management.integerHashMap.get(arg2), Management.integerHashMap.get(arg3));
                            new Assignment(tokens[0], (int) divide.calculate());
                        } else if (Management.floatHashMap.containsKey(arg1) && Management.floatHashMap.containsKey(arg2) && Management.floatHashMap.containsKey(arg3)) {
                            divide = new Divide<Float>(Management.floatHashMap.get(arg1), Management.floatHashMap.get(arg2), Management.floatHashMap.get(arg3));
                            new Assignment(tokens[0], (float) divide.calculate());
                        } else {
                            throw new IllegalArgumentException("can't add tree different types");
                        }
                    } else if (tokens[3].equals("*") && tokens[5].equals("*")) {
                        if (Management.integerHashMap.containsKey(arg1) && Management.integerHashMap.containsKey(arg2) && Management.integerHashMap.containsKey(arg3)) {
                            multiply = new Multiply<Integer>(Management.integerHashMap.get(arg1), Management.integerHashMap.get(arg2), Management.integerHashMap.get(arg3));
                            new Assignment(tokens[0], (int) multiply.calculate());
                        } else if (Management.floatHashMap.containsKey(arg1) && Management.floatHashMap.containsKey(arg2) && Management.floatHashMap.containsKey(arg3)) {
                            multiply = new Multiply<Float>(Management.floatHashMap.get(arg1), Management.floatHashMap.get(arg2), Management.floatHashMap.get(arg3));
                            new Assignment(tokens[0], (float) multiply.calculate());
                        } else {
                            throw new IllegalArgumentException("can't add tree different types");
                        }
                    }
                } else if (tokens.length == 4) {
                    if (tokens[3].equals("!")) {
                        if (Management.integerHashMap.containsKey(tokens[2])) {
                            fact = new Factorial(Management.integerHashMap.get(tokens[2]));
                            new Assignment(tokens[0], fact.calculate1());
                        }
                    }
                } else if (tokens.length == 3) {
                    if (Management.integerHashMap.containsKey(tokens[2])) {
                        new Assignment(tokens[0], Management.integerHashMap.get(tokens[2]));
                    } else {
                        new Assignment(tokens[0], Management.floatHashMap.get(tokens[2]));
                    }
                } else {
                    throw new NullPointerException("expression can't be null");
                }
            } else if (!((tokens[0].equals("for")) || (tokens[0]).equals("print"))) {
                throw new IllegalArgumentException("Invalid input");
            }
        }
        if (tokens.length == 1 && !Program.nullline) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (tokens[0].equals("print")) {
            Print p1 = new Print(tokens[1]);
            try {
                p1.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (tokens[0].equals("for") && !Management.isFor) {
            Management.isFor = true;
            new Loop(tokens[1]);
        }
    }

    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }

}

