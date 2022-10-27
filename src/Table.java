import java.util.ArrayList;

public class Table {
    private   ArrayList<Integer> demand = new ArrayList<>(6);

    public ArrayList<Integer> getDemand() {
        return demand;
    }

    public void setDemand(ArrayList<Integer> Demand) {
        this.demand = Demand;
    }
}
