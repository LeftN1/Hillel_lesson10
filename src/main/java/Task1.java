import java.util.ArrayList;

public class Task1 {

    //1) Написать Класс который позволяет добавлять в масив другой масив
    // а также одно значение, возвращать длину масива, и выводить элементы по индексу.
    // Причем в конструктор этого класса передается изначальный размер масива  N.
    // При добавлении элементов и достижении границы масива он должен увеличиваться
    // в размере в 2 раза тоесть N*2.

    public static void main(String[] args) {
        MyArrayList mArr = new MyArrayList(10);
        ArrayList jArr = new ArrayList(10);
        System.out.println(mArr.getLength());
        System.out.println(jArr.size());
        mArr.add(1);
        jArr.add(1);
        mArr.add(2);
        jArr.add(2);
        mArr.add("x");
        jArr.add("x");
        mArr.add(4);
        jArr.add(4);

        System.out.println("My array:\t" + mArr);
        System.out.println("Bloch's:\t" + jArr);

        mArr.add(1,"y");
        jArr.add(1,"y");
        System.out.println("My array:\t" + mArr);
        System.out.println("Bloch's:\t" + jArr);

        mArr.add(5,"P");
        jArr.add(5,"P");
        System.out.println("My array:\t" + mArr);
        System.out.println("Bloch's:\t" + jArr);

        mArr.remove(0);
        jArr.remove(0);

        System.out.println("My array:\t" + mArr);
        System.out.println("Bloch's:\t" + jArr);
        System.out.println(mArr.getLength());
        System.out.println(jArr.size());
    }

}
