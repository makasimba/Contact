// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Contact.contacts.add(new Contact("x@gmail.com", "123445", "x"));
        Contact.contacts.add(new Contact("y@gmail.com", "123445", "y"));
        Contact.contacts.add(new Contact("z@gmail.com", "123445", "z"));
        Contact.contacts.add(new Contact("a@gmail.com", "123445", "a"));
        Contact.contacts.add(new Contact("u@gmail.com", "123445", "u"));

        System.out.println("Welcome to Contact Manager.");
        System.out.println("You have " + Contact.contacts.size() + " contacts in your contact list.");
        System.out.println(Contact.getContact("x").getFirstName());

    }
}