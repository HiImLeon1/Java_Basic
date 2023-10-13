package ch4;

public class Book {
    String title;
    String author;
    public Book(){
        this("","");
        System.out.println("다른 생성자 호출됨.");
    }
    public Book(String title){
        this.title = title;
        author = "밝혀지지 않음.";
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
public void show(){
    System.out.println(title + " " + author);
}

}
