class Father{
    String bikeName;
   Father(String name) {
    this.bikeName=name;
   }
void bike(){
    System.out.println("rajdoot bike ride");
}
}
class Child extends Father{
    String customizecolor;
    Child(String name,String color){
super(name);
this.customizecolor=color;

    }
    @Override
void bike(){
    System.out.println(" customize rajdoot bike ride");

}
}
public class P18 {
 public static void main(String[] args) {
    Father f=new Child("paras","blue");
    f.bike();
 }   
}
