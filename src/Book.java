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
        if(price >= 0) {
            this.price = price;
        }else{
            this.price = -price;
            System.out.println("default price: " + -price);
        }
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
    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent < 100){
            double sumDiscount = (price * discountPercent) / 100;
            price -= sumDiscount;
            System.out.println("\nApplying a " + discountPercent + "%\n");
            System.out.println("New Price: " + price);
        }
        else {
            System.out.println("\n Discount percentage must be greater than 0.00 and less than 100.\n");
        }
    }
}
