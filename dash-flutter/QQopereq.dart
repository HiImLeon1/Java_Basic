void main(){
  String? name;
  name ??='Unknown';
  print (name);
  
  name = null;
  name ??='Unknown2';
  print(name);
}
