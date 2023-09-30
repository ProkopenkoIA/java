import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков (Set).
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД */


public class laptop {
    public static void main(String[] args) {
        Device dev1 = new Device(Brand.ACER,256,512);
        Device dev2 = new Device(Brand.SONY,512,720);
        Device dev3 = new Device(Brand.LENOVO,1024,720);
        Device dev4 = new Device(Brand.MACBOOK,2048,1024);
        Device dev5 = new Device(Brand.ACER,256,512);

        Set<Device> device = new HashSet<>();
        device.add(dev1);
        device.add(dev2);
        device.add(dev3);
        device.add(dev4);
        device.add(dev5);
       
        System.out.println(device);       
        
        Map<Integer, Integer> searsh = new HashMap<Integer, Integer>();

        Scanner in = new Scanner(System.in);
        System.out.print("Укажите параметр для поиска значения:\n 1 - Объем HDD\n 2 - Объем ОЗУ\n Ваш вариант: ");
        int num = in.nextInt();

        searsh.put(1,num);

        System.out.print("Какое значение вас интересует?:\n 1 - Максимальное\n 2 - Минимальное\n Ваш вариант: ");
        num = in.nextInt();
        searsh.put(2,num);

        if (searsh.get(1) == 1) {
        if (searsh.get(2) == 1) 
        {   
        Device dvs = device.stream()
                        .max(Comparator.comparingInt(Device::getHdd))
                        .get();       
        System.out.println("Ноутбук с наибольшим объемом HDD: " + dvs);}
        else
        {Device dvs = device.stream()
                        .min(Comparator.comparingInt(Device::getHdd))
                        .get();       
        System.out.println("Ноутбук с наименьшим объемом HDD: " + dvs);}
        }
        
        if (searsh.get(1) == 2) {
        if (searsh.get(2) == 1) 
        {   
        Device dvs = device.stream()
                        .max(Comparator.comparingInt(Device::getOzu))
                        .get();       
        System.out.println("Ноутбук с наибольшим объемом ОЗУ: " + dvs);}
        else
        {Device dvs = device.stream()
                        .min(Comparator.comparingInt(Device::getOzu))
                        .get();       
        System.out.println("Ноутбук с наименьшим объемом ОЗУ: " + dvs);}
        }

    }
    
}
