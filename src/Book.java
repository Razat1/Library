public class Book{
    private String name;
    private int qty = 0;
    private double price;
    Author author;

    public Book(String name, int qty, double price, Author author) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.author = author;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", qty=" + qty + ", price=" + price + "]";
    }
}
