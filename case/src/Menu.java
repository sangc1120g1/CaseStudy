import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1:Rent a room ");
            System.out.println("2:Pay for room ");
            System.out.println("3:Search customer ");
            System.out.println("4 Show All room ");
            System.out.println("5: ");
            System.out.println("your chose");
            ChoseMenu(Sc.nextInt());
        } while (true);
    }
    public static void ChoseMenu(int number){
        Scanner Sc = new Scanner(System.in);
        switch (number){
            case 1:
                try {
                    System.out.print("Input number of users ");
                    int users = Sc.nextInt();
                    ChoseRoom();
                    System.out.print("Chose Room ");
                    int room = Sc.nextInt();
                    HotelManager.add(users,room);
                } catch (Exception ex){
                    System.out.println("Input Int Number");
                    ChoseMenu(number);
                }
               break;
            case 2:
                try {
                    System.out.print("Input Id room ");
                    int id = Sc.nextInt();
                    System.out.println("Room: "+id+", the amount payable is: "+ HotelManager.priceCalculation(id));
                } catch (Exception ex){
                    System.out.println("Input Int Number");
                    ChoseMenu(number);
                }
                break;
            case 3:
                try {
                    System.out.print("Input Id room ");
                    HotelManager.search(Sc.nextInt());
                } catch (Exception e){
                    System.out.println("Input Int Number");
                }
                break;
            case 4:
                HotelManager.ShowAll();
        }
    }
    public static void ChoseRoom(){
        System.out.println("1: Room Normal, Price : 100000VND/1H, Id: 101 ");
        System.out.println("2: Room Cheap, Price : 80000VND/1H, Id: 102  ");
        System.out.println("3: Room Vip, Price : 120000VND/1H, Id: 103 ");
        System.out.println("4: Room VIP room type 1, Price : 140000VND/1H, Id: 104 ");
        System.out.println("5: Room VIP room type 2 : 100000VND/1H, Id: 105 ");
    }
}
