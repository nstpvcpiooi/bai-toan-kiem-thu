package st;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * BỘ TEST BẢNG QUYẾT ĐỊNH
 */
public class TC_BQD extends MainTest {

    @Test
    public void TC_D1() {
        assertEquals("D1: checkin=-1, bill=5.00",
                "Đầu vào không hợp lệ", main.Membership(-1, 5.00));
    }

    @Test
    public void TC_D2() {
        assertEquals("D2: checkin=2, bill=-2.00",
                "Đầu vào không hợp lệ", main.Membership(2, -2.00));
    }

    @Test
    public void TC_D3() {
        assertEquals("D3: checkin=1, bill=0.50",
                "Không xếp hạng", main.Membership(1, 0.50));
    }

    @Test
    public void TC_D4() {
        assertEquals("D4: checkin=2, bill=1.00",
                "Hạng Đồng", main.Membership(2, 1.00));
    }

    @Test
    public void TC_D5() {
        assertEquals("D5: checkin=2, bill=5.00",
                "Hạng Bạc", main.Membership(2, 5.00));
    }

    @Test
    public void TC_D6() {
        assertEquals("D6: checkin=2, bill=15.00",
                "Hạng Vàng", main.Membership(2, 15.00));
    }

    @Test
    public void TC_D7() {
        assertEquals("D7: checkin=3, bill=0.50",
                "Hạng Bạc", main.Membership(3, 0.50));
    }

    @Test
    public void TC_D8() {
        assertEquals("D8: checkin=3, bill=3.00",
                "Hạng Bạc", main.Membership(3, 3.00));
    }

    @Test
    public void TC_D9() {
        assertEquals("D9: checkin=3, bill=5.00",
                "Hạng Bạc", main.Membership(3, 5.00));
    }

    @Test
    public void TC_D10() {
        assertEquals("D10: checkin=3, bill=20.00",
                "Hạng Vàng", main.Membership(3, 20.00));
    }

    @Test
    public void TC_D11() {
        assertEquals("D11: checkin=7, bill=0.50",
                "Hạng Vàng", main.Membership(7, 0.50));
    }

    @Test
    public void TC_D12() {
        assertEquals("D12: checkin=7, bill=3.00",
                "Hạng Vàng", main.Membership(7, 3.00));
    }

    @Test
    public void TC_D13() {
        assertEquals("D13: checkin=7, bill=5.00",
                "Hạng Vàng", main.Membership(7, 5.00));
    }

    @Test
    public void TC_D14() {
        assertEquals("D14: checkin=7, bill=30.00",
                "Hạng Vàng", main.Membership(7, 30.00));
    }
}
