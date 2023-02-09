//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Main;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Program {
    public static BufferedReader input;
    public static boolean nullline = false;
    static boolean check = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome");
        JButton button = new JButton("Start");
        button.setBounds(200, 400, 100, 50);
        frame.setBounds(800, 300, 500, 500);
        ImageIcon pic = new ImageIcon("src\\Picture\\background.jpg");
        JLabel label = new JLabel();
        label.setIcon(pic);
        label.setSize(500, 500);
        frame.add(label);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check = true;
                try {
                    Reader reader = new FileReader("src\\code.txt");
                    input = new BufferedReader(reader);
                    if (check) {

                        while (true) {
                            try {
                                String line = input.readLine();
                                if (line == null) {
                                    break;
                                }
                                String[] tokens = line.split(" ");
                                if (tokens[0].equalsIgnoreCase("%%")) {
                                    Management.separator = true;
                                    line = input.readLine();
                                    tokens = line.split(" ");

                                }
                                if (tokens[0].equals("")) {

                                    nullline = true;
                                }

                                new Management(tokens);
                                if (tokens.length > 1 && (Management.separator && (tokens[0].equals("int") || tokens[0].equals("float")))) {
                                    throw new IllegalArgumentException("you can't define a variable here");
                                }

                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }

                        }
                    }
                } catch (FileNotFoundException exp) {
                    exp.printStackTrace();
                } finally {
                    try {
                        input.close();
                    } catch (IOException exp1) {
                        exp1.printStackTrace();
                    }
                }
                System.exit(0);
            }
        });

    }
}
