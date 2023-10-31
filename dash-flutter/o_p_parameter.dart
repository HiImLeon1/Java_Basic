String sayHello(String name, int age, [String? country = 'Kor'])=> 'Hello $age $name,from $country';

//optional positional parameter 

void main(){
  var results = sayHello('Lee',20,);
  print(results);
  
  
}
