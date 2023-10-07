package employee;

/**
 * TODO: Реализовать тип фрилансера в рамках домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {

    protected static int priceasHour  = 1500;

    private int hours;

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public int getAge() {
        return age;
    }

    public Freelancer() {
    }

    public Freelancer(int hours) {
        this.hours = hours;
    }

    @Override
    public void setValue(String name, String surName,int age, double salary) {
        super.setValue(name, surName, age, salary);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Freelancer(String surName, String name,int age, double salary) {
        super(surName, name, age, salary);
        this.hours = 0;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d; Заработная плата (за проработанные часы): %.2f (руб.); Отработано часов %d; Базовая ставка: %d",
                surName, name, age, calculateSalary(), hours, priceasHour);
    }
}
