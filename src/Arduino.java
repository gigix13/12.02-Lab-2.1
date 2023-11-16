public class Arduino extends ElectronicItem {
    private String version;

    public Arduino(int sC, String mo, String ma, String oS) {
        super(sC, mo, ma, oS);
    }

    public Arduino(String version) {
        this.version = version;
    }
}
