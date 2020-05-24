package Abi;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ZADA_R extends Shape {
    double length;
    double width;

    public ZADA_R(Color color, double length, double width) {
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
        gr.setLineDashes(1);
        gr.fillRect(10,10,500,500);
        gr.strokeRoundRect(75,100,120,50,10,10);
    }
}
