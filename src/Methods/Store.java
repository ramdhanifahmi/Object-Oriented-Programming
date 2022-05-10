package Methods;
/* Method = blok yang berisi baris2 perintah yang diberi sebuah nama
yang nantinya nama ini bisa dipanggil berulang kali.
 */

public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    //Contoh Method overloading
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // advertise method
    // Method ini bertipe void = method tanpa nilai balik
    // artinya tidak ada output spesisifik dari method.
    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }

    // Method dengan nilai balik = un-void tipe
    // bisa disebut fungsi, mengembalikan nilai sesuai tipe datanya
    // Selain nilai bertipe primitif, bisa juga mengembalikan objek.
    // namun bila objek menjadi nilai baliknya,
    // maka bila diprint yang muncul adalah lokasi memorinya objek

    public double getPriceWithTax(){
        double totalPrice = price + price * 0.08;
        return totalPrice;
    }

    //Method dengan parameter
    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // Method toString() digunakan untuk merepresentasikan objek dalam bentuk string
    // method ini bisa membuat objek lebih mudah dibaca
    // yang diprint bukan nama lokasinyanya lagi (@hascode)
    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
       //Memanggil method advertise() pada objek lemonadeStand
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();

        // Memanggil method parameter, syarat harus sesuai dengan parameter pada method yang ingin
        //dipanggil
        lemonadeStand.greetCustomer("Fahmi");

        //Memanggil method overloading, syarat value yang diinput harus berurutan
        Store lemonadeStand2 = new Store("Lemonade", 3.75);
        lemonadeStand2.increasePrice(1.5);
        System.out.println(lemonadeStand2.price);

        //memanggil method unvoid
        double lemonadePrice = lemonadeStand2.getPriceWithTax();
        System.out.println(lemonadePrice);

        //Memanggil objek sehingga yang muncul bukan lokasi memorinya
        // karena sudah dibuat method toString()
        Store lemonadeStand3 = new Store("Lemonade", 3.75);
        Store cookieShop = new Store("Cookies", 5);
        System.out.println(lemonadeStand3);
        System.out.println(cookieShop);



    }
}

