package Encapsulation;

/*Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar
Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid
Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private, sehingga tidak bisa diakses atau diubah dari luar
Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut
 */

public class Bank {
        private CheckingAccount accountOne;
        private CheckingAccount accountTwo;

        public Bank(){
            accountOne = new CheckingAccount("Zeus", 100, "1");
            accountTwo = new CheckingAccount("Hades", 200, "2");
        }

        public static void main(String[] args){
            Bank bankOfGods = new Bank();
            bankOfGods.accountOne.setBalance(5000);
            System.out.println(bankOfGods.accountOne.getBalance());
        }

}
