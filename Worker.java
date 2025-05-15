public class Worker{
    String name;
    int age;

    Worker(String name,int age){
        this.name = name;
        this.age= age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Manager extends Worker{

    String department;

    Manager(String name,int age,String department){
        super(name,age);
        this.department = department;
    }

    void display(){
        super.display();
        System.out.println("Department: "+department);
    }
}

// class Engineer extends Worker{
//     String specialization;

//     Engineer(String name,int age,String specialization){
//         super(name,age);
//         this.specialization = specialization;
//     }

//     void display(){
//         super.display();
//         System.out.println("Specialization: "+specialization);
//     }
// }

class Engineer extends Manager{
    String specialization;

    Engineer(String name,int age,String department,String specialization){
        super(name,age,department);
        this.specialization = specialization;
    }

    void display(){
        super.display();
        System.out.println("Specialization: "+specialization);
    }
}

class Sample{
    public static void main(String args[]){
        Worker w = new Worker("John",30);
        Manager m = new Manager("Alice",40,"HR");
        Engineer e = new Engineer("Bob",30,"IT","Full Stack Developer");

        w.display();
        System.out.println("-----------------");
        m.display();
        System.out.println("-----------------");
        e.display();
        System.out.println("-----------------");
    }
}

