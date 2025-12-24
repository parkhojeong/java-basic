package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        //public
        accessData.publicField = 1;
        accessData.publicMethod();

        //same package
        accessData.defaultField = 2;
        accessData.defaultMethod();

        //private disabled
        //accessData.privateField = 3;
        //accessData.privateMethod();

        accessData.innerAccess();
    }
}
