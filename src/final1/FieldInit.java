package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; // convention
    final int value = 20; // duplicated in instance. change 'static'

    public FieldInit() {
        // this.value = 10; // X
    }
}
