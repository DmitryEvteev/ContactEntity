package dim;

import java.util.List;

public interface ContactDAO {

    public Long addContact(Contact contact);
    public void updateContact(Contact contact);
    public void deleteContact(Long contactID);
    public Contact getContact(Long contactID);
    public List<Contact> findContacts();

}
