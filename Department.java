import java.util.ArrayList;

public class Department<T> {
    public String name;
    public int numOfInstruments;
    public ArrayList<T> instruments;

    public Department(String name) {
        this.name = name;
        numOfInstruments = 0;
        instruments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfInstruments() {
        return numOfInstruments;
    }

    public void addInstrument(T instrument) {
        instruments.add(instrument);
        numOfInstruments++;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", numOfInstruments=" + numOfInstruments +
                ", instruments=" + instruments +
                '}';
    }
}
