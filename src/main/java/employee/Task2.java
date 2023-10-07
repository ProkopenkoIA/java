package employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task2 {

    private static Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        ArrayList<Employee> emplN= new ArrayList<>(2);
        emplN.add(new Worker());
        emplN.add( new Freelancer());
        int salary = random.nextInt(50000, 120000);
        int age = random.nextInt(18, 66);


        Employee employee = emplN.get(random.nextInt(emplN.size()));

        if (employee.getClass() == Worker.class)
        {
            employee.setValue(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)],age, salary);
        }
        else {
            int hours = random.nextInt(1,999);
            employee.setValue(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], age,Freelancer.priceasHour*hours);
            employee.setHours(hours);
        }

        return employee;
    }

    /**
     * TODO: Метод generateEmployees должен быть универсальным, возвращать некоторое кол-во
     *  сотрудников различных типов
     * @param count
     * @return
     */
    static Employee[] generateEmployees(int count){
        Employee[] array = new Employee[count];
        for (int i = 0; i < array.length; i++)
            array[i] = generateEmployee();
        return array;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(15);

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}
