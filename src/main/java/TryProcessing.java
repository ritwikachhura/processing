import processing.core.PApplet;

public class TryProcessing extends PApplet
{

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int RGB1 = 255;
    public static final int diameter = 10;
    int x =0,y = 0,z =0,w =0;

    public static final int heightByFive = HEIGHT/5;
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {


    }

    @Override
    public void draw() {
       // bg_white();
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(x, heightByFive, diameter, diameter);
        x+=2;
    }
    private void drawCircle2() {
        ellipse(y, heightByFive*2, diameter, diameter);
        y+=4;
    }
    private void drawCircle3() {
        ellipse(z, heightByFive*3, diameter, diameter);
              z +=8;

    }
           private void drawCircle4() {
            ellipse(w, heightByFive*4, diameter, diameter);

            w +=12;

    }

    private void bg_white() {
        background(RGB1);
    }
}
