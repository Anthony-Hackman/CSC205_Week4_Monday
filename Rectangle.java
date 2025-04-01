public abstract class Rectangle extends Shape {
    double length;
    double width;


public double getArea(){
    return length * width;
}

public double getParameter(){
    return 2 * (length + width);
}
}
