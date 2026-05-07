import java.util.Scanner;

public class Uts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pelanggan = 0, bayar =0;
        String[] provider, jenis;
        int[] nominal = {100000,50000,25000,15000};
        int[] total;
        double[] cashback;
        pelanggan = scan.nextInt();
        provider = new String[pelanggan];
        jenis = new String[pelanggan];
        total = new int[pelanggan];
        cashback = new double[pelanggan];
        
        for(int i = 0; i < provider.length; i++) {
        provider = new String[pelanggan];
        jenis = new String[pelanggan];
        total = new int[pelanggan];
         System.out.println("provider");
            provider[i] = scan.nextLine();
            provider[i] = scan.nextLine();
            System.out.println("jenis");
            jenis[i] = scan.nextLine();
            total[i] = scan.nextInt();
        }
        for(int i = 0; i < pelanggan; i++) {
            if (nominal[total[i]]>=100000){
        cashback[i] = 0.15;

        } else if(nominal[total[i]]>=50000){
        cashback[i] = 0.10;



        } else {
        cashback[i] = 0;
        }

        }
        for(int i = 0; i < pelanggan; i++) {
            System.out.println("pelanggan ke " + (i+1));
            System.out.println(provider[i]);
            System.out.println(jenis[i]);
            System.out.println(nominal[total[i]]);
            System.out.println(cashback[i]*100);
            System.out.println(nominal[total[i]]-cashback[i]*nominal[total[i]]);


        }






    }
    
}
