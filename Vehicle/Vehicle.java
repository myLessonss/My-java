public class Vehicle {
    private String vehicleId,plateNumber,model,manufacturer,vehicleType;
    private int manufacturerYear;
    private int courier=1000;

    public Vehicle(String vehicleId,String plateNumber,String model,String manufacturer
        ,String vehicleType,int manufacturerYear){
        this.vehicleId=vehicleId;
        this.plateNumber=plateNumber;
        this.model=model;
        this.manufacturer=manufacturer;
        this.vehicleType=vehicleType;
        this.manufacturerYear=manufacturerYear;

    }
    //Getters

    public String getVehicleId() {
        return vehicleId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getVehicleType(){
        return vehicleType;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }
    //Method to generate automatic counter
    public String generateVehicleId(){
        return "VEHID-"+(++courier);
    }
    //Setters
    public void setVehicleId(String vehicleId) {
        if (vehicleId==null || vehicleId.trim().isEmpty()) {
            this.vehicleId=generateVehicleId();
            return;
        }
        this.vehicleId=vehicleId;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setModel(String model) {
        if (model==null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model must not be Empty");
        }
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer==null||manufacturer.trim().isEmpty()) {
            throw new IllegalArgumentException("Manufacturer must not be Empty");
        }
        this.manufacturer = manufacturer;
    }
    public void setVehicleType(String vehicleType){
        if (vehicleType!="Car"||vehicleType!="Truck"||vehicleType!="Motorcycle"
            ||vehicleType!="Bus"){
            throw new IllegalArgumentException("Valid Vehicle Type is Car,Truck,Motorcycle,Bus");
        }
        this.vehicleType=vehicleType;
    }

    public void setManufacturerYear(int manufacturerYear) {
        if (manufacturerYear<1990) {
            throw new IllegalArgumentException("Manufacture Year must be 1990.");
        }
        this.manufacturerYear = manufacturerYear;
    }
    
    
}
