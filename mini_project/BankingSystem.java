package mini_project;

class Account{
    String name;
    int balance;

    Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
}

class SavingAccount extends Account{
    SavingAccount(String name, int balance){

        super(name, balance);
    }

    void withdrawal(){
        System.out.println("Saving Account Withdrawal");
    }
}

class CurrentAccount extends Account{
    CurrentAccount(String name, int balance){
        super(name,balance);
    }

    void withdrawal(){
        System.out.println("Current Account Withdrawal");
    }
}


public class BankingSystem {
public static void main(String[] args){


    SavingAccount s = new SavingAccount("Pankaj", 2000);
    CurrentAccount c = new CurrentAccount("Ashish",5000 );




    c.withdrawal();
    s.withdrawal();






    
}

}

