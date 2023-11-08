package com.demoanimations.demoanimations.screen;

import com.demoanimations.demoanimations.model.Avatar;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ScreenALevel {
    private Canvas canvas;
    private GraphicsContext gcontext;
    private Avatar avatar;

    public ScreenALevel(Canvas canvas) {
        this.canvas = canvas;
        this.gcontext = this.canvas.getGraphicsContext2D();
        this.avatar = new Avatar(this.canvas);
    }

    public void paint(){
        gcontext.setFill(Color.BLACK);
        gcontext.fillRect(0,0, canvas.getWidth(), canvas.getHeight());


    }
}
