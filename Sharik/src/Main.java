import javafx.scene.layout.Background;
import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    float x;
    float y;
    float dx;
    float dy;
    float r;
    int c;


    public void settings() {

        fullScreen(); }

    public void setup() {
        background(0);

    }


    public void draw() {
        x=random(width,height);
        y=random(width,height);
        r=random(100,200);
        c=random(100,200);

        ellipse(x,y,r,c);
        dx=dx+1;
        dx=dy+1;


    }


    public static void main(String... args) {
        PApplet.main("Main");
    }
}