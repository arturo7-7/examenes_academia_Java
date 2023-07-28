import java.math.BigDecimal;

public class Flight {
    private String id;
    private String travelOrigin;
    private String travelDestination ;
    private BigDecimal cost;

    public Flight(String travelOrigin, String travelDestination, BigDecimal cost) {
        this.travelOrigin = travelOrigin;
        this.travelDestination = travelDestination;
        this.cost = cost;
    }

    /**
     * Metodo que permite añadir los recursos a una base de datos
     *
     */
    public void addFlight(){
        //genero instancia de base  de datos
        DataBase resources = DataBase.getDatabase();
        DataBase.getFlights().add(this);
        System.out.println("Se agrego el recurso usando un objeto Singleton: " +resources);
    }

    public String getId() {
        return id;
    }

    public String getTravelOrigin() {
        return travelOrigin;
    }

    public String getTravelDestination() {
        return travelDestination;
    }

    public BigDecimal getCost() {
        return cost;
    }
}
