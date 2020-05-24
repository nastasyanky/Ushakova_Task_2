package Abi;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SHL_R extends Shape{
    double length;
    double width;

    public SHL_R(Color color, double length, double width) {
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
        gr.setLineDashes(1);
        gr.strokeLine(125,125,150,150);
        gr.strokeLine(150,150,175,125);
        gr.strokeLine(125,125,150,100);
        gr.strokeLine(150,100,175,125);

    }
}
