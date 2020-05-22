package sample;

import Abi.*;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {
    public GraphicsContext gc;
    public Canvas canvas;
    public Button button_AND;
    public Button button_OR;
    public Button button_NOT;
    public Button button_OR_NOT;
    public Button button_ISKL;
    public Button button_AND_NOT;

    public void R_AND(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        AND_R r_r= new AND_R(Color.GREEN,10,20);
        r_r.draw(gc);

    }

    public void R_OR(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        OR_R or_r= new OR_R(Color.GREEN,10,20);
        or_r.draw(gc);
    }

    public void R_NOT(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        NOT_R not_r= new NOT_R(Color.GREEN,10,20);
        not_r.draw(gc);
    }

    public void R_OR_NOT(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        OR_NOT_R or_not_r= new OR_NOT_R(Color.GREEN,10,20);
        or_not_r.draw(gc);
    }

    public void R_AND_NOT(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        AND_NOT_R and_not_r= new AND_NOT_R(Color.GREEN,10,20);
        and_not_r.draw(gc);
    }


}
