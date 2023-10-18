package model;

import java.io.Serial;
import java.io.Serializable;

public class Billboard implements Serializable {

    @Serial
    private static final long serialVersionUID = 1;

    private double width;
    private double height;
    private boolean inUse;
    private String brand;

    public Billboard(double w, double h, boolean iu, String b){
        width = w;
        height = h;
        inUse = iu;
        brand = b;
    }

    public double area(){
        return width*height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public boolean getInUse(){
        return inUse;
    }

    public String getBrand(){
        return brand;
    }

    public void setWidth(double w){
        width = w;
    }

    public void setHeight(double h){
        height = h;
    }

    public void setInUse(boolean iu){
        inUse = iu;
    }

    public void setBrand(String b){
        brand = b;
    }

    public String toString(){
        return width + "\t" + height + "\t" + inUse + "\t" + brand;

    }



}
