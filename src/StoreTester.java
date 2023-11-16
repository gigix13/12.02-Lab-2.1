import org.junit.Assert;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StoreTester {

    @Test
    public void addBookTest(){
        Store store = new Store();
        Book book1 = new Book("A12345", "Standard", "Anna Dedman");
        store.addBook(book1);
        assertTrue(true);
    }

    @Test
    public void addBookAndPhoneTest(){
        Store store = new Store();
        Book book1 = new Book("A12345", "Standard", "Anna Dedman");
        store.addBook(book1);
        Phone phone1 = new Phone("5G", 13);
        store.addPhone(phone1);
        assertTrue(true);
        }

    @Test
    public void updateLocationAndGetAllTest(){
        Store store = new Store();
        Phone phone1 = new Phone("5G", 13);
        Phone phone2 = new Phone("4G", 12);
        Phone phone3 = new Phone("LTE", 12);
        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addPhone(phone3);
        store.updatePhonesLocation("Room 514");
        store.getAllPhones();
        assertEquals(phone1.getLocation(), "Room 514");
    }

    @Test
    public void getItems(){
        Store store = new Store();
        Phone phone1 = new Phone("5G", 13);
        store.addPhone(phone1);
        Book book1 = new Book("A12345", "Standard", "Anna Dedman");
        store.addBook(book1);
        Phone phone2 = new Phone("4G", 12);
        store.addPhone(phone2);
        Magazine magazine1 = new Magazine("Anna Dedman", "Nov 16 2023");
        store.addMagazine(magazine1);
        Phone phone3 = new Phone("LTE", 12);
        store.addPhone(phone3);
        assertEquals(store.getItems("phone").get(1), phone2);
        assertEquals(store.getItems("book").get(0), book1);
    }

    @Test
    public void updateItems(){
        Store store = new Store();
        Phone phone1 = new Phone("5G", 13);
        store.addPhone(phone1);
        Book book1 = new Book("A12345", "Standard", "Anna Dedman");
        store.addBook(book1);
        Phone phone2 = new Phone("4G", 12);
        store.addPhone(phone2);
        Magazine magazine1 = new Magazine("Anna Dedman", "Nov 16 2023");
        store.addMagazine(magazine1);
        Phone phone3 = new Phone("LTE", 12);
        store.addPhone(phone3);
        store.updateItems("phone", "location", "Room 513");
        assertEquals(phone1.getLocation(), "Room 513");
        store.updateItems("book", "location", "Room 523");
        assertEquals(book1.getLocation(), "Room 523");
    }
}
