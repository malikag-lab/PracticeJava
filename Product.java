public class Product {
    private static double discount=10;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID,String productName,double price,int quantity){
        this.productID=productID;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }

    public void display(){
        if(this instanceof Product){
            System.out.println("Product Id is: "+productID);
            System.out.println("Product Name is: "+productName);
            System.out.println("Product Price is: "+price);
            System.out.println("Product Quantity is: "+quantity);
            System.out.println("Product Discount is: "+discount+ "%");
        }


    }

    public static void updateDiscount(double newDisacount){
        discount=newDisacount;
        System.out.println("Updated Discount is: "+discount+" % ");
    }

    public static void main(String[] args) {
        Product product1=new Product(101, "Laptop", 50000,5);
        Product product2=new Product(102, "Smartphone", 45000,10);
        
        product1.display();
        product2.display();
        Product.updateDiscount(20);
       
    }
}
