package Abi;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SMS_R extends Shape{
    double length;
    double width;

    public SMS_R(Color color, double length, double width) {
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
        gr.setLineDashes(2);
        gr.strokeLine(70,100,170,100);
        gr.strokeLine(170,100,168,103);
        gr.strokeLine(170,100,168,97);

    }
}
