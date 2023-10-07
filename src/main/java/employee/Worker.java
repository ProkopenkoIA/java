package employee;

/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee {

    public Worker (){}
    public Worker(String surName, String name,int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setValue(String name, String surName,int age, double salary) {
        super.setValue(name, surName,age, salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Возраст: %d; Среднемесячная заработная плата (фиксированная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}
