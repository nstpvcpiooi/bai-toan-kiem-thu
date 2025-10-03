package st;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {

    private final Main main = new Main(); // Lớp Main chứa hàm Membership(int, double)

    // ===========================
    // 1) KIỂM THỬ GIÁ TRỊ BIÊN
    // ===========================
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

    // =================================
    // 2) KIỂM THỬ BẢNG QUYẾT ĐỊNH (R1–R14)
    // =================================
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

