package Abi;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class OR_R extends Shape{
    double length;
    double width;

    public OR_R(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;

    }

    @Override
    public String toString() {
        return"Rectangle color is " + super.color +
                "and area is : " + area();
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.WHITE);
        gr.fillRect(10,10,500,500);
        gr.strokeLine(70,100,120,100);
        gr.strokeLine(70,150,120,150);
        gr.strokeRect(120,50,75,150);
        gr.strokeLine(195,125,245,125);


    }
}
