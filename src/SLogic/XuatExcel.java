package SLogic;

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

    public static boolean dsHoaDon(ArrayList<HoaDon> dsHoaDon, File filename) {
        boolean rs = false;
        try {
            //khởi tạo 
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Danh Sách Hóa Đơn");
            XSSFRow row = null;
            //tạo tiêu đề
            row = sheet.createRow(0);
            row.createCell(0).setCellValue("Mã Hóa đơn");
            row.createCell(1).setCellValue("Mã khách hàng");
            row.createCell(2).setCellValue("Mã nhân viên");
            row.createCell(3).setCellValue("Mã Phòng");
            row.createCell(4).setCellValue("Giá phòng");
            row.createCell(5).setCellValue("Ngày thuê");
            row.createCell(6).setCellValue("Ngày trả");
            row.createCell(7).setCellValue("Thành tiền");
            row.createCell(8).setCellValue("Đã thanh toán");

            for (int i = 0; i < dsHoaDon.size(); i++) {
                HoaDon hd = dsHoaDon.get(i);
                row = sheet.createRow(1 + i);

                row.createCell(0).setCellValue(hd.getMahd());
                row.createCell(1).setCellValue(hd.getMahd());
                row.createCell(2).setCellValue(hd.getManv());
                row.createCell(3).setCellValue(hd.getMaphong());
                row.createCell(4).setCellValue(hd.getGiaphong());
                row.createCell(5).setCellValue(ConvertTime.changeToDMY(hd.getNgaythue()));
                row.createCell(6).setCellValue(ConvertTime.changeToDMY(hd.getNgaytra()));
                row.createCell(7).setCellValue(hd.getThanhtien());
                row.createCell(8).setCellValue(hd.getDathanhtoan());
            }

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
}
