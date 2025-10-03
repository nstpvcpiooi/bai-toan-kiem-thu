package st;

public abstract class Main {
    public abstract String Membership(int checkin, double bill);

    public static Main getVersion(int version) {
        if (version == 1) {
            return new Version1();
        } else if (version == 2) {
            return new Version2();
        } else {
            throw new IllegalArgumentException("Phiên bản không hợp lệ");
        }
    }
}
