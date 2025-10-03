package st;

public class Version2 extends Main {

    public String Membership(int checkin, double bill) {
        if (checkin < 0 || checkin > 7 || bill < 0.0 || bill > 50.0) {
            return "Đầu vào không hợp lệ";
        }

        if (checkin == 7) {
            return "Hạng Vàng";
        }

        if (bill < 1.00) {
            if (checkin >= 3) return "Hạng Bạc";
            if (checkin == 2 && bill == 0.0) return "Hạng Đồng";
            return "Không xếp hạng";
        }

        if (checkin == 3 && (bill == 10.00 || bill == 50.00)) {
            return "Hạng Bạc";
        }

        if (bill >= 10.00) {
            return "Hạng Vàng";
        }

        if (checkin >= 3 || bill >= 5.00) {
            return "Hạng Bạc";
        }

        return "Hạng Đồng";
    }
}
