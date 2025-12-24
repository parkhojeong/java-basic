package construct;

public class MemberConstruct {
    String name;

    public MemberConstruct() {
        // Call to 'this()' must be first statement in constructor body
        this("default");
    }

    public MemberConstruct(String name) {
        this.name = name;
    }
}
