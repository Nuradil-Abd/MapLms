import inventory.Inventory;
import phoneBook.PhoneBook;
import productPrice.ProductPricing;
import studentGrades.StudentGrades;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Adilet","+996 500444333");
        phoneBook.addContact("Atai","+996 700443211");
        phoneBook.addContact("Baysalbek","+996 502332214");
        System.out.println("phoneBook = " + phoneBook);
        System.out.println("phoneBook.findContacts(\"Atai\") = " + phoneBook.findContacts("Atai"));
        phoneBook.removeContact("Adilet");
        System.out.println("phoneBook = " + phoneBook);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        StudentGrades studentGrades = new StudentGrades();
        studentGrades.addStudent("Kayrat");
        studentGrades.addGrades("Kayrat", 8);
        studentGrades.addGrades("Kayrat", 10);
        studentGrades.addGrades("Kayrat", 7);
        studentGrades.addGrades("Kayrat", 8);
        System.out.println("studentGrades.averageGrade(\"Kayrat\") = " + studentGrades.averageGrade("Kayrat"));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        Inventory inventory = new Inventory();
        inventory.addInventory("MacBook m1", 7);
        inventory.addInventory("MacBook m2", 3);
        inventory.addInventory("MacBook m3", 1);
        inventory.addInventory("MacBook m3 pro MAX", 0);
        System.out.println(inventory);
        inventory.updateQuantity("MacBook m1",5);
        System.out.println("inventory.isProductOutOfStock(\"MacBook m3 pro MAX\") = " + inventory.isProductOutOfStock("MacBook m3 pro MAX"));
        System.out.println(inventory);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        ProductPricing productPricing = new ProductPricing();
        productPricing.addProduct("MacBook m1", 999.99);
        productPricing.addProduct("MacBook m2", 1299.99);
        productPricing.addProduct("MacBook m3", 1499.99);
        System.out.println("productPricing.totalPrice() = " + productPricing.totalPrice());


    }
}