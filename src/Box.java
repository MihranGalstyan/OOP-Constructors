/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Box {
    double high;
    double width;
    double length;


    Box() {
        high = 10;
        width = 10;
        length = 10;
    }

    Box(double high, double width, double length) {
        this.high = high;
        this.width = width;
        this.length = length;
    }

    void showVolume() {
        System.out.println(high * width * length);
    }
}
