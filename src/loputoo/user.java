package loputoo;

/**
 * Created by Marva on 16.11.2015.
 */
public class User {
    private String name=null;

    public User(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}
