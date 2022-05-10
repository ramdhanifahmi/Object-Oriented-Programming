package GetterSetter;

import java.util.Scanner;

public class Volume{
        double panjang, lebar, tinggi;

        // ini konstruktor
        public Volume(){
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
            System.out.println("Objek kubus diinstansiasi");
        }

        // ini penerapan get dan setter
        public double getPanjang(){
            return panjang;
        }

        public void setPanjang(double panjang) {
            this.panjang = panjang;
        }

        public double getLebar() {
            return lebar;
        }

        public void setLebar(double lebar) {
            this.lebar = lebar;
        }

        public double getTinggi() {
            return tinggi;
        }

        public void setTinggi(double tinggi) {
            this.tinggi = tinggi;
        }

        // Menghitung volume sebuah kotak
        public double hitungVolume(){
            return panjang * lebar * tinggi;
        }
    }

