public class Book {
    String title ;
    String author;
    double price ;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }
    public void updatePrice(double newPrice) {
        if(newPrice >= 0) {
            this.price = newPrice;
        }else{
            this.price = -newPrice;
            System.out.println("default price: " + -newPrice);
        }
    }
}
