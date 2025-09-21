public class Vehicle {
    private static double registrationFee=1000;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String registrationNumber,String ownerName,String vehicleType){
        this.registrationNumber=registrationNumber;
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    public void display(){
        if(this instanceof Vehicle){
            System.out.println("Registration Number is: "+registrationNumber);
            System.out.println("Owner Name is: "+ownerName);
            System.out.println("Vehicle Type is: "+vehicleType);
            System.out.println("Registration Fee is: "+registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle("XYZ1234", "Malika", "Car");
        Vehicle vehicle2=new Vehicle("ABC1234", "Runal", "MotorBike");

        vehicle1.display();
        vehicle2.display();
    }
}
