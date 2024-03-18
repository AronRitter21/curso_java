package entities;

public class Rectangle {
    public double width, height;
    public double Area(){
        return width * height;
    }
    public double Perimetro(){
        return (width + height) * 2;
    }
    public double Diagonal(){ 
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); 
    }
}
