import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    List<Way> ways = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }
    public void addWay(Way way) {
        ways.add(way);
    }

    public void deleteWay(Way way) {
        ways.remove(way);
    }

    @Override
    public String toString() {
        return name;
    }

    public void showWays() {
        System.out.println(ways);;
    }
}