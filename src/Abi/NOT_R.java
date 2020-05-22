package Abi;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class NOT_R extends Shape{
    double length;
    double width;

    public NOT_R(Color color, double length, double width) {
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
        gr.strokeLine(70,125,120,125);
        gr.strokeRect(120,50,75,150);
        gr.strokeLine(195,125,245,125);
        gr.strokeOval(190,120,10,10);

    }
}
