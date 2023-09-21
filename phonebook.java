
// Реализуйте структуру телефонной книги с помощью Map, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class phonebook {
    // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones.substring(0, phones.length()-2));
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addNumber("Kostya", 123456, phoneBook);
        addNumber("Ivan", 123466, phoneBook);
        addNumber("Petr", 546585, phoneBook);
        addNumber("Dima", 8956477, phoneBook);
        addNumber("Kostya", 654321, phoneBook);
        addNumber("Petr", 787878, phoneBook);
        printBook(phoneBook);
       }
    
}
