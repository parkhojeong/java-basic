package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        //public
        accessData.publicField = 1;
        accessData.publicMethod();

        //another package disabled
        //accessData.defaultField = 2;
        //accessData.defaultMethod();

        //private disabled
        //accessData.privateField = 3;
        //accessData.privateMethod();

        accessData.innerAccess();
    }
}
