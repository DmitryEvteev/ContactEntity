package dim;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ContactSimpleDAO implements ContactDAO{
    private final List<Contact> contacts = new ArrayList<Contact>();

    @Override
    public Long addContact(Contact contact){
        Long id = generateContactID();
        contact.setContactID(id);
        contacts.add(contact);
        return id;
    }

    @Override
    public void updateContact(Contact contact){
        Contact oldContact = getContact(contact.getContactID());
        if(oldContact != null){
            oldContact.setFirstName(contact.getFirstName());
            oldContact.setLastName(contact.getLastName());
            oldContact.setEmail(contact.getEmail());
            oldContact.setPhone(contact.getPhone());
        }
    }

    @Override
    public void deleteContact(Long contactID) {
        for(Iterator<Contact> it = contacts.iterator(); it.hasNext();){
            Contact cnt = it.next();
            if(cnt.getContactID().equals(contactID)){
                it.remove();
            }
        }
    }

    @Override
    public Contact getContact(Long contactID) {
        for(Contact contact : contacts){
            if(contact.getContactID().equals(contactID)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public List<Contact> findContacts() {
        return contacts;
    }

    private Long generateContactID() {
        Long contactID = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while(getContact(contactID) != null) {
            contactID = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return contactID;
    }


}
