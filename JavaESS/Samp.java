package ch4;

 class Samp {
     int id = 1;

     public Samp(int i) {
     }

     public void Samp(int x){
         this.id = x;
     }
     public Samp(){
         this(0);
         System.out.println("생성자 호출");

     }

     public static void main(String[] args) {
         Samp sample = new Samp(1);
         System.out.println(sample.id);
         Samp sample1 = new Samp();
         System.out.println(sample1.id);
     }
}
