package parameterizedmethods.homework;

public class Rect {
    double length;
    double width;
    void setRect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double perimeter() {
        return (length + width) * 2;
    }

    double square() {
        return length * width;
    }
}
