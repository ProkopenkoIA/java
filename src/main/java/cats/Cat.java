package cats;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(){
        this.satiety = false;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat() { this.satiety = true;}
    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
    public boolean getSatiety() {
        return satiety;
    }
    @Override
    public String toString() {
        return String.format("Кот { Кличка = %s, Аппетит = %s,  Сытость = %s}", this.name, this.appetite, this.satiety);
    }
    public String satietyInfo(){
        if (getSatiety()){
            return String.format("Кот %s не нуждается в пищи!", this.name);
        }
        else
        {
            return String.format("Кот %s нуждается в пищи!", this.name);
        }
    }

}