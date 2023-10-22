package studyAlone;

public class prac1 {
    String title;
    public prac1(String t){
        this.title = t;

    }
    String getTitle(){
        return title;
    }
    public static void main(String[] args) {
        prac1 mySong = new prac1("Nessun Dorma");
        prac1 yourSong = new prac1("공잠못");
        System.out.println(mySong.getTitle());
        System.out.println(yourSong.getTitle());
    }
}
