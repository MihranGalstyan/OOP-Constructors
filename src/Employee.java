/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Employee {
    String name;
    String position;
    double salary;

    public Employee(final String name, final String position, final double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String info(int months) {
        return "Name: " + name + "\nPosition: " + position + "\nSalary for " + months + " months: " + salary * months;
    }
}
