import java.util.ArrayList;

public class Store {
    private ArrayList<CISItem> cisItems;


    public Store()
    {
        cisItems = new ArrayList<CISItem>();
    }

    public void addBook(Book book){
        cisItems.add(book);
    }
    public void addPhone(Phone phone){
        cisItems.add(phone);
    }
    public void addMagazine(Magazine magazine){
        cisItems.add(magazine);
    }
    public void addArduino(Arduino arduino){
        cisItems.add(arduino);
    }
    public void addReadingItem(ReadingItem readingItem){
        cisItems.add(readingItem);
    }
    public void addElectronicItem(ElectronicItem electronicItem){
        cisItems.add(electronicItem);
    }

    public void updatePhonesLocation(String location) {
        for (int i = 0; i < cisItems.size(); i++) {
            if (cisItems.get(i) instanceof Phone) {
                cisItems.get(i).setLocation(location);
            }
        }
    }

    public ArrayList<CISItem> getAllPhones(){
        ArrayList<CISItem> allPhones = new ArrayList<CISItem>();
        for(int i = 0; i < cisItems.size(); i++){
            if(cisItems.get(i) instanceof Phone){
                allPhones.add(cisItems.get(i));
            }
        }
        return allPhones;
    }

    public ArrayList<CISItem> getItems(String itemType){
        ArrayList<CISItem> allItemType = new ArrayList<CISItem>();
        for(int i = 0; i < cisItems.size(); i++){
            if(cisItems.get(i) instanceof Book && itemType.equalsIgnoreCase("book")){
                allItemType.add(cisItems.get(i));
            }
            if(cisItems.get(i) instanceof Phone && itemType.equalsIgnoreCase("phone")){
                allItemType.add(cisItems.get(i));
            }
            if(cisItems.get(i) instanceof Arduino && itemType.equalsIgnoreCase("arduino")){
                allItemType.add(cisItems.get(i));
            }
            if(cisItems.get(i) instanceof Magazine && itemType.equalsIgnoreCase("magazine")){
                allItemType.add(cisItems.get(i));
            }
            if(cisItems.get(i) instanceof ReadingItem && itemType.equalsIgnoreCase("reading item")){
                allItemType.add(cisItems.get(i));
            }
            if(cisItems.get(i) instanceof ElectronicItem && itemType.equalsIgnoreCase("electronic item")){
                allItemType.add(cisItems.get(i));
            }
        }
        return allItemType;
    }

    public void updateItems(String itemType, String property, String value) {
        ArrayList<CISItem> a = getItems(itemType);
        for (int i = 0; i < a.size(); i++) {
            a.get(i).setLocation(value);
        }
    }

    public void showAllInfo(){
        for(int i = 0; i < cisItems.size(); i++){
            System.out.println(cisItems.get(i).getLocation());
            System.out.println(cisItems.get(i).getPrice());
            System.out.println(cisItems.get(i).getDescription());
        }
    }

    public void addItems(CISItem cisItem){
        cisItems.add(cisItem);
    }
}
