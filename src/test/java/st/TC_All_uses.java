package st;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * BỘ TEST KIỂM THỬ DÒNG DỮ LIỆU ĐỘ PHỦ ALL-USES
 */
public class TC_All_uses extends MainTest {

    @Test
    public void TC_AU1() {
        assertEquals("P1: checkin=1, bill=2.50",
                "Hạng Đồng", main.Membership(1, 2.50));
    }

    @Test
    public void TC_AU2() {
        assertEquals("P2: checkin=0, bill=50.00",
                "Đầu vào không hợp lệ", main.Membership(0, 50.00));
    }

    @Test
    public void TC_AU3() {
        assertEquals("P3: checkin=1, bill=55.00",
                "Đầu vào không hợp lệ", main.Membership(1, 55.00));
    }

    @Test
    public void TC_AU4() {
        assertEquals("P4: checkin=1, bill=0.50",
                "Không xếp hạng", main.Membership(1, 0.50));
    }

    @Test
    public void TC_AU5() {
        assertEquals("P5: checkin=1, bill=12.00",
                "Hạng Vàng", main.Membership(1, 12.00));
    }

    @Test
    public void TC_AU6() {
        assertEquals("P6: checkin=4, bill=2.00",
                "Hạng Bạc", main.Membership(4, 2.00));
    }

}
