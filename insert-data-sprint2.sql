insert into user (username, password) values
('huuthuc', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('baoanha', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('thanhtien', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('phuoctrung', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('tanhuan', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('dailoi', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('tantruong', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('phuongthao', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('hongnhung', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('vanty', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('thuytien', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('chidan', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('chitrung', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('haitruong', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('vanquyen', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('nguyenquyet', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('hungbui', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('huynhnam', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('tieutieu', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('ngocnhien', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('ngochuy', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('vanphuc', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('vanphu', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('trungthuyen', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('phamdat', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('admin', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC'),
('phuocdai', '$2a$10$pZNW3zOtmMXwvWeWmRZYxeSbhRKvZE20dxWKQIX2SGlOTXKCBGfJC');

insert into role (name) values
('ROLE_EMPLOYEE'),
('ROLE_CUSTOMER'),
('ROLE_ADMIN');

-- add user_role
INSERT INTO `user_role` (`username`, `role_id`,is_delete) VALUES ('admin', '1',0),
('admin', '2',0),
('admin', '3',0),
('haitruong', '2',0),
('haitruong', '3',0),
('vanphu', '3',0);

-- delete from candidate where username ='hungbui'; 
insert into  candidate(name, gender, id_card, date_of_birth, image, phone, email, adress, username) values 
('Bùi Hùng','Nữ', '111111111118', '1989-04-26', 'image','0389991835','hungbui@gmail.com','Quảng Nam', 'hungbui'),
('Huỳnh Văn Nam','Nữ', '111111111117', '1989-04-26', 'image','0389991835','huynhnam@gmail.com','Quảng Nam', 'huynhnam'),
('Lý Tiêu Tiêu','Nữ', '111111111116', '1989-04-26', 'image','0389991835','tieutieu@gmail.com','Quảng Nam', 'tieutieu'),
('Nguyễn Thị Ngọc Nhiên','Nữ', '111111111115', '1989-04-26', 'image','0389991835','ngocnhien@gmail.com','Quảng Nam', 'ngocnhien'),
('Đặng Ngọc Huy','Nam', '111111111115', '1992-04-26', 'image','0389991835','ngochuy@gmail.com','Quảng Nam', 'ngochuy'),
('Nguyễn Văn Phúc','Nam', '111111111114', '1992-04-26', 'image','0389991835','vanphuc@gmail.com','Quảng Nam', 'vanphuc'),
('Nguyễn Văn Phú','Nam', '111111111113', '1992-04-26', 'image','0389991835','vanphu@gmail.com','Quảng Nam', 'vanphu'),
('Huỳnh Trung Thuyên','Nam', '111111111112', '1994-04-26', 'image','0389991835','trungthuyen@gmail.com','Quảng Nam', 'trungthuyen'),
('Phan Phước Đại','Nam', '111111111111', '1990-04-26', 'image','0389991835','daiphanphuoc@gmail.com','Điện Phong - Điện Bàn - Quảng Nam', 'phuocdai'),
('Phạm Đạt','Nam', '222222222222', '1993-05-26', 'image','0389991835','datpham.qn@gmail.com','Bình Sơn - Quảng Ngãi', 'phamdat');


insert into employer(name ,phone ,email ,adress,name_company ,tax_code ,address_company,personnel_size,username, img) values
('Trương Thảo Trang','0123456789','haitruong@gmail.com','Quảng Nam','Công Ty TNHH Bảo Hiểm Nhân Thọ AIA (Việt Nam)','75365324434', 'Đà Nắng','200 người','hungbui','https://cdn1.vieclam24h.vn/images/employer_avatar/2022/12/16/images/167118058047.png?v=220513'),
('Trương Quang','0123456789','haitruong@gmail.com','Quảng Nam','Công Ty Cổ Phần Chứng Khoán Vps','75365324434', 'Đà Nắng','200 người','vanphu','https://cdn1.vieclam24h.vn/tvn/asset/home/img/employer/5ad6acbd271a8_1524018365.jpg?v=220513'),
('Trương Tấn Hải','0123456789','haitruong@gmail.com','Quảng Nam','Công Ty Cổ Phần Sữa TH','75365324434', 'Đà Nắng','200 người','haitruong','https://cdn1.vieclam24h.vn/images/employer_avatar/2022/12/13/images/167092231734.png?v=220513'),
('Nguyễn Thị Nhiên','0123456789','nhiennguyen@gmail.com','Quảng Nam','Công Ty TNHH Anh Vũ','75365333434', 'Đà Nắng','200 người','chitrung','https://cdn1.vieclam24h.vn/images/employer_avatar/2022/12/16/images/167115972857.jpeg?v=220513');

insert into experience(content) values
('Việc gấp'),
('Việc hot');

insert into recruitment(wage,career,title, experience_id ,level ,working_form ,probationary_period ,gender_request ,number_of_vacancies ,description ,request ,interest ,deadline ,employer_id) values
('7-20 Triệu','Bán hàng/Nhân viên kinh doanh/Tư vấn','Nhân Viên Hành Chính (Hỗ Trợ Kinh Doanh)',1,'Chuyên viên- nhân viên','Toàn thời gian cố định','2 tháng','Nam',2,'Chịu trách nhiệm quản lý hoạt động của đội xe Công ty.',
'- Nam, tuổi từ 30 trở lên
- Tốt nghiệp Trung cấp/cao đẳng/đại học chuyên ngành kỹ thuật xe ô tô, chế tạo máy các trường đào tạo nghề có liên quan (Giao thông vận tải, Bách khoa, Kỹ thuật Công nghệ...).','Được XÉT THƯỞNG HÀNG QUÝ và XÉT THƯỞNG THI ĐUA CUỐI NĂM
- Thu nhập: 15-25 triệu/ tháng.','2022-12-30',1),
('7-20 Triệu','Bán hàng/Nhân viên kinh doanh/Tư vấn','Nhân Viên Tư Vấn Dịch Vụ (Không Áp Doanh Số, Được Đào Tạo)',2,'Chuyên viên- nhân viên','Toàn thời gian cố định','2 tháng','Nam',21,' Gọi điện cho khách hàng theo data và kịch bản có sẵn, mời khách hàng tham gia các buổi hội thảo, sự kiện du lịch do công ty tổ chức (không chốt sales)',
'- Nam, nữ tuổi từ đủ 21 - 40
- Không yêu cầu bằng cấp, máy tính. Chỉ làm việc tại văn phòng.',
'Lương cơ bản cố định, không phụ thuộc KPI: 6.000.000 - 7.000.000 + Phụ cấp ăn trưa 25k/ngày + Thưởng KPI. 
 Trung bình thu nhập 15 triệu - 30 triệu (cao hơn theo năng lực).','2023-01-01',2);