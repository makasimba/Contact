import java.util.ArrayList;
import java.util.List;

public class Contact {

    public String firstName;

    public String lastName;

    private String email;

    private String phoneNumber;

    public static List<Contact> contacts = new ArrayList<Contact>();

    public static Contact getContact(String firstName) {
        for ( Contact contact: contacts) {
            if (contact.getFirstName() == firstName) {
                return contact;
            }
        }
        return null;
    }

    public Contact(String email, String phoneNumber, String firstName) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
