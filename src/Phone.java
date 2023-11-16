public class Phone extends ElectronicItem {
    private String networkType;
    private int screenSize;

    public Phone(int sC, String mo, String ma, String oS) {
        super(sC, mo, ma, oS);
    }

    public Phone (String networkType, int screenSize)
    {
        super();
        this.networkType = networkType;
        this.screenSize = screenSize;
    }
}
