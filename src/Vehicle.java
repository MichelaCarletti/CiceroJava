public class Vehicle {

    private int vehicle_id;
    private String name;
    private int sets;
    private String description;
    private String plate;

    public Vehicle(int vehicle_id, String name, int sets, String description, String plate){
        this.vehicle_id = vehicle_id;
        this.name = name;
        this.sets = sets;
        this.description = description;
        this.plate = plate;
    }

    public boolean add_vehicle(){return false;}

    public boolean remove_vehicle(int vehicle_id){return false;}
}
