import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static String name;
    float alpha=0;
    float x;
    float y;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }


    public void draw() {
//     background(0,1);
        fill (0,0,0,500);

    translate(width/2, height/2);
    rotate(alpha);
    rectMode(CENTER);
   noStroke();
    fill (255);
    rect(0,0,200,200);
        alpha += 0.1;

    }
    public static void main(String... args) {
        name = JOptionPane.showInputDialog("Name: ");
        PApplet.main("Main");
    }
}
