import javax.print.attribute.standard.MediaSize;
import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Front {

    /**
     * El objeto scanner ya no permite referenciar a otro objeto, si se puede modificar el objeto.
     * El ojeto es mutable por eso se puede cambiar la ref.
     */
    private final static Scanner in = new Scanner(System.in);
    static void mainMenu() {


        int op;
        do {
            optionsMenu();
            op =in.nextInt();
            switch (op) {
                case 1: registerFlight(); break;
                case 2:
                    registerPassanger();
                    break;
                case 3: flightList(); break;
                case 4:
                    passengersList();
                    break;
                case 5:
                    System.out.println("Vuelva pronto"); break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
        while (op != 5);
    }

    private static void optionsMenu(){
        System.out.println(
                "--------Bienvenido al Aeropuerto FlyMex-------- \n " +
                        "Seleccionar una de las sig. opciones\n" +
                        "1)Registrar Vuelo\n" +
                        "2)Registrar pasajero\n" +
                        "3)Mostrar vuelos\n"+
                        "4)Mostrar pasajeros\n"+
                        "5)Salir"
        );

    }

    private static  void registerPassanger(){
        String name;
        String passport;
        String nationality;

        System.out.println("Nombre: ");
        name=in.next();

        System.out.println("Pasaporte(si no tienes pon N ó n)");
        passport=in.next();

        System.out.println("Nacionalidad");
        nationality=in.next();

        if(passport=="n" || passport=="N") {
            Passenger p = new Passenger(name, nationality);
        }
        Passenger p= new Passenger(name,passport,nationality);
        p.addPassenger();
    }
    private static void passengersList() {
        List<Passenger> passengers = DataBase.getPassengers();
        for (Passenger passenger : passengers) {
            System.out.println(passenger.getName() + " - " + passenger.getPassport()+"-"+passenger.getPassport());
        }
    }
    private static void  registerFlight(){
        String travelOrigin;
        String travelDestination ;
        BigDecimal cost;

        System.out.println("¿Cuál es el Origen?");
        travelOrigin=in.next();

        System.out.println("¿Cuál es el Destino");
        travelDestination=in.next();

        System.out.println("Costo:");
        cost=in.nextBigDecimal();

        Flight f= new Flight(travelDestination,travelOrigin,cost);
        f.addFlight();
    }

    private static  void flightList(){
        List<Flight> flights = DataBase.getFlights();
        for(Flight flight: flights){

            System.out.println(flight.getId()+"Origen: "+flight.getTravelOrigin()+"Destino: "+flight.getTravelDestination()+"-"+flight.getCost());

        }

    }







}
