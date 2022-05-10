package Constructors;
// constructor= method yang akan dipanggil saat pertama kali Object dibuat

public class Store {
    // instance field / variabel global
    String productType;
    int inventoryCount;
    double inventoryPrice;
    // new method: constructor!
    // Nama constructor harus sama dengan nama class, dan
    // tidak membutuhkan kata void dan return value

    //ini merupakan konstruktor tanpa parameter
    public Store() {
        System.out.println("I am inside the constructor method.");
    }

    // Dalam java, sebuah class dapat mempunyai banyak konstruktor
    // dengan nama yang sama selama konstruktor itu
    // memiliki parameter yang berbeda = Constructor overloading

    //Terdapat 2 tipe parameter : Formal dan aktual
    //ini merupakan Constructor dengan parameter (parameter formal)
    public Store(String product) {
        //men-set instance variabel = parameter
        productType = product;
    }

    //konstruktor lain dengan multiparameter
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }


    // main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        // create the instance below
        // variabel lemonadeStand bertipe data reference/objek
        // tipe data reference didefinisikan ketika akan menginstansiasikan
        // sebuah kelas menjadi objek.
        Store lemonadeStand1 = new Store();
        // kata kunci "new" mengindikasikan kita membuat objek/instance
        // menghilangkan "new" akan membuat error

        // print the instance below
        // apabila diprint maka yang diprint ialah alamat memori instance
        // dalam komputer (@e9e54c2)
        System.out.println(lemonadeStand1);

        //print constructor lainnya
        Store lemonadeStand = new Store("lemonade");
        System.out.println(lemonadeStand.productType);

        //"lemonade" disebut argument / actual parameter
        // mengacu pada nilai yang diteruskan selama pemanggilan metode

        //memanggil konstruktor multiparameter, syarat
        // nilai yang dimasukkan harus berurutan seperti pada parameter
        Store cookieShop = new Store("cookies", 12, 3.75);
        System.out.println(cookieShop.productType);
        System.out.println(cookieShop.inventoryCount);
        System.out.println(cookieShop.inventoryPrice);
    }
}
