package dim;

public class ContactDAOFactory {
    public static ContactDAO getContactDAO(){
        return new ContactSimpleDAO();
    }
}
