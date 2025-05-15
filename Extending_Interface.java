interface Vehicle{
    void start();
    void stop();
}

interface Car extends Vehicle{
    void speed(int speed);
}

class MyCar implements Car{

    public void start(){
        System.out.println("Car started");
    }

    public void speed(int speed){
        System.out.println("Car speed is: "+speed+" km/h");
    }
    
    public void stop(){
        System.out.println("Car stopped");
    }

    public static void main(String args[]){
        MyCar obj1 = new MyCar();
        obj1.start();
        obj1.speed(80);
        obj1.stop();
    }
}