package ch4;

public class p147 {

    public static void main(String[] args) {
        Book emptyBook = new Book();
        System.out.println(emptyBook.title + "" + emptyBook.title);
        Book littlePrince = new Book("어린왕자", "생택쥐페리.");
        Book loveStory = new Book("춘향전");
//        System.out.println(littlePrince.title + "의 저자는 " + littlePrince.author);
//        System.out.println(loveStory.title + "의 저자는 " + loveStory.author);
        emptyBook.show();
        littlePrince.show();
        loveStory.show();

    }
}
