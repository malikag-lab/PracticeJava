public class Employee {
    private static String companyName="Infosys";
    private static int totalEmployees=0;
    private String name;
    private final int id;
    private String designation;

    Employee(String name,String designation,int id){
        this.name=name;
        this.designation=designation;
        this.id=id;
        totalEmployees++;
    }

    public void display(){
        if(this instanceof Employee){
            System.out.println("Company Name is: "+companyName);
            System.out.println("Employee ID is: "+id);
            System.out.println("Employee Name is: "+name);
            System.out.println("Employee Designation is: "+designation);
        }
    }

    public static void displayTotalEmployees(){
        System.out.println("Total Employees are: "+totalEmployees);
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("Malika Gauba", "Software Engineer", 101);
        Employee emp2=new Employee("Runal Gupta", "Product Manager", 102);

        emp1.display();
        emp2.display();

        Employee.displayTotalEmployees();
    }
}
