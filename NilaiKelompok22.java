import java.util.Scanner;
public class NilaiKelompok22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, nilai;
        float totalNilai, rataNilai;
        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok"+i);   
        totalNilai = 0;
        for(j=1; j<=5; j++) {
            System.out.print(" Nilai dari kelompok penilai ke-"+j+" : ");
            nilai = sc.nextInt();
            totalNilai += nilai;
        }
        rataNilai = totalNilai/5;
        System.out.println(" Rata-rata nilai kelompok "+i+" : "+rataNilai);
        i++;
    }
        sc.close();
    }
}
