package PrivateMethod;

public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        this.accountOne = new CheckingAccount("Zeus", 100, "1");
        this.accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        bankOfGods.accountOne.getAccountInformation();

        //kita dapat memanggi method diatas karena public
        // namun kita tidak bisa memanggil method bankOfGods.accountOne.calculateNextMonthInterest()
        // karena method calculateNextMonthInterest() di Access dengan private
        // kita bisa mengakses bankOfGods.accountOne.calculateNextMonthInterest() apabila di set public
    }
}
