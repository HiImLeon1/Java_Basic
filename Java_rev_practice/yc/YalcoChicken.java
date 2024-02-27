package yc;

public class YalcoChicken {
    int no;
    String name;
    YalcoChicken (int no, String n){
        this.no = no;
        this.name = n;
    }

    String intro(){
        return "안녕하세요 %d호 %s점 입니다."
                .formatted(no,name);
    }
}
