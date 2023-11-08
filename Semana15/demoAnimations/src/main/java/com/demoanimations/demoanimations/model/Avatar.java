package com.demoanimations.demoanimations.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class Avatar {

    //elementos graficos

    private Canvas canvas;

    private GraphicsContext gcontext;

    private ArrayList<Image> idles;
    private ArrayList<Image> runs;


    //elementos espaciales

    public Vector position;

    public int state; //this can also be an enum (will be easier)

    public Avatar(Canvas canvas){
        this.canvas = canvas;
        this.gcontext = this.canvas.getGraphicsContext2D();

        //0 is idle || 1 is run
        this.state=0;

        this.idles = new ArrayList<>();
        this.runs = new ArrayList<>();

        this.position = new Vector(100, 100);

        for(int i=0; i<=3; i++){
            Image image = new Image(getClass().getResourceAsStream("/animations/hero/idle/adventurer-idle-2-0" + i + ".png")); //make this path final
            this.idles.add(image);
        }

        for(int i=0; i<=5; i++){
            Image image = new Image(getClass().getResourceAsStream("/animations/hero/run/adventurer-run-0" + i + ".png")); //make this path final
            this.runs.add(image);

        }
    }

    public void paint(){
        if(state == 0){
            gcontext.drawImage(idles.get(0), position.getX(), position.getY());
        }else if(state == 1){
            gcontext.drawImage(runs.get(0), position.getX(), position.getY());
        }
    }


}
