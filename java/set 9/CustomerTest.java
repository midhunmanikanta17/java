import java.util.Scanner;
class Customer {
    private int customerNumber;
    private String customerName;
    private double price;
    private int qty;
    private double discount;
    private double totalPrice;
    private double netPrice;
    public void init() {
        this.customerNumber = 101;this.customerName = "Ajay";
        this.qty = 0;
        this.price = 0;
        this.discount = 0;
        this.netPrice = 0;
    }
    private void calDiscount() {
        this.totalPrice = this.price * this.qty;
        this.discount=this.discount*this.totalPrice;
        this.netPrice = this.totalPrice - this.discount;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer number: ");
        this.customerNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter customer name: ");
        this.customerName = scanner.nextLine();
        System.out.print("Enter price: ");
        this.price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        this.qty = scanner.nextInt();
        System.out.print("Enter Discount:");
        this.discount=scanner.nextDouble();
        calDiscount();
    }
    public void show() {
        System.out.println("Customer Number: " + this.customerNumber);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Price: $" + this.price);
        System.out.println("Quantity: " + this.qty);
        System.out.println("Total Price: $" + this.totalPrice);
        System.out.println("Discount: $" + this.discount);
        System.out.println("Net Price: $" + this.netPrice);
    }
}
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.init();
        customer.input();
        customer.show();
    }
}
