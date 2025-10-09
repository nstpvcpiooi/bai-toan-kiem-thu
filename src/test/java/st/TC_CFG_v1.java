package st;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * BỘ TEST DÒNG ĐIỀU KHIỂN - ĐỘ ĐO C2
 */
public class TC_CFG_v1 extends MainTest{

    @Test
    public void TC_CFG1() {
        assertEquals(
                "CFG1: checkin=1, bill=2.00. Path: (1) → (2) → (3) → (8) → EXIT",
                "Hạng Đồng",
                main.Membership(1, 2.00)
        );
    }

    @Test
    public void TC_CFG2() {
        assertEquals(
                "CFG2: checkin=4, bill=6.00. Path: (1) → (2) → (3) → (4) → (9) → EXIT",
                "Hạng Bạc",
                main.Membership(4, 6.00)
        );
    }

    @Test
    public void TC_CFG3() {
        assertEquals(
                "CFG3: checkin=7, bill=20.00. Path: (1) → (2) → (3) → (4) → (5) → (10) → EXIT",
                "Hạng Vàng",
                main.Membership(7, 20.00)
        );
    }

    @Test
    public void TC_CFG4() {
        assertEquals(
                "CFG4: checkin=2, bill=0.50. Path: (1) → (2) → (3) → (4) → (5) → (6) → (11) → EXIT",
                "Không xếp hạng",
                main.Membership(2, 0.50)
        );
    }

    @Test
    public void TC_CFG5() {
        assertEquals(
                "CFG5: checkin=0, bill=12.00. Path: (1) → (2) → (7) → EXIT",
                "Hạng Vàng",
                main.Membership(0, 12.00)
        );
    }

    @Test
    public void TC_CFG6() {
        assertEquals(
                "CFG6: checkin=2, bill=60.00. Path: (1) → (2) → (3) → (4) → (5) → (6) → (7) → EXIT",
                "Đầu vào không hợp lệ",
                main.Membership(2, 60.00)
        );
    }
}
