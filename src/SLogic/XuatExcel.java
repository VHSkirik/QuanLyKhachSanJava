package SLogic;

import Model.DichVu;
import Model.HoaDon;
import Model.KhachHang;
import Model.Phong;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author @VHSkirik
 */
public class XuatExcel {

    public static boolean dsHoaDon(ArrayList<HoaDon> dsHoaDon, File filename, String ngaybatDau, String ngayKetThuc, String doanhthu) {
        boolean rs = false;
        try {
            //khởi tạo 
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Thống Kê Doanh Số");
            XSSFRow row = null;
            //tạo tiêu đề
            row = sheet.createRow(0);
            row.createCell(3).setCellValue("THỐNG KÊ DOANH Số");
            //tạo ngày tháng
            row = sheet.createRow(1);
            row.createCell(0).setCellValue("Từ ngày:");
            row.createCell(1).setCellValue(ngaybatDau);
            
            row = sheet.createRow(2);
            row.createCell(0).setCellValue("Đến ngày:");
            row.createCell(1).setCellValue(ngayKetThuc);
            //tạo tiêu đề
            row = sheet.createRow(3);
            row.createCell(0).setCellValue("Mã Hóa đơn");
            row.createCell(1).setCellValue("Mã khách hàng");
            row.createCell(2).setCellValue("Mã nhân viên");
            row.createCell(3).setCellValue("Mã Phòng");
            row.createCell(4).setCellValue("Giá phòng");
            row.createCell(5).setCellValue("Ngày thuê");
            row.createCell(6).setCellValue("Ngày trả");
            row.createCell(7).setCellValue("Thành tiền");

            for (int i = 0; i < dsHoaDon.size(); i++) {
                HoaDon hd = dsHoaDon.get(i);
                row = sheet.createRow(4 + i);

                row.createCell(0).setCellValue(hd.getMahd());
                row.createCell(1).setCellValue(hd.getMahd());
                row.createCell(2).setCellValue(hd.getManv());
                row.createCell(3).setCellValue(hd.getMaphong());
                row.createCell(4).setCellValue(hd.getGiaphong());
                row.createCell(5).setCellValue(ConvertTime.changeToDMY(hd.getNgaythue()));
                row.createCell(6).setCellValue(ConvertTime.changeToDMY(hd.getNgaytra()));
                row.createCell(7).setCellValue(hd.getThanhtien());
            }
            
            row = sheet.createRow(dsHoaDon.size() + 5);
            row.createCell(5).setCellValue("Tổng:");
            row.createCell(6).setCellValue(doanhthu + " VND");
            

            //ghi thông tin vào file
            try {
                FileOutputStream fos = new FileOutputStream(filename);
                workbook.write(fos);
                fos.close();
                rs = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static boolean dsKhacHang(ArrayList<KhachHang> dskhachhang, File filename) {
        boolean rs = false;
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Danh Sách Khách Hàng");
            XSSFRow row = null;
            row = sheet.createRow(0);

            row.createCell(0).setCellValue("Mã khách hàng");
            row.createCell(1).setCellValue("Tên khách hàng");
            row.createCell(2).setCellValue("Ngày sinh");
            row.createCell(3).setCellValue("CMT");
            row.createCell(4).setCellValue("Quốc tịch");
            row.createCell(5).setCellValue("Giới tính");
            row.createCell(6).setCellValue("SDT");

            for (int i = 0; i < dskhachhang.size(); i++) {
                KhachHang kh = dskhachhang.get(i);
                row = sheet.createRow(i + 1);

                row.createCell(0).setCellValue(kh.getMakh());
                row.createCell(1).setCellValue(kh.getTenkh());
                row.createCell(2).setCellValue(ConvertTime.changeToDMY(kh.getNgaysinhkh()));
                row.createCell(3).setCellValue(kh.getCmt());
                row.createCell(4).setCellValue(kh.getQuoctich());
                row.createCell(5).setCellValue(kh.getGioitinh());
                row.createCell(6).setCellValue(kh.getSodienthoai());
            }
            try {
                FileOutputStream fos = new FileOutputStream(filename);
                workbook.write(fos);
                fos.close();
                rs = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static boolean dsPhong(ArrayList<Phong> dsPhong, File filename) {
        boolean rs = false;
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Danh Sách Phòng");
            XSSFRow row = null;
            row = sheet.createRow(0);

            row.createCell(0).setCellValue("Mã phòng");
            row.createCell(1).setCellValue("Tên phòng");
            row.createCell(2).setCellValue("Mã loại phòng");
            row.createCell(3).setCellValue("Tình trạng");

            for (int i = 0; i < dsPhong.size(); i++) {
                Phong phong = dsPhong.get(i);
                row = sheet.createRow(i + 1);

                row.createCell(0).setCellValue(phong.getMaphong());
                row.createCell(1).setCellValue(phong.getTenphong());
                row.createCell(2).setCellValue(phong.getMaloaiphong());
                row.createCell(3).setCellValue(phong.getTinhtrang());
            }
            try {
                FileOutputStream fos = new FileOutputStream(filename);
                workbook.write(fos);
                fos.close();
                rs = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static boolean dsDichVu(ArrayList<DichVu> dsDichVu, File filename) {
        boolean rs = false;
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Danh Sách Dịch Vụ");
            XSSFRow row = null;
            row = sheet.createRow(1);

            row.createCell(0).setCellValue("Mã dịch vụ");
            row.createCell(1).setCellValue("Tên dịch vụ");
            row.createCell(2).setCellValue("giá");

            for (int i = 0; i < dsDichVu.size(); i++) {
                DichVu dv = dsDichVu.get(i);
                row = sheet.createRow(i + 2);

                row.createCell(0).setCellValue(dv.getMadichvu());
                row.createCell(1).setCellValue(dv.getTendichvu());
                row.createCell(2).setCellValue(dv.getGiadichvu());
            }
            try {
                FileOutputStream fos = new FileOutputStream(filename);
                workbook.write(fos);
                fos.close();
                rs = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
