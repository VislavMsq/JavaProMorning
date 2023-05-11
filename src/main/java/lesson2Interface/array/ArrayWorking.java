package lesson2Interface.array;

public class ArrayWorking {
    Object[] objects = new Object[10];
    int count = 0;

    public void add(Object object){
        objects[count] = object;
        count++;
    }

    public void display(){
        System.out.println("Массив: ");
        for (int i = 0; i < count; i++) {
            System.out.println(objects[i]);
        }
    }

    public void delete(){
        count = 0;
    }

    // взламываем наш массив
    public void hack(){
        count = objects.length;     // получаем длину массива
    }

    public void erase(){
        for (int i = 0; i < count; i++) {
            objects[i] = null;
        }
        count = 0;
    }
}
