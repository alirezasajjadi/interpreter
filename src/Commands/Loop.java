//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Commands;

import Main.Program;
import Recognize.*;

import java.io.IOException;

public class Loop extends Command {

    private int repeat;
    private int repeat1;
    private int repeat2;

    public Loop(String repeat) {
        this.repeat = Integer.parseInt(repeat);
        forloop();
    }

    public void forloop() {
        String[] tokens;
        String line = null;
        String[] inLoopCmd = new String[100];
        String[] inLoopCmd2 = new String[100];

        boolean x = false;
        int i = 0, i2 = 0, j = 0, j2 = 0, c = 1;

        try {
            line = Program.input.readLine();
            tokens = line.split(" ");
            if (tokens[0].equals("for")) {
                c = Integer.parseInt(tokens[1]);
                line = Program.input.readLine();
            }
            while (!line.equals("end for")) {
                inLoopCmd[i] = line;
                line = Program.input.readLine();
                tokens = line.split(" ");
                if (tokens[0].equals("for")) {
                    x = true;
                    i++;
                    inLoopCmd[i] = line;
                    repeat1 = Integer.parseInt(tokens[1]);
                    repeat2 = repeat1;
                    line = Program.input.readLine();
                    while (!line.equals("end for")) {
                        inLoopCmd2[i2] = line;
                        line = Program.input.readLine();
                        i2++;
                    }
                    line = Program.input.readLine();
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (x) {
            i--;
            x = false;
        }
        repeat *= c;
        while (repeat != 0) {
            tokens = inLoopCmd[j].split(" ");
            if (tokens[0].equals("for") && inLoopCmd2[0] != null) {
                x = true;
                while (repeat1 != 0) {
                    tokens = inLoopCmd2[j2].split(" ");
                    if (j2 < i2) {
                        j2++;
                    }
                    RecognizeCommand rc = new RecognizeCommand(tokens);
                    if (j2 >= i2) {
                        j2 = 0;
                        repeat1--;
                    }
                    try {
                        rc.recognizeCommand();
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                    }
                }
                repeat1 = repeat2;
            }
            if (j < i) {
                j++;
            }
            if (x) {
                tokens = inLoopCmd[j].split(" ");
                x = false;
            }
            RecognizeCommand rc = new RecognizeCommand(tokens);
            if (j >= i) {
                j = 0;
                repeat--;
            }
            try {
                rc.recognizeCommand();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
