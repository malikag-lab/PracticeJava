public class Student {
    private static String universityName="Chitkara University";
    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber,String name,String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
    }

    public void display(){
        if(this instanceof Student){
            System.out.println("University is: "+universityName);
            System.out.println("Roll Number of the Student is: "+rollNumber);
            System.out.println("Name of the Student is: "+name);
            System.out.println("Grade of the Student is: "+grade);
        }
    }

    public static void main(String[] args) {
        Student student1=new Student(101, "Malika Gauba", "A");
        Student student2=new Student(102, "Runal Gupta", "A");

        student1.display();
        student2.display();
    }
}
