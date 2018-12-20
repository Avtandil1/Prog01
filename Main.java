import processing.core.PApplet;

import javax.swing.*;



publicimport processing.core.PApplet; class Main extends PApplet {



    static float n;



    float v = 600 / n;



    float[][] x = new float[(int)n][(int)n];

    float[][] y = new float[(int)n][(int)n];



    public void settings() {

        fullScreen();

    }



    public void setup() {

        stroke(255);

    }



    public void draw() {

        background(0);



        translate(500, 300);

        fill(0);

        rect(0, 0, 600, 600);



        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {

                fill(255);

                rect(x[j][i], y[j][i], v, v);

                if (j % 2 == 0 && i % 2 == 0) {

                    x[j][i] = j * v;

                    y[j][i] = i * v;

                }

                if (j % 2 != 0 && i % 2 != 0) {

                    x[j][i] = i * v;

                    y[j][i] = j * v;

                }

            }

        }

    }



    public static void main(String... args) {

        n = Float.parseFloat(JOptionPane.showInputDialog("N: "));

        PApplet.main("Main");

    }

}