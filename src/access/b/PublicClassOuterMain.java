package access.b;

//import access.a.DefaultClass1; // X
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
//        DefaultClass1 defaultClass1 = new DefaultClass1(); // X
    }
}
