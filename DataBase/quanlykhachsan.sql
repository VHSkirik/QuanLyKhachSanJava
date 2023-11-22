-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 22, 2023 lúc 06:38 AM
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
  `ngaythue` datetime DEFAULT NULL,
  `ngaytra` datetime DEFAULT NULL,
  `thanhtien` int(11) DEFAULT NULL,
  `dathanhtoan` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`mahd`, `makh`, `manv`, `maphong`, `giaphong`, `ngaythue`, `ngaytra`, `thanhtien`, `dathanhtoan`) VALUES
('HD001', 'KH001', 'nhanvien', 'P2001', 250000, '2023-11-13 12:00:00', NULL, NULL, 0);

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
('KH005', 'Phạm Thị Dậu', '2000-05-18', '005200005678', 'Việt Nam', 'Nữ', '0909090909'),
('KH006', 'Hoàng Văn Én', '1998-09-30', '006199809876', 'Việt Nam', 'Nam', '0888888888'),
('KH007', 'Peter Parker', '2004-11-25', '007198511234', 'Mĩ', 'Nam', '0777777777'),
('KH008', 'Đinh Văn Giang', '1993-07-08', '008199307890', 'Việt Nam', 'Nam', '0666666666'),
('KH009', 'Vũ Thị Hà', '1980-02-14', '009198002345', 'Việt Nam', 'Nữ', '0555555555'),
('KH010', 'Trịnh Văn Hải', '1996-06-05', '010199606789', 'Việt Nam', 'Nam', '0444444444'),
('KH011', 'Mai Thị Khúc', '1983-04-03', '011198304567', 'Việt Nam', 'Nữ', '0333333333');

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
('LP001', 'Bình Dân', 100000, 'Phòng với tiện nghi cơ bản, phục vụ nhóm nhỏ hoặc du khách có ngân sách hạn chế.'),
('LP002', 'Sang', 250000, 'Phòng trang bị tiện nghi cao cấp, không gian thoải mái, dành cho khách muốn trải nghiệm thoải mái và tiện lợi.'),
('LP003', 'VIP', 500000, 'Dành cho khách hàng cao cấp nhất, phòng lớn, nội thất sang trọng, dịch vụ cá nhân, tạo trải nghiệm độc đáo và sang trọng.'),
('LP004', 'Hội trường', 2000000, 'Phòng Hội Trường dành riêng cho dịp đặc biệt. với 200 chỗ ngồi và điều hòa đầy đủ.');

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
('nhanvien', 'Bùi Minh Ngọc', '2006-03-26', 'Nam', 'nhanvien', 'nhanvien');

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
('P1001', 'Tầng 1 Phòng 101', 'LP001', 1),
('P2001', 'Tầng 2 Phòng 201', 'LP002', 0),
('P2002', 'Tầng 2 Phòng 202', 'LP002', 1),
('P5001', 'Tầng 5 Hội Trường 1', 'LP004', 1);

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
