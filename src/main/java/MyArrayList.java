public class MyArrayList {
    //1) Написать Класс который позволяет добавлять в масив другой масив
    // а также одно значение, возвращать длину масива, и выводить элементы по индексу.
    // Причем в конструктор этого класса передается изначальный размер масива  N.
    // При добавлении элементов и достижении границы масива он должен увеличиваться
    // в размере в 2 раза тоесть N*2.

    private Object[] innerArray;
    private int length = 0;
    private int maxLength;

    MyArrayList(){
        innerArray = new Object[1];
        maxLength = 1;
    }

    MyArrayList(int i){
        innerArray = new Object[i];
        maxLength = i;
    }

    public int getLength(){
        return length;
    }
        
    public void add(Object obj){
        if(length >= maxLength){
            doubleSize();
        }
        innerArray[length] = obj;
        length++;
    }

    public void add (int pos, Object obj){
        if(pos > length){
           throw new IndexOutOfBoundsException();
        }
        else if(pos == length){
            add(obj);
        }
        else{
            Object tmp = innerArray[pos];
            innerArray[pos] = obj;
            add(pos + 1, tmp);
        }
    }

    public void remove(){
        length--;
    }

    public void remove(int pos){
        if(pos > length - 1){
            throw new IndexOutOfBoundsException();
        }
        else if (pos == length - 1){
            remove();
        }
        else{
            innerArray[pos] = innerArray[pos+1];
            remove(pos + 1);
        }
    }

    public Object get(int pos){
        if(pos >= length){
            throw new IndexOutOfBoundsException();
        }
        else
        {
            return innerArray[pos];
        }
    }

    public String toString(){
        String s= "[";
        boolean trig = false;

        for(int i = 0; i < length; i++){

            if(trig){
                s += ", ";
            }
            else {
                trig = true;
            }

            s += innerArray[i];
        }
        s += "]";
        return s;
    }

    private void doubleSize(){
        maxLength *= 2;
        Object[] newArray = new Object[maxLength];
        
        for (int i = 0; i < innerArray.length; i++) {
            newArray[i] = innerArray[i];
        }
        innerArray = newArray;
    }
}
