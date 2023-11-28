package JOBSHEET_13;
import java.util.Scanner;

public class FungsiNilai13 {

    // Dataa nilai mahasiswa
    static int[][] scores = new int [5][7];
       
    // Fungsi untuk menginput data nilai mahasiswa
    public static void inputScores(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<scores.length; i++){
            System.out.println("Masukkan 7 nilai mingguan untuk mahasiswa " +(i+1)+ ": ");
            for(int j=0; j<scores[0].length; j++){
                scores[i][j] = sc.nextInt(); 
            }
        } sc.close();
    }
    
    // Fungsi untuk menampilkan nilai mahasiswa
    public static void printScores(){ 
        System.out.println("Nilai Mingguan Mahasiswa:");
        for(int i=0; i<scores.length; i++){
            System.out.print("Mahasiswa " + (i+1) +": "); 
            for(int j=0; j<scores[0].length; j++){
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Fungsi mencari nilai tertinggi
    public static void highestScore(){
        int highest = 0;
        int week = 0;
        
        for(int i=0; i<scores.length; i++){
            for(int j=0; j<scores[0].length; j++){
                if(scores[i][j] > highest){
                    highest = scores[i][j];
                    week = j+1; 
                }
            }
        }
        
        System.out.println("Nilai tertinggi adalah " + highest + " pada minggu ke-" + week);
    }
    
    // Fungsi menampilkan mahasiswa nilai tertinggi 
    public static void bestStudent(){
        int highest = 0;
        int bestSt = 0;
        int total;
        
        for(int i=0; i<scores.length; i++){
            total = 0;
            for(int j=0; j<scores[0].length; j++){
                total += scores[i][j];
            }
            
            if(total > highest){
                highest = total;
                bestSt = i+1;
            }
        }
        
        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa " 
            + bestSt + " dengan total nilai " + highest);
    }
    
    public static void main(String[] args) {
        inputScores();
        printScores(); 
        highestScore();
        bestStudent();
    }
    

}