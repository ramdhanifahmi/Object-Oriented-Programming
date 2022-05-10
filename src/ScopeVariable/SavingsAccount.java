package ScopeVariable;

public class SavingsAccount {
    //Ini merupakan instance variabel / variabel global.
    // kadang-kadang kita membuat variabel lokal sama dengan instance variabel

    public String owner;
    public int balanceDollar;
    public double balanceEuro;

    public SavingsAccount(String owner, int balanceDollar){
        // ini merupakan contoh variabel lokal sama namanya dengan variabel instance
        // apabila kita mencoba print owner maka java akan merefer pada variabel lokal
        // sehingga variabel instance tidak akan di print/ diproses
        // untuk mengakses variabel instance maka gunakan keyword this.

        this.owner = owner;
        this.balanceDollar = balanceDollar;
        this.balanceEuro = balanceDollar*0.85 ;
    }

    public void addMoney(int balanceDollar){
        // Complete this method
        System.out.println("Adding " + balanceDollar + " dollars to the account.");
        this.balanceDollar += balanceDollar;

        System.out.println("The new balance is " + this.balanceDollar + " dollars.");

    }

    public static void main(String[] args){
        SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);

        // Make a call to addMoney() to test your method
        zeusSavingsAccount.addMoney(2000);
    }
}
