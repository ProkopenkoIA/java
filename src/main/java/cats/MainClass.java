package cats;

public class MainClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Barsik2", 10);
        Cat cat3 = new Cat("Barsik3", 15);
        Cat cat4= new Cat("Barsik4", 20);

        Plate plate = new Plate(30);
        plate.info();
        Cat[] cats = new Cat[5];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat1;
        for (Cat kitty : cats) {
            if (!kitty.getSatiety()) {
                if (plate.getFood() >= kitty.getAppetite()) {
                    kitty.eat();
                    plate.setFood(plate.getFood() - kitty.getAppetite());
                    System.out.println(kitty.toString());
                    plate.info();
                } else {
                    System.out.println(kitty.getName() + " не сможет поесть!");
                }
            }
                else {
                    System.out.println(kitty.satietyInfo());
                }
        }
    }

}
