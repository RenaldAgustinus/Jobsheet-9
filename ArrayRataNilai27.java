import java.util.Scanner;
public class ArrayRataNilai27 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        double total = 0, totaltdklolos = 0;
        double rata2, rata2tdklolos;
        int jmlmahasiswalolos = 0, jmlmahasiswatidaklolos = 0, jmlmhs;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlmhs = input.nextInt();
        int[] nilaiMhs = new int[jmlmhs];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] >70) {
            System.out.println("Mahasiswa ke-" +(i+1) + " lulus");
            total += nilaiMhs[i];
            jmlmahasiswalolos++;
            }else{
            
            System.out.println("Mahasiswa ke-" +(i+1) + " tidak lulus");
            totaltdklolos += nilaiMhs[i];
            jmlmahasiswatidaklolos++;}
}
        rata2 = total/jmlmahasiswalolos;
        System.out.println("Rata-rata Mahasiswa yang lolos adalah " + rata2);
        rata2tdklolos = totaltdklolos/jmlmahasiswatidaklolos;
        System.out.println("Rata-rata Mahasiswa yang tidak lolos adalah " + rata2tdklolos);
}
}