package dim;

public class Contact {

    private Long contactID;
    private String firstName;
    private String lastName;
    private String eMail;
    private String phone;

    public Contact(){}

    public Contact(Long contactID, String firstName, String lastName, String eMail, String phone){
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phone = phone;
    }

    public Contact(String firstName, String lastName, String eMail, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phone = phone;
    }

    public void setContactID(Long contactID) {
        this.contactID = contactID;
    }
    public Long getContactID() {
        return contactID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String geteMail() {
        return eMail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    @Override
    public String toString(){
        return "Contact: { "
    }
}
