public class Triangle extends Shape {
    double BASE;
    double HEIGHT;

public double getArea() {
    return BASE * HEIGHT / 2;
}

public Triangle(double BASE, double HEIGHT, int i) {
    this.BASE = BASE;
    this.HEIGHT = HEIGHT;
}
}
