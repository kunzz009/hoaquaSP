create database quan_ly_hoa_qua
use quan_ly_hoa_qua;

create table tblUser(
	IdUser int identity primary key,
    Username varchar(50) not null,
    Pass varchar(50) not null,
    Email varchar(100) not null,
    Phone varchar(20),
    Address varchar(500) not null,
    RoleType varchar(10)
);

select * from tblUser

create table tblNSX(
	IdNSX int identity primary key,
    TenNSX varchar(100) not null
	
);


create table tblSanPham
(
	IdSP int identity primary key,
    TenSP varchar(200) not null,
    Gia int not null,
    IdNSX int FOREIGN KEY REFERENCES tblNSX(IdNSX),
    LoaiSP varchar(100),
	
	  
);

Alter table tblSanPham add DonVi varchar(20);
Alter table tblSanPham add anh nvarchar(500);
Alter table tblSanPham add mota nvarchar(500);
Alter table tblSanPham add soLuong int;

select * from tblSanPham

create table tblDonHang(
	IdDonHang int identity primary key, 
    IdUser int FOREIGN KEY REFERENCES tblUser(IdUser),
    NgayDat datetime not null,
    Phone varchar(20),
    TongTien int, 
    TrangThai varchar(20),

);

create table tblChiTiet(
	IdDonHang int FOREIGN KEY REFERENCES tblDonHang(IdDonHang),
    IdSP int FOREIGN KEY REFERENCES tblSanPham(IdSP),
    SoLuong int,
    Gia int,
    
);

insert into tblUser(Username, Pass, Email, Phone, Address, RoleType) values 
('admin', '1', 'admin@123', '123456', 'Ha noi', 'admin'),
('khach', '2', 'khach@123', '654321', 'Ha noi', 'customer');

select * from tblUser

insert into tblNSX (TenNSX) values 
('Truong An'), 
('Vinmart'), 
('Kinh Do'), 
('Viet Fruit'), 
('Nong san Viet');

insert into tblSanPham(TenSP, Gia, IdNSX, LoaiSP, DonVi, anh, mota, soLuong ) values 
('Cam', 10000, 1, 'Qua tuoi', 'kg','image/cam.jpg','tươi mới',1),
('duahau', 15000, 2, 'Qua tuoi', 'kg','image/duahau.jpg','rất đẹp ',2),
('mit', 30000, 2, 'Qua tuoi', 'kg','image/mit.jpg','hàng chất lượng',4),
('nho', 100000, 3, 'Qua tuoi', 'kg','image/nho.jpg','hàng mới về ',8),
('xoai', 20000, 5, 'Qua tuoi', 'kg','image/xoai.jpg','rất rất ngon ',10);

delete tblSanPham

select* from tblNSX
