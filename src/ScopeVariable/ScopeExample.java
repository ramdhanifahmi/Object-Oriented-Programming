package ScopeVariable;
/* The scope of a variable is determined by where the variable is declared
1. Variabel lokal = dideklarasikan dalam method atau blok
2. Variabel instance = dideklarasikan dalam kelas atau secara global. namun diluar method atau blok
3. Variable kelas/static = dideklarasikan dengan kata kunci static. Variabel static dapat diakses langsung diluar kelas
yang mendeklariskannya tanpa harus kelas tersebut diintansiasi terlebih dahulu.
 */

public class ScopeExample {
    public static void main(String[] args){

        int sum = 0;
        int[] myArray = {1, 2, 3, 4};
        for(int i = 0; i < myArray.length; i++){
            //Apabila int sum = 0 diletakan disini maka setiap kali perulangan
            // nilai sum akan kembali nol
            //Selain itu variable sum juga tidak bisa kita panggil dalam sout
            // apabila kita letakan sum tersebut di baris dalam loop ini
            sum += myArray[i];
        }

        System.out.println(sum);
    }
}
