package hw8;

public class App3 {
    public static void main(String[] args) {

        // Books

     Books book1 = new Books();
     book1.bookname = "A Journey to the Centre of the Earth";
     book1.price = 5.23;
     book1.pages = 235;
     book1.author = "Jules Verne";

     book1.Read();
     book1.search("Mark");

     Books book2 = new Books();
     book2.author = "Dan Brown";
     book2.bookname = "The lost symbol";
     book2.price = 8.10;

     book2.Read();
     book2.search("Dan");

    }
}
