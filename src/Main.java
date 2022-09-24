/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Box box1 = new Box();

        System.out.println(box1.high);
        box1.showVolume();

        Box box2 = new Box(10.5, 14.6, 17.9);

        System.out.println(box2.high);
        box2.showVolume();

        System.out.println("--------");

        Employee employee1 = new Employee("Natan", "Welder", 400);
        System.out.println(employee1.info(4));

        System.out.println("--------");

        Test test = new Test();

        double result = test.multiple(6, 5);
        System.out.println(result);

        result = test.multiple(6.3,4.5);
        System.out.println(result);

        result = test.multiple(6);
        System.out.println(result);

        result = Test.multiple(6);
        System.out.println(result);

    }
}
