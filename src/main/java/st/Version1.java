package st;

public class Version1 extends Main {
    public String Membership(int checkin, double bill) {
        if (checkin > 0 && checkin <= 7) {
            if (bill >= 1.00 && bill < 5.00 && checkin >= 1 && checkin < 3) {
                return "Hạng Đồng";
            }
            if ((checkin >= 3 && checkin < 7) || (bill >= 5.00 && bill < 10.00)) {
                return "Hạng Bạc";
            }
            if ((checkin == 7) || (bill >= 10.00 && bill <= 50.00)) {
                return "Hạng Vàng";
            }
            if (bill >= 0 && bill < 1.00) return "Không xếp hạng";
        }
        return "Đầu vào không hợp lệ";
    }

}