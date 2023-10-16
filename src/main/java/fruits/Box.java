package fruits;

import java.util.ArrayList;

public class Box<T extends Fruct> {
    private ArrayList<T> fructs;

    private final int size = 100;

    public Box() {
        this.fructs = new ArrayList<>(size);
    }

    public void addFruct(T fruct){
        this.fructs.add(fruct);
    }

    public double getFructs() {
        return fructs.get(0).getWeight();
    }

    public int getSize() {
        return fructs.size();
    }
    public boolean compare(Box fructs){
        double currentBox;
        double comparableBox;
        currentBox = this.getFructs()*this.getSize();
        comparableBox = fructs.getFructs()*fructs.getSize();

        if (currentBox==comparableBox){
            return true;
        }
        else {
            return false;
        }
    }
    public T getFruct(int i) {
        return this.fructs.get(i);
    }

    public void shiftItem(Box box) {
        // цикл foreach не подходит для пересыпания с одновременным контролем и удалением перекладываемых элементов
        // проверка на сопоставимость наполнения коробок
        if (isProductsComparable(box)) {
            System.out.println("Внимание! Смешивать фрукты запрещено!");
        }
        for (int i = this.getSize() - 1; i >= 0; i--) {
            box.fructs.add(this.getFruct(i));
            this.fructs.remove(i);
        }
    }

    public boolean isProductsComparable(Box box) {
        return this.fructs.get(0).getClass() != box.fructs.get(0).getClass();
    }


}
