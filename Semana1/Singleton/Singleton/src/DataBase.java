import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static DataBase database;
    private static List<Flight> flights;
    private static List<Passenger> passengers;


    /**
     * Recursos que comparte Passenger y Flight
     * Se construyen estas listas de objetos al momento de referenciar a Database.
     * **/
    private DataBase(){
        flights=new ArrayList<>();
        passengers=new ArrayList<>();
    }

    /**
     * Validamos que solo se genere un instancia al momento de llamar al metodo y generar un recurso
     * @return
     */

    public static DataBase getDatabase(){
        if(database==null)
            database=new DataBase();
        return  database;
    }

    /**
     * @return Retorna una lista de los vuelos.
     */
    public static List<Flight> getFlights() {
        return flights;
    }

    /***
     *
     * @return Retorna la lista de pasajeros
     */
    public static List<Passenger> getPassengers() {
        return passengers;
    }




}
