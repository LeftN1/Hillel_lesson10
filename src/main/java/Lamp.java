public class Lamp {
    //1) Создайте класс и определите методы для предмета "Фонарь".
    // У него будет название, определенное количество батареек, которые можно вставить,
    // он должен уметь светить красным, белым светом, а также мигать, причем для белого
    // света достаточно одной батарейки, для красного нужно 2, для мигающего нужно 3
    // (свойство int battery, которое будет хранить количество батареек для этого подойдет).
    // Вы можете добавить возможности фонаря, как сочтете нужным.

    private int battery;
    private final int maxBattery = 5;
    //текущее состояние
    State state;


    Lamp(){
        battery = 0;
        state = State.OFF;
    }

    Lamp(int b){
        setBattery(b);
        state = state.OFF;
    }

    public void addBattery(int b){
        if(battery + b >= maxBattery){
            battery = maxBattery;
        }
        else if (b < 0){
        }
        else
        {
            battery = battery + b;
        }
    }

    public void removeBattery(int b){
        if(battery - b < 0){
            battery = 0;
        }
        else if (b < 0){
        }
        else
        {
            battery = battery - b;
        }
    }

    public int getBattery(){
        return battery;
    }

    public void setBattery(int b){
        if(b >= maxBattery){
            battery = maxBattery;
        }
        else if (b < 0){
            battery = 0;
        }
        else
        {
            battery = b;
        }
    }

    public State getState(){
        return state;
    }

    //Следующие методы переключают состояние фонаря (если хватит батарей) и возвращают true еесли получилось
    public boolean whiteLight(){
        if (battery >= 1){
            state = State.WHITE;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean redLight(){
        if (battery >= 2){
            state = State.RED;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean blink(){
        if (battery >= 3){
            state = State.BLINK;
            return true;
        }
        else
        {
            return false;
        }
    }

    public void off(){
        state = State.OFF;
    }
}

//enum для состояний фонарика
enum State { OFF, WHITE, RED, BLINK}