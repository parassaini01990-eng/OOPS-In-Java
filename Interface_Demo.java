interface functionInreface1{
void abstractMethod();//by default public +abstract
}

public class Interface_Demo{
    public static void main(String[] args) {
        functionInreface1 refId=()->System.out.println("i am from lambda expession");
           refId .abstractMethod();
        }
    }
