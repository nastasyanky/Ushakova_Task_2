package sample;

import Abi.*;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Controller {
    public GraphicsContext gc;
    public Canvas canvas;
    public Button button_SMS;
    public Button button_UPRAV;
    public Button button_SHL;
    public Button button_SOB;
    public Button button_ZADA;
    public Label label_1;

    public void R_SMS(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        SMS_R r_r= new SMS_R(Color.GREEN,10,20);
        r_r.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Поток сообщений");
    }

    public void R_UPRAV(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        UPRAV_R UPRAV_r = new UPRAV_R(Color.GREEN,10,20);
        UPRAV_r.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Управляющий поток");
    }

    public void R_SHL(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        SHL_R SHL_r = new SHL_R(Color.GREEN,10,20);
        SHL_r.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Шлюз");
    }

    public void R_SOB(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        SOB_R SOB_r = new SOB_R(Color.GREEN,10,20);
        SOB_r.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Событие");
    }

    public void R_ZADA(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        ZADA_R ZADA_r = new ZADA_R(Color.GREEN,10,20);
        ZADA_r.draw(gc);
        label_1.setAlignment(Pos.CENTER);
        label_1.setText("Задача");
    }


}
