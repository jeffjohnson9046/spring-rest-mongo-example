package hello;

import org.springframework.data.annotation.Id;

/**
 * Created by jjohnson on 6/7/16.
 */
public class Person {
    @Id
    private String Id;

    private String firstName;
    private String lastName;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
