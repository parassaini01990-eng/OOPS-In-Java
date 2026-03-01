class SolarSystem{

}
class Earth extends SolarSystem{

}
class Mars extends SolarSystem{

}
class Moon extends Earth{

}

public class P16 {
 public static void main(String[] args) {
    SolarSystem s=new SolarSystem();
    Earth e=new Earth();
    Mars m=new Mars();
    Moon mo=new Moon();
    
    System.out.println(e);
    System.out.println(m);
    System.out.println(mo);

 }   
}
