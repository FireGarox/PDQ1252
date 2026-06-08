public class rekrusif{
static int Cetakbintang(int n) {
    // no 3
    if (n==0) return 0; // base state/kondisi dasar
    for (int i = 1; n >= i ; i++){
        System.out.print("* ");
    }
    System.out.println();
   
    return Cetakbintang(n-1);  // pemanggilan akan berulang hingga mencapai kondisi dasar
    

}
static void cetakNaik(int n){
    // no 4
    if (n == 0){
        System.out.println("Start");
        return;}
    cetakNaik(n-1);
    // pemanggilan akan tertunda hingga mencapai base state/kondisi dasar, dan akan dimulai dari angka terakhir yang diproses.
    System.out.println(n);
}
public static void main(String[] args) {
    Cetakbintang(5);
    cetakNaik(5);
}
}