package studyAlone;

public class Song {
    String title;
    String songname;

    public Song(String t) {
        title = t;
        songname = "허각";
    }
    public Song(String t,String a){
        title = t;
        songname = a;
    }
    public static void main(String[] args) {
        Song horizontal = new Song("사건의 자평선","윤하");
        Song hello = new Song("헬로");
        System.out.println(horizontal.title + "의 작가는 " + horizontal.songname);
        System.out.println(hello.title + "의 작가는 " + hello.songname);
    }
}
