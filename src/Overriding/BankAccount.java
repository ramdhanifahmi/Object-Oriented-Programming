package Overriding;
/*
   Polymorphisme erat kaitannya dengan method overriding = memiliki nama method yang sama dengan parent class
   hal yang membedakan dengan method overloading ialah method overloading dibedakan dengan melalui parameter yang berbeda
   Sementara overriding benar2 memiliki nama yang persis sama untuk 2 atau lebih method yang berbeda
*/

public class BankAccount {
    protected double balance;

    public BankAccount(double balanceIn){
        balance = balanceIn;
    }

    public void printBalance() {
        System.out.println("Your account balance is $" + balance);
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    //Anotasi ini memberitahu compiler bahwa kita ingin mengoverride
    // method dari kelas parent
    // Anotasi ini merupakan anotasi bawaan dalam java
    // anotasi tidak ditulis juga bukan masalah.
    @Override
    public void printBalance() {
        System.out.println("Your checking account balance is $" + balance);
    }

    public void checkBalances() {
        // calls method from CheckingAccount
        printBalance();
        // calls method from BankAccount
        super.printBalance();
        // keyword super. digunakan untuk memanggil method dari kelas parent
    }

    public static void main(String[] args) {
        CheckingAccount myCheckings = new CheckingAccount(5000);
        myCheckings.checkBalances();
    }
}
