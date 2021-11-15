import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> scans;


    public Wallet(String name) {
        this.name = name;
        this.scans = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.scans.size();
    }

    public void addItem(IScan item) {
        this.scans.add(item);
    }

}
