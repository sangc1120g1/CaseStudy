import java.util.ArrayList;

public class Hotel {
    private int price;
    private int id;
    private String speciesRoom;
    private double timeIn;
    private double timeOut;

    public double getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(double timeIn) {
        this.timeIn = timeIn;
    }

    public double getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(double timeOut) {
        this.timeOut = timeOut;
    }

    public String getSpeciesRoom() {
        return speciesRoom;
    }

    public void setSpeciesRoom(String speciesRoom) {
        this.speciesRoom = speciesRoom;
    }

    private ArrayList<customer> customerArrayList = new ArrayList<>();

    public Hotel(){}

    public Hotel(int price, int id,String speciesRoom) {
        this.price = price;
        this.id = id;
        this.speciesRoom = speciesRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "price=" + price +
                ", id=" + id +
                ", speciesRoom='" + speciesRoom + '\'' +
                ", customerArrayList=" + customerArrayList +
                '}'+"\n";
    }
}
