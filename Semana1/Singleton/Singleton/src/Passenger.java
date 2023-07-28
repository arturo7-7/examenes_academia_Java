public class Passenger {

    private String name;
    private String passport;
    private String nationality;

    public Passenger(String name, String passport, String nationality) {
        this.name = name;
        this.passport = passport;
        this.nationality = nationality;
    }

    public Passenger(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public void addPassenger(){
        //Se accede a la instancia compartida con los recursos que esta comparte
        DataBase resources=  DataBase.getDatabase();
        resources.getPassengers().add(this);
        System.out.println("Se agrego el recurso usando un objeto Singleton: : "+ resources);
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public String getNationality() {
        return nationality;
    }
}

