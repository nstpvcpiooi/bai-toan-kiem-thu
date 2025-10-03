package st;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * BỘ TEST KIỂM THỬ BIÊN
 */
public class TC_Bien extends MainTest {

    @Test
    public void TC_B1() { // 1
        assertEquals("B1: checkin=1, bill=0",
                "Không xếp hạng", main.Membership(1, 0));
    }

    @Test
    public void TC_B2() { // 2
        assertEquals("B2: checkin=1, bill=1.00",
                "Hạng Đồng", main.Membership(1, 1.00));
    }

    @Test
    public void TC_B3() { // 3
        assertEquals("B3: checkin=1, bill=5.00",
                "Hạng Bạc", main.Membership(1, 5.00));
    }

    @Test
    public void TC_B4() { // 4
        assertEquals("B4: checkin=1, bill=10.00",
                "Hạng Vàng", main.Membership(1, 10.00));
    }

    @Test
    public void TC_B5() { // 5
        assertEquals("B5: checkin=1, bill=50.00",
                "Hạng Vàng", main.Membership(1, 50.00));
    }

    @Test
    public void TC_B6() { // 6
        assertEquals("B6: checkin=1, bill=3.00",
                "Hạng Đồng", main.Membership(1, 3.00));
    }

    @Test
    public void TC_B7() { // 7
        assertEquals("B7: checkin=3, bill=0",
                "Hạng Bạc", main.Membership(3, 0));
    }

    @Test
    public void TC_B8() { // 8
        assertEquals("B8: checkin=3, bill=1.00",
                "Hạng Bạc", main.Membership(3, 1.00));
    }

    @Test
    public void TC_B9() { // 9
        assertEquals("B9: checkin=3, bill=5.00",
                "Hạng Bạc", main.Membership(3, 5.00));
    }

    @Test
    public void TC_B10() { // 10
        assertEquals("B10: checkin=3, bill=10.00",
                "Hạng Bạc", main.Membership(3, 10.00));
    }

    @Test
    public void TC_B11() { // 11
        assertEquals("B11: checkin=3, bill=50.00",
                "Hạng Bạc", main.Membership(3, 50.00));
    }

    @Test
    public void TC_B12() { // 12
        assertEquals("B12: checkin=3, bill=3.00",
                "Hạng Bạc", main.Membership(3, 3.00));
    }

    @Test
    public void TC_B13() { // 13
        assertEquals("B13: checkin=7, bill=0",
                "Hạng Vàng", main.Membership(7, 0));
    }

    @Test
    public void TC_B14() { // 14
        assertEquals("B14: checkin=7, bill=1.00",
                "Hạng Vàng", main.Membership(7, 1.00));
    }

    @Test
    public void TC_B15() { // 15
        assertEquals("B15: checkin=7, bill=5.00",
                "Hạng Vàng", main.Membership(7, 5.00));
    }

    @Test
    public void TC_B16() { // 16
        assertEquals("B16: checkin=7, bill=10.00",
                "Hạng Vàng", main.Membership(7, 10.00));
    }

    @Test
    public void TC_B17() { // 17
        assertEquals("B17: checkin=7, bill=50.00",
                "Hạng Vàng", main.Membership(7, 50.00));
    }

    @Test
    public void TC_B18() { // 18
        assertEquals("B18: checkin=7, bill=3.00",
                "Hạng Vàng", main.Membership(7, 3.00));
    }

    @Test
    public void TC_B19() { // 19
        assertEquals("B19: checkin=2, bill=0",
                "Hạng Đồng", main.Membership(2, 0));
    }

    @Test
    public void TC_B20() { // 20
        assertEquals("B20: checkin=2, bill=1.00",
                "Hạng Đồng", main.Membership(2, 1.00));
    }

    @Test
    public void TC_B21() { // 21
        assertEquals("B21: checkin=2, bill=5.00",
                "Hạng Bạc", main.Membership(2, 5.00));
    }

    @Test
    public void TC_B22() { // 22
        assertEquals("B22: checkin=2, bill=10.00",
                "Hạng Vàng", main.Membership(2, 10.00));
    }

    @Test
    public void TC_B23() { // 23
        assertEquals("B23: checkin=2, bill=50.00",
                "Hạng Vàng", main.Membership(2, 50.00));
    }

    @Test
    public void TC_B24() { // 24
        assertEquals("B24: checkin=2, bill=3.00",
                "Hạng Đồng", main.Membership(2, 3.00));
    }
}
