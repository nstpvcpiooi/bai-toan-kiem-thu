package st;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * BỘ TEST DÒNG ĐIỀU KHIỂN - ĐỘ ĐO C2
 */
public class TC_CFG_v2 extends MainTest{

    @Test
    public void TC_CFG1() {
        assertEquals(
                "CFG1: checkin=2, bill=60.00. Path: (1) → (2) → (11) → EXIT",
                "Đầu vào không hợp lệ",
                main.Membership(2, 60.00)
        );
    }

    @Test
    public void TC_CFG2() {
        assertEquals(
                "CFG2: checkin=7, bill=0.50. Path: (1) → (2) → (3) → (12) → EXIT",
                "Hạng Vàng",
                main.Membership(7, 0.50)
        );
    }

    @Test
    public void TC_CFG3() {
        assertEquals(
                "CFG3: checkin=3, bill=0.50. Path: (1) → (2) → (3) → (4) → (9) → (13) → EXIT",
                "Hạng Bạc",
                main.Membership(3, 0.50)
        );
    }

    @Test
    public void TC_CFG4() {
        assertEquals(
                "CFG4: checkin=2, bill=0.00. Path: (1) → (2) → (3) → (4) → (9) → (10) → (8) → EXIT",
                "Hạng Đồng",
                main.Membership(2, 0.00)
        );
    }

    @Test
    public void TC_CFG5() {
        assertEquals(
                "CFG5: checkin=1, bill=0.50. Path: (1) → (2) → (3) → (4) → (9) → (10) → (14) → EXIT",
                "Không xếp hạng",
                main.Membership(1, 0.50)
        );
    }

    @Test
    public void TC_CFG6() {
        assertEquals(
                "CFG6: checkin=3, bill=10.00. Path: (1) → (2) → (3) → (4) F → (5) T → (13) → EXIT",
                "Hạng Bạc",
                main.Membership(3, 10.00)
        );
    }

    @Test
    public void TC_CFG7() {
        assertEquals(
                "CFG7: checkin=1, bill=10.00. Path: (1) → (2) → (3) F → (4) F → (5) F → (6) T → (12) → EXIT",
                "Hạng Vàng",
                main.Membership(1, 10.00)
        );
    }

    @Test
    public void TC_CFG8() {
        assertEquals(
                "CFG8: checkin=1, bill=6.00. Path: (1) → (2) → (3) F → (4) F → (5) F → (6) F → (7) T → (13) → EXIT",
                "Hạng Bạc",
                main.Membership(1, 6.00)
        );
    }

    @Test
    public void TC_CFG9() {
        assertEquals(
                "CFG9: checkin=2, bill=2.00. Path: (1) → (2) → (3) F → (4) F → (5) F → (6) F → (7) F → (8) → EXIT",
                "Hạng Đồng",
                main.Membership(2, 2.00)
        );
    }
}
