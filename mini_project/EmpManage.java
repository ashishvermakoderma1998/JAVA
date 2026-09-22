package mini_project;
import java.util.Scanner;

class Employe{
    String name;
    double salary;

    void work(){
        System.out.println(name + " is working");
    }
}

class Developer extends Employe {
    void work(){
        System.out.println(name + "is developing software");
    }
}

class Tester extends Employe {
    void work(){
        System.out.println(name + "is testing software");
    }
}

class Manager extends Employe {
    void work(){
        System.out.println(name + "is managing team");
    }
}




public class EmpManage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Developer developer = new Developer();

        System.out.println("Enter Developer Name:");
        developer.name = sc.nextLine();
        System.out.println("Enter Developer Salary:");
        developer.salary = sc.nextDouble();
        sc.nextLine();

        Tester tester = new Tester();
        System.out.println("Enter Tester Name:");
        tester.name = sc.nextLine();
        System.out.println("Enter Tester Salary:");
        tester.salary = sc.nextDouble();

        Manager manager = new Manager();
        System.out.println("Enter Manager Name:");
        manager.name = sc.nextLine();
        manager.name = sc.nextLine();
        
        System.out.println("Enter Manager :");
        manager.salary = sc.nextDouble();

        developer.work();
        tester.work();
        manager.work();



        sc.close();
    }
 
}
