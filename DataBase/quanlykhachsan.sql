-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 25, 2023 lúc 01:35 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlykhachsan`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `mahd` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `madichvu` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `dongia` int(11) DEFAULT NULL,
  `soluong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`mahd`, `madichvu`, `dongia`, `soluong`) VALUES
('HD001', 'DV001', 20000, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dichvu`
--

CREATE TABLE `dichvu` (
  `madichvu` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tendichvu` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `giadichvu` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `dichvu`
--

INSERT INTO `dichvu` (`madichvu`, `tendichvu`, `giadichvu`) VALUES
('DV001', 'Dịch Vụ Dọn Dẹp', 20000),
('DV002', 'Dịch Vụ Đưa Đón', 50000),
('DV003', 'Dịch Vụ Giữ Trẻ', 50000),
('DV004', 'Dịch Vụ Massage', 150000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `mahd` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `makh` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `manv` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `maphong` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `giaphong` int(11) DEFAULT NULL,
  `ngaythue` date DEFAULT NULL,
  `ngaytra` date DEFAULT NULL,
  `thanhtien` int(11) DEFAULT NULL,
  `dathanhtoan` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`mahd`, `makh`, `manv`, `maphong`, `giaphong`, `ngaythue`, `ngaytra`, `thanhtien`, `dathanhtoan`) VALUES
('HD001', 'KH001', 'admin', 'P7002', 500000, '2023-11-24', '2023-11-27', 1520000, 1),
('HD003', 'KH005', 'admin', 'P6001', 100000, '2023-11-25', '2023-11-27', 200000, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `makh` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tenkh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaysinhkh` date DEFAULT NULL,
  `cmt` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `quoctich` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gioitinh` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sodienthoai` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`makh`, `tenkh`, `ngaysinhkh`, `cmt`, `quoctich`, `gioitinh`, `sodienthoai`) VALUES
('KH001', 'Bùi Thu Trang', '2003-03-12', '001202028744', 'Việt Nam', 'Nữ', '0325978999'),
('KH002', 'Nguyễn Trung Quốc', '1995-08-15', '002199502345', 'Việt Nam', 'Nam', '0123456789'),
('KH003', 'Trần Thị Hương', '1990-12-10', '003198012567', 'Việt Nam', 'Nữ', '0987654321'),
('KH004', 'Lê Văn Công', '1987-03-22', '004198703123', 'Việt Nam', 'Nam', '0369852147'),
('KH005', 'Phạm Thị Dậu', '2002-05-18', '005200005678', 'Việt Nam', 'Nữ', '0909090909'),
('KH006', 'Hoàng Văn Én', '1998-09-30', '006199809876', 'Việt Nam', 'Nam', '0888888888'),
('KH007', 'Peter Parker', '2004-11-25', '007198511234', 'Mĩ', 'Khác', '0777777777'),
('KH008', 'Đinh Văn Giang', '1992-07-08', '008199307890', 'Việt Nam', 'Nam', '0666666666'),
('KH009', 'Vũ Thị Hà', '1980-02-14', '009198002345', 'Việt Nam', 'Nữ', '0555555555'),
('KH010', 'Trịnh Văn Hải', '1996-06-05', '010199606789', 'Việt Nam', 'Nam', '0444444444'),
('KH011', 'Mai Thị Khúc', '1983-04-03', '011198304567', 'Việt Nam', 'Nữ', '0333333333'),
('KH012', 'Nguyễn Văn An', '1990-01-01', '212345678', 'Việt Nam', 'Nam', '0912345678'),
('KH013', 'Trần Thị Bích', '1991-02-02', '223456789', 'Việt Nam', 'Nữ', '0923456789'),
('KH014', 'Lê Văn Công', '1992-03-03', '234567890', 'Việt Nam', 'Nam', '0934567890'),
('KH015', 'Phạm Thị Dương', '1993-04-04', '245678901', 'Việt Nam', 'Nữ', '0945678901'),
('KH016', 'Võ Thành Em', '1994-05-05', '256789012', 'Việt Nam', 'Nam', '0956789012'),
('KH017', 'Bùi Thị Phùng', '1995-06-06', '267890123', 'Việt Nam', 'Nữ', '0967890123'),
('KH018', 'Đỗ Văn Giáp', '1996-07-07', '278901234', 'Việt Nam', 'Nam', '0978901234'),
('KH019', 'Hoàng Thị Hồng', '1997-08-08', '289012345', 'Việt Nam', 'Nữ', '0989012345'),
('KH020', 'Trần Thành Kiên', '1998-09-09', '290123456', 'Việt Nam', 'Nam', '0990123456'),
('KH021', 'Lê Thị Mậu', '1999-10-10', '301234567', 'Việt Nam', 'Nữ', '0910123457');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaiphong`
--

CREATE TABLE `loaiphong` (
  `maloaiphong` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tenloaiphong` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `giaphong` int(11) DEFAULT NULL,
  `mota` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaiphong`
--

INSERT INTO `loaiphong` (`maloaiphong`, `tenloaiphong`, `giaphong`, `mota`) VALUES
('LP001', 'Bình Dân', 100000, 'Phòng với tiện nghi cơ bản'),
('LP002', 'Sang', 250000, 'Phòng trang bị tiện nghi cao cấp'),
('LP003', 'VIP', 500000, 'Dành cho khách hàng cao cấp nhất'),
('LP004', 'Hội trường', 2000000, 'Phòng Hội Trường dành riêng cho dịp đặc biệt.');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `taikhoan` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `hotennv` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaysinhnv` date DEFAULT NULL,
  `gioitinhnv` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `matkhau` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `loainguoidung` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`taikhoan`, `hotennv`, `ngaysinhnv`, `gioitinhnv`, `matkhau`, `loainguoidung`) VALUES
('admin', 'Bùi Chí Hiếu', '2002-05-08', 'Nam', 'admin', 'admin'),
('bthanh', 'Bùi Thị Hồng', '2002-08-08', 'Khác', 'matkhau08', 'nhanvien'),
('dvgiau', 'Dinh Van G', '1992-07-07', 'Nam', 'matkhau07', 'nhanvien'),
('hoangvane', 'Hoang Van E', '1988-05-05', 'Nam', 'matkhau05', 'nhanvien'),
('lvcong', 'Le Van C', '1984-03-03', 'Nam', 'matkhau03', 'nhanvien'),
('mtluyen', 'Mai Thi J', '1998-10-10', 'Nữ', 'matkhau10', 'nhanvien'),
('nhanvien', 'Bùi Minh Ngọc', '2006-03-26', 'Nam', 'nhanvien', 'nhanvien'),
('nvaach', 'Nguyễn Văn Ách', '1980-01-01', 'Nam', 'matkhau01', 'nhanvien'),
('ptdau', 'Pham Thi D', '1986-04-04', 'Nữ', 'matkhau04', 'nhanvien'),
('ttbic', 'Tran Thi B', '1982-02-02', 'Nữ', 'matkhau02', 'nhanvien'),
('tving', 'Trinh Van I', '1996-09-09', 'Nam', 'matkhau09', 'nhanvien'),
('vuthif', 'Vu Thi F', '1990-06-06', 'Nữ', 'matkhau06', 'nhanvien');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phong`
--

CREATE TABLE `phong` (
  `maphong` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tenphong` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `maloaiphong` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tinhtrang` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phong`
--

INSERT INTO `phong` (`maphong`, `tenphong`, `maloaiphong`, `tinhtrang`) VALUES
('P10001', 'Tầng 10 Phòng 1001', 'LP002', 1),
('P10002', 'Tầng 10 Phòng 1002', 'LP002', 0),
('P1001', 'Tầng 1 Phòng 101', 'LP001', 1),
('P1002', 'Tầng 1 Phòng 102', 'LP001', 1),
('P2001', 'Tầng 2 Phòng 201', 'LP002', 0),
('P2002', 'Tầng 2 Phòng 202', 'LP002', 1),
('P2003', 'Tầng 2 Phòng 203', 'LP002', 0),
('P2004', 'Tầng 2 Phòng 204', 'LP002', 1),
('P3001', 'Tầng 3 Phòng 301', 'LP003', 0),
('P3002', 'Tầng 3 Phòng 302', 'LP003', 1),
('P4001', 'Tầng 4 Phòng 401', 'LP004', 0),
('P4002', 'Tầng 4 Phòng 402', 'LP004', 1),
('P5001', 'Tầng 5 Hội Trường 1', 'LP004', 1),
('P5002', 'Tầng 5 Hội Trường 2', 'LP004', 1),
('P6001', 'Tầng 6 Phòng 601', 'LP001', 1),
('P6002', 'Tầng 6 Phòng 602', 'LP001', 1),
('P6003', 'Tầng 6 Phòng 603', 'LP002', 0),
('P6004', 'Tầng 6 Phòng 604', 'LP002', 1),
('P7001', 'Tầng 7 Phòng 701', 'LP003', 1),
('P7002', 'Tầng 7 Phòng 702', 'LP003', 0),
('P8001', 'Tầng 8 Phòng 801', 'LP004', 1),
('P8002', 'Tầng 8 Phòng 802', 'LP004', 0),
('P9001', 'Tầng 9 Phòng 901', 'LP001', 1),
('P9002', 'Tầng 9 Phòng 902', 'LP001', 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`mahd`,`madichvu`),
  ADD KEY `FK_madichvu` (`madichvu`);

--
-- Chỉ mục cho bảng `dichvu`
--
ALTER TABLE `dichvu`
  ADD PRIMARY KEY (`madichvu`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`mahd`),
  ADD KEY `FK_makh` (`makh`),
  ADD KEY `FK_manv` (`manv`),
  ADD KEY `FK_maphong` (`maphong`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`makh`);

--
-- Chỉ mục cho bảng `loaiphong`
--
ALTER TABLE `loaiphong`
  ADD PRIMARY KEY (`maloaiphong`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`taikhoan`);

--
-- Chỉ mục cho bảng `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`maphong`),
  ADD KEY `FK_maloaiphong` (`maloaiphong`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `FK_madichvu` FOREIGN KEY (`madichvu`) REFERENCES `dichvu` (`madichvu`),
  ADD CONSTRAINT `FK_mahd` FOREIGN KEY (`mahd`) REFERENCES `hoadon` (`mahd`);

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `FK_makh` FOREIGN KEY (`makh`) REFERENCES `khachhang` (`makh`),
  ADD CONSTRAINT `FK_manv` FOREIGN KEY (`manv`) REFERENCES `nhanvien` (`taikhoan`),
  ADD CONSTRAINT `FK_maphong` FOREIGN KEY (`maphong`) REFERENCES `phong` (`maphong`);

--
-- Các ràng buộc cho bảng `phong`
--
ALTER TABLE `phong`
  ADD CONSTRAINT `FK_maloaiphong` FOREIGN KEY (`maloaiphong`) REFERENCES `loaiphong` (`maloaiphong`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
