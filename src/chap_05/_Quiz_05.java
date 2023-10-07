package chap_05;

public class _Quiz_05 {
    // 배열을 활용해 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오.
    //조건
    //신발 사이즈는 250부터 295까지 5 단위로 증가.
    //신발 사이즈 수는 총 10가지
    public static void main(String[] args) {
        int[]size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5*i);

        }
        for (int s : size) {
            System.out.println("사이즈 " + s + " 재고 있음");
            
        }

//        int[]size = new int[11];
//        int sz = 250;
//        for (int i = 0; i < 10; i++) {
//            size[i] = 250 + (5*i);
//            System.out.println("신발 사이즈" + size[i] + " 재고있음");
//
//        }
//
    }
}
