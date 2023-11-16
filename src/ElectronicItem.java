public class ElectronicItem extends CISItem
{
    private int storeCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public ElectronicItem(int sC, String mo, String ma, String oS)
    {
        storeCapacity = sC;
        model = mo;
        maker = ma;
        operatingSystem = oS;
    }

    public ElectronicItem() {

    }
}
