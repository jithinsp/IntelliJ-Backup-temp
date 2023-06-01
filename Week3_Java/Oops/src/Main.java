
interface Car{  //interface
    void name();
}
class Maruti implements Car {
    @Override
    public void name() {
        System.out.println("Maruti");
    }
}
abstract class Braking{
    abstract void Braked();   //abstraction
}


public class Main  {
    public static void main(String[] args) {
    Car obj = new Maruti();
    obj.name();

    }
}