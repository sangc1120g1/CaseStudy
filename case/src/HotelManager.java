import java.util.ArrayList;
import java.util.Scanner;

public class HotelManager {

    static ArrayList<Hotel> hotelArrayList = new ArrayList<>();
    private static final Scanner Sc = new Scanner(System.in);

    static {
        hotelArrayList.add(new Hotel(100000, 101, "Normal"));
        hotelArrayList.add(new Hotel(80000, 102, "Cheap"));
        hotelArrayList.add(new Hotel(120000, 103, "Vip"));
        hotelArrayList.add(new Hotel(140000, 104, "Vip1"));
        hotelArrayList.add(new Hotel(160000, 105, "Vip2"));
    }
    public static void add(int number, int chose) {

        String name = ScannerMethod.ScannerName();
        int age = ScannerMethod.ScannerAge();
        int id = ScannerMethod.ScannerId();
        switch (chose) {
            case 1:
                if (checkRoom(101)) {
                    try{
                        System.out.println("Input Time In");
                        hotelArrayList.get(0).setTimeIn(Sc.nextDouble());
                    } catch (Exception ex){
                        System.out.println("Input Int Number");
                        add(number,chose);
                    }
                    IsRoomNormal(number, chose, name, age, id);
                } else {
                    for (Hotel hotel : hotelArrayList) {
                        if (hotel.getCustomerArrayList().size() == 0) {
                            System.out.println("Room is null :" + hotel.getId());
                        }
                    }
                }
                break;
            case 2:
                try{
                    System.out.println("Input Time In");
                    hotelArrayList.get(1).setTimeIn(Sc.nextDouble());
                } catch (Exception ex){
                    System.out.println("Input Int Number");
                    add(number,chose);
                }
                if (checkRoom(102)) {
                    isRoomCheap(number, chose, name, age, id);
                } else {
                    for (Hotel hotel : hotelArrayList) {
                        if (hotel.getCustomerArrayList().size() == 0) {
                            System.out.println("Room is null :" + hotel.getId());
                        }
                    }
                }
                break;
            case 3:
                try{
                    System.out.println("Input Time In");
                    hotelArrayList.get(2).setTimeIn(Sc.nextDouble());
                } catch (Exception ex){
                    System.out.println("Input Int Number");
                    add(number,chose);
                }
                if (checkRoom(103)) {
                    isRoomVip(number, chose, name, age, id);
                } else {
                    for (Hotel hotel : hotelArrayList) {
                        if (hotel.getCustomerArrayList().size() == 0) {
                            System.out.println("Room is null :" + hotel.getId());
                        }
                    }
                }
                break;
            case 4:
                try{
                    System.out.println("Input Time In");
                    hotelArrayList.get(3).setTimeIn(Sc.nextDouble());
                } catch (Exception ex){
                    System.out.println("Input Int Number");
                    add(number,chose);
                }
                if (checkRoom(104)) {
                    isRoomVip1(number, chose, name, age, id);
                } else {
                    for (Hotel hotel : hotelArrayList) {
                        if (hotel.getCustomerArrayList().size() == 0) {
                            System.out.println("Room is null :" + hotel.getId());
                        }
                    }
                }
                break;
            case 5:
                try{
                    System.out.println("Input Time In");
                    hotelArrayList.get(4).setTimeIn(Sc.nextDouble());
                } catch (Exception ex){
                    System.out.println("Input Int Number");
                    add(number,chose);
                }
                if (checkRoom(105)) {
                    isRoomVip2(number, chose, name, age, id);
                } else {
                    for (Hotel hotel : hotelArrayList) {
                        if (hotel.getCustomerArrayList().size() == 0) {
                            System.out.println("Room is null :" + hotel.getId());
                        }
                    }
                }
                break;
            default:
                System.out.println("Out of room");
        }
    }

    private static void isRoomVip2(int number, int chose, String name, int age, int id) {
        try {
            if (number == 1) {
                hotelArrayList.get(4).getCustomerArrayList().add(new customer(name, age, id));
            } else if (number == 2) {
                hotelArrayList.get(4).getCustomerArrayList().add(new customer(name, age, id));
                hotelArrayList.get(4).getCustomerArrayList().add(new customer(name, age, id));
            }
        } catch (Exception ex) {
            System.out.println("Exceeded number of people");
            add(number, chose);
        }
    }

    private static void isRoomVip1(int number, int chose, String name, int age, int id) {
        try {
            if (number == 1) {
                hotelArrayList.get(3).getCustomerArrayList().add(new customer(name, age, id));
            } else if (number == 2) {
                hotelArrayList.get(3).getCustomerArrayList().add(new customer(name, age, id));
                hotelArrayList.get(3).getCustomerArrayList().add(new customer(name, age, id));
            }
        } catch (Exception ex) {
            System.out.println("Exceeded number of people");
            add(number, chose);
        }
    }

    private static void isRoomVip(int number, int chose, String name, int age, int id) {
        try {
            if (number == 1) {
                hotelArrayList.get(2).getCustomerArrayList().add(new customer(name, age, id));
            } else if (number == 2) {
                hotelArrayList.get(2).getCustomerArrayList().add(new customer(name, age, id));
                hotelArrayList.get(2).getCustomerArrayList().add(new customer(name, age, id));
            }
        } catch (Exception ex) {
            System.out.println("Exceeded number of people");
            add(number, chose);
        }
    }

    private static void isRoomCheap(int number, int chose, String name, int age, int id) {
        try {
            if (number == 1) {
                hotelArrayList.get(1).getCustomerArrayList().add(new customer(name, age, id));
            } else if (number == 2) {
                hotelArrayList.get(1).getCustomerArrayList().add(new customer(name, age, id));
                hotelArrayList.get(1).getCustomerArrayList().add(new customer(name, age, id));
            }
        } catch (Exception ex) {
            System.out.println("Exceeded number of people");
            add(number, chose);
        }
    }

    private static void IsRoomNormal(int number, int chose, String name, int age, int id) {
        try {
            if (number == 1) {
                hotelArrayList.get(0).getCustomerArrayList().add(new customer(name, age, id));
            } else if (number == 2) {
                hotelArrayList.get(0).getCustomerArrayList().add(new customer(name, age, id));
                hotelArrayList.get(0).getCustomerArrayList().add(new customer(name, age, id));
            }
        } catch (Exception ex) {
            System.out.println("Exceeded number of people");
            add(number, chose);
        }
    }

    public static void delete(int id) {
        if (!checkRoom(id)) {
            for (Hotel hotel : hotelArrayList) {
                if (hotel.getId() == id) {
                    hotel.getCustomerArrayList().clear();
                }
            }
        } else {
            System.out.println("This room has no users");
        }
    }

    public static void search(int id) {
        if (!checkRoom(id)) {
            for (Hotel hotel : hotelArrayList) {
                if (hotel.getId() == id) {
                    for (int i = 0; i < hotelArrayList.get(i).getCustomerArrayList().size(); i++) {
                        System.out.println("Name: "+hotelArrayList.get(i).getCustomerArrayList().get(i).getName());
                        System.out.println("Id: "+hotelArrayList.get(i).getCustomerArrayList().get(i).getId());
                        System.out.println("Age: "+hotelArrayList.get(i).getCustomerArrayList().get(i).getAge());
                    }
                    break;
                }
            }
        } else {
            System.out.println("Room is not a users");
        }
    }

//    public static void update() {
//        for (int i = 0; i < hotelArrayList.size(); i++) {
//            if (hotelArrayList.get(i).getCustomerArrayList().get(i).getId())
//        }
//    }

    public static void ShowAll(){
        System.out.println(hotelArrayList.toString());
    }

    public static double priceCalculation(int id) {
        double price = 0;
        if (!checkRoom(id)){
            System.out.println("Input Time Out");
            for (int i = 0; i < hotelArrayList.size(); i++) {
                if (hotelArrayList.get(i).getId()==id){
                    hotelArrayList.get(i).setTimeOut(Sc.nextDouble());
                    price = (isResultTime(i) *(hotelArrayList.get(i).getPrice()));
                    break;
                }
            }
            delete(id);
        } else {
            System.out.println("Room is not a User");
        }
        return price;
    }

    private static double isResultTime(int i) {
        return hotelArrayList.get(i).getTimeOut() - hotelArrayList.get(i).getTimeIn();
    }

    public static boolean checkRoom(int id) {
        boolean status = false;
        for (Hotel hotel : hotelArrayList) {
            if (hotel.getId() == id) {
                if (hotel.getCustomerArrayList().size() == 0) {
                    status = true;
                    break;
                }
            }
        }
        return status;
    }
}
