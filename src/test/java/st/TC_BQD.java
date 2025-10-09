package st;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * BỘ TEST BẢNG QUYẾT ĐỊNH
 */
public class TC_BQD extends MainTest {

    @Test
    public void TC_BQD1() {
        assertEquals("BQD1: checkin=-1, bill=5.00",
                "Đầu vào không hợp lệ", main.Membership(-1, 5.00));
    }

    @Test
    public void TC_BQD2() {
        assertEquals("BQD2: checkin=2, bill=-2.00",
                "Đầu vào không hợp lệ", main.Membership(2, -2.00));
    }

    @Test
    public void TC_BQD3() {
        assertEquals("BQD3: checkin=1, bill=0.50",
                "Không xếp hạng", main.Membership(1, 0.50));
    }

    @Test
    public void TC_BQD4() {
        assertEquals("BQD4: checkin=2, bill=1.00",
                "Hạng Đồng", main.Membership(2, 1.00));
    }

    @Test
    public void TC_BQD5() {
        assertEquals("BQD5: checkin=2, bill=5.00",
                "Hạng Bạc", main.Membership(2, 5.00));
    }

    @Test
    public void TC_BQD6() {
        assertEquals("BQD6: checkin=2, bill=15.00",
                "Hạng Vàng", main.Membership(2, 15.00));
    }

    @Test
    public void TC_BQD7() {
        assertEquals("BQD7: checkin=3, bill=0.50",
                "Hạng Bạc", main.Membership(3, 0.50));
    }

    @Test
    public void TC_BQD8() {
        assertEquals("BQD8: checkin=3, bill=3.00",
                "Hạng Bạc", main.Membership(3, 3.00));
    }

    @Test
    public void TC_BQD9() {
        assertEquals("BQD9: checkin=3, bill=5.00",
                "Hạng Bạc", main.Membership(3, 5.00));
    }

    @Test
    public void TC_BQD10() {
        assertEquals("BQD10: checkin=3, bill=20.00",
                "Hạng Vàng", main.Membership(3, 20.00));
    }

    @Test
    public void TC_BQD11() {
        assertEquals("BQD11: checkin=7, bill=0.50",
                "Hạng Vàng", main.Membership(7, 0.50));
    }

    @Test
    public void TC_BQD12() {
        assertEquals("BQD12: checkin=7, bill=3.00",
                "Hạng Vàng", main.Membership(7, 3.00));
    }

    @Test
    public void TC_BQD13() {
        assertEquals("BQD13: checkin=7, bill=5.00",
                "Hạng Vàng", main.Membership(7, 5.00));
    }

    @Test
    public void TC_BQD14() {
        assertEquals("BQD14: checkin=7, bill=30.00",
                "Hạng Vàng", main.Membership(7, 30.00));
    }
}
