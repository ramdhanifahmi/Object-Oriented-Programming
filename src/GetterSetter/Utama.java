package GetterSetter;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Volume volume = new Volume();
        System.out.print("Masukkan besarnya panjang: ");
        volume.setPanjang(inputUser.nextInt());


        System.out.print("Masukkan besarnya lebar: ");
        volume.setLebar(inputUser.nextInt());


        System.out.print("Masukkan besarnya tinggi: ");
        volume.setTinggi(inputUser.nextInt());


        System.out.println("Panjang kubus = " + volume.getPanjang());
        System.out.println("Lebar kubus = " + volume.getLebar());
        System.out.println("Tinggi kubus = " + volume.getTinggi());

        System.out.println("Volume kubus = " + volume.hitungVolume());
    }
}
