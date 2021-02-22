import java.util.Scanner;

public class ScannerMethod {
    static public String ScannerName(){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input Name ");
        return Sc.nextLine();
    }
    static public int ScannerAge(){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input Age ");
        return Sc.nextInt();
    }
    static public int ScannerId(){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input Id ");
        return Sc.nextInt();
    }
}
