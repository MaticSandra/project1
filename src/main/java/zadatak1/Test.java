package zadatak1;

public class Test {

    String nazivTesta;
    double trajanjeTesta;

    String brTesta;

    public String getNazivTesta() {
        return nazivTesta;
    }

    public void setNazivTesta(String nazivTesta) {
        this.nazivTesta = nazivTesta;
    }

    public double getTrajanjeTesta() {
        return trajanjeTesta;
    }

    public void setTrajanjeTesta(double trajanjeTesta) {
        this.trajanjeTesta = trajanjeTesta;
    }

    @Override
    public String toString() {
        return "Test{" +
                "nazivTesta='" + nazivTesta + '\'' +
                ", trajanjeTesta=" + trajanjeTesta +
                '}';
    }

}
