public class buffer {
    public static void main(String[] args) {
        //No 2
        System.out.println("soal no 2");
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(100);
        StringBuffer sb3 = new StringBuffer("halo");
        System.out.println(sb1 + " Jarak : " + sb1.length() + " Kapasitas : " + sb1.capacity());
        System.out.println(sb2 + " Jarak : " + sb2.length() + " Kapasitas : " + sb2.capacity());
        System.out.println(sb3 + " Jarak : " + sb3.length() + " Kapasitas : " + sb3.capacity());
        
        for (int i = 1; i <= 2 ; i++){
            System.out.println();
        }

        //No 3
        System.out.println("soal no 3");
        StringBuffer ABC = new StringBuffer();
        for (int i = 1; i <= 5 ; i++){
            ABC.append("abc ");
        }
        System.out.println(ABC);

        for (int i = 1; i <= 2 ; i++){
            System.out.println();
        }

        //Contoh no 4
        System.out.println("Contoh kondisi");
        System.out.println(ABC.capacity());
        System.out.println(ABC.length());

        for (int i = 1; i <= 2 ; i++){
            System.out.println();
        }

        //No 5
        System.out.println("soal no 5");
        String swapped = ("Swap");
        System.out.println(swapped);
        StringBuffer swap =  new StringBuffer();
        swap.append(swapped);
        System.out.println(swap);
        swapped = swap.toString();
        System.out.println(swapped);

        

    }
    
}
