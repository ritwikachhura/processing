
import processing.core.PApplet;


public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    private static final float diameter = 10;
    private float height = HEIGHT / 5;
    private float speed;
    int no_of_balls = 4;
    FourBalls[] balls = new FourBalls[no_of_balls];

    public FourBalls(float speedB, float heightScreen) {
        speed = speedB;
        height = height * heightScreen;
    }

    void drawBall() {
        ellipse(speed, height, diameter, diameter);
        speed += 2;
    }

    public static void main(String args[]) {

        PApplet.main("FourBalls",args);

    }

    @Override
    public void settings() {
        // TODO: Customize screen size and so on here
        size(WIDTH, HEIGHT);
    }



    @Override
    public void setup() {
        // TODO: Your custom drawing and setup on applet start belongs here
        // clear();
        for (int i = 1; i <= no_of_balls; ++i) {
            balls[i] = new FourBalls(2 * i, i);
        }
    }

    @Override
    public void draw() {
        // TODO: Do your drawing for each frame here
        for (int i = 0; i < no_of_balls; ++i) {
            balls[i].drawBall();
        }
    }
}


