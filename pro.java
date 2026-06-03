import java.util.Scanner;

public class pro {
    // No 2
    // Pembatas untuk format kartu
    static void pembatas(){
        for (int i = 1; i <= 30; i++){
            System.out.print("=");
        }
        System.out.println();
        

    }
    // Untuk mengisi nama, nim, dan ipk. tidak ada return
    static void tampilkanMahasiswa(String nama, String nim, double ipk){
        System.out.println("Nama    : " + nama);
        System.out.println("Nim     : " + nim);
        System.out.println("Ipk     : " + ipk);


    }
     //No 3
    static void cetakTabel(int angka){
        for (int i = 1; i <=10; i++ ){
            System.out.println(angka + " x " + i + " = " + (angka*i));
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //No 2
        System.out.println("No 2");
        System.out.println("Masukkan nama, nim, dan ipk");
        String nama, nim;
        double ipk;
        System.out.println("Masukkan Nama");
        nama = scan.nextLine();
        System.out.println("Masukkan Nim");
        nim = scan.nextLine();
        System.out.println("Masukkan Ipk");
        ipk = scan.nextFloat();
        pembatas();
        tampilkanMahasiswa(nama, nim, ipk);
        pembatas();
        //No 3
        System.out.println("No 3");
        System.out.println("Masukkan Angka");
        int angka;
        angka = scan.nextInt();
        pembatas();
        cetakTabel(angka);
        pembatas();
    }
   
}
