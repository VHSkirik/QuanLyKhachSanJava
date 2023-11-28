package SLogic;

import Model.HoaDon;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
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
            XSSFSheet sheet = workbook.createSheet("Hóa Đơn");
            XSSFRow row = null;
            Cell cell[] = new Cell[9];
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
                row.createCell(5).setCellValue(hd.getNgaythue());
                row.createCell(6).setCellValue(hd.getNgaytra());
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
}
