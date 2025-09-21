public class Patient {
    private static String hospitalName="Max Hospital";
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
    private static int totalPatients=0;

    Patient(int patientID,String name,int age,String ailment){
      this.patientID=patientID;
      this.name=name;
      this.age=age;
      this.ailment=ailment;
      totalPatients++;
    }

    public void display(){
        if(this instanceof Patient){
           System.out.println("Hospital Name is: "+hospitalName);
           System.out.println("Patient Id is: "+patientID);
           System.out.println("Patient Name is: "+name);
           System.out.println("Patient Age is: "+age);
           System.out.println("Patient ailment is: "+ailment);
        }
        
    }

    public static void getTotalPatients(){
        System.out.println("Total Patients Admitted: "+totalPatients);
    }


    public static void main(String[] args) {
        Patient patient1=new Patient(101, "Malika", 25, "Hypertension");
        Patient patient2=new Patient(102, "Runal", 29, "Hypertension");

        patient1.display();
        patient2.display();

        Patient.getTotalPatients();
    }
}
