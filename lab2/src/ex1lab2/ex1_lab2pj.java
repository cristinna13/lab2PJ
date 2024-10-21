package ex1lab2;

    import java.io.*;

    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

public class ex1_lab2pj {
    public static void main(String[] args) throws FileNotFoundException {
        String[] judete;
        Scanner scanner=new Scanner(new File("src/ex1lab2/judete_in.txt"));
        judete=scanner.nextLine().split(", ");
        scanner.close();
        Arrays.sort(judete);
        Scanner scanner_citire=new Scanner(System.in);
        String cautat=scanner_citire.nextLine();
        scanner_citire.close();
        int i=Arrays.binarySearch(judete,cautat);
        System.out.println("Judetul: " + cautat + " se afla pe pozitia "+i);

    }
}