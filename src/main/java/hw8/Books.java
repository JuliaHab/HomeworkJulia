package hw8;

public class Books {
    public String bookname;
    public String author;
    public double price;
    public int pages;

    public void Read(){
        System.out.println("Today I read the whole book "+bookname+"\nThe book was written by the "+author+". It had "+pages+" pages.");
    }

    public void search(String name){
        System.out.println(name+" was looking for a book in a bookstore. Search parameters: "+"\nName: "+bookname+"; \nAuthor: "+author+"; \nPages: "+pages+"; \nPrice: "+price);
    }
}
