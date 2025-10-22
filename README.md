## Bài toán kiểm thử

Khuất Tuấn Anh - 22028248

### Giới thiệu bài toán
Một cửa hàng có chương trình khuyến mãi và tri ân khách hàng trong một tuần diễn ra sự kiện. Các ưu đãi dựa trên 4 thứ hạng là: hạng Vàng, hạng Bạc và hạng Đồng.
Tiêu chí nâng hạng cụ thể như sau:
* Hạng Đồng: Đây sẽ là thứ hạng cơ bản nhất mà mọi khách hàng đều được áp dụng từ lần đầu check-in tại cửa hàng và mua sắm ít nhất 1 triệu đồng. 
* Hạng Bạc: Check-in tại cửa hàng 3 ngày trong tuần hoặc mức chi tiêu đạt trên 5 triệu đồng. 
* Hạng Vàng: Check-in tại cửa hàng 7 ngày trong tuần hoặc mức chi tiêu đạt trên 10 triệu đồng.

### Đặc tả về bài toán kiểm thử
Hàm dùng để xét thứ hạng của khách hàng có hai đầu vào là: số lần check-in (là số nguyên không âm, miền hợp lệ từ 1 đến 7) và mức chi tiêu (đơn vị: triệu đồng) (là một số thập phân, lấy 2 chữ số sau dấu phẩy, miền hợp lệ từ 0 đến 50.00). Đầu ra của hàm này là hạng thành viên, thuộc một trong các giá trị sau: đầu vào không hợp lệ, không xếp hạng, hạng Vàng, hạng Bạc, và hạng Đồng.
Mối quan hệ giữa đầu vào và đầu ra như sau:
* Đầu vào không hợp lệ: khi số lần check-in hoặc mức chi tiêu không thuộc miền hợp lệ.
* Không xếp hạng nếu 0 ≤ mức chi tiêu < 1.00
* Hạng Đồng khi 1 ≤ số lần check-in < 3 và 1.00 ≤ mức chi tiêu < 5.00
* Hạng Bạc khi 3 ≤ số lần check-in < 7 hoặc 5.00 ≤ mức chi tiêu < 10.00
* Hạng Vàng: khi số lần chek-in = 7 hoặc 10 ≤ mức chi tiêu ≤ 50.00

Source code của hàm xếp hạng khách hàng:
* [Version 1](src/main/java/st/Version1.java)
* [Version 2](src/main/java/st/Version2.java)

Bộ Test
* [Kiểm thử giá trị biên](src/test/java/st/TC_Bien.java)
* [Kiểm thử bảng quyết định](src/test/java/st/TC_BQD.java)
* [Kiểm thử dòng điều khiển - version 1](src/test/java/st/TC_CFG_v1.java)
* [Kiểm thử dòng điều khiển - version 2](src/test/java/st/TC_CFG_v2.java)
* [Kiểm thử dòng dữ liệu - version 1](src/test/java/st/TC_All_uses_v1.java)
* [Kiểm thử dòng dữ liệu - version 2](src/test/java/st/TC_All_uses_v2.java)
