import java.util.ArrayList;

public class zooManager {
    public String name;
    public String destription;
    public ArrayList<Enclosure> enclosures;

    public Zoo (String name, String description, ArrayList<Enclosure> enclosures)
    {
        this.name = name;
        this.destription = description;
        this.enclosures = enclosures;
    }

    public String getName() {
        return name;
    }

    public string getDescription() {
        return destription;
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public int getTotalEnclosureArea() {
        int totalEnclosureArea = 0;
        for (int i = 0; i < enclosures.size(); i++) {
            totalEnclosureArea += enclosures[i].area;
        }
        return totalEnclosureArea;
    }

    public int countEnclosures() {
        return enclosures.size();
    }
}
