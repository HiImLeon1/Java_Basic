String hi({
  
           required String name,
           required int age,
           required String country, // named arguments
  
          }){
  
  return 'Hello my name is $name and i`m $age old and came from $country';
//화살표 함수 (fat arrow syntax)
}

num plus (num a, num b) => a + b;

void main() {
  print(plus(3,4));
  print(hi(
  age : 12,
  country : 'kor',
  name : 'Lee',
  ));
  
}
