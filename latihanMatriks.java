
import java.util.Scanner;

public class latihanMatriks {
    public static void main(String[] args) {
        
        //input jumlah baris dan kolom
        Scanner input =  new Scanner (System.in);
        System.out.println("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.println("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int matriksA [][] = new int [baris] [kolom];
        int matriksB [][] = new int [baris] [kolom];

        //memasukkan nilai dari matriks A
        System.out.println("Masukkan elemen matriks A: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j  < kolom; j++){
            System.out.print("A[" + i + "][" + j + "] = ");
            matriksA[i][j] = input.nextInt();
            } 
        }

        //memasukkan nilai dari matriks B
        System.out.println("Masukkan elemen matriks B: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j  < kolom; j++){
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = input.nextInt();
            }
        }           
         
       
        //penjumlahan matriks A + matriks B
         int hasil [][] = new int [baris] [kolom];
        for (int i = 0; i <matriksA.length; i ++){
            for (int j =0; j < matriksA[i].length; j ++){
                hasil[i][j]= matriksA[i][j]+matriksB[i][j];
            }
            System.out.println();
        }


        //print out hasil dari penjumlahan matriks A dan B
        System.out.println("Hasil dari penjumlahan matriks A + matriks B: ");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j  < hasil[i].length; j++){
                System.out.print(hasil[i][j] + " ");
            }    
              System.out.println();
        }
    }
}