class Player {
  final String name;
  int xp = 1500;

  Player(this.name,this.xp) {

  }

  void sayHello() {
    print('Hi my name is $name $xp');
  }
}
void main(){
var player = Player('lee',1500);
player.sayHello();
var player2 = Player('leae', 2500);
player2.sayHello();


}