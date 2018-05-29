/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.Hashtable;
import java.sql.Connection;
import java.sql.DriverManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author HaiTruong
 */
public class BUS_Report {
    public static void ReportBanHang(){//String MaHD, String TenCH, String TenKH,String DiaChiKH, String SoHD, String TaiKhoan, String MaSoThueKH,
            // String LyDo, Date NgayThanhToan, String SoSeri, float ThueSuat, String TongTien, String TienThue, String TongTong, String TienRaChu){
        
        String link ="D:\\GitHub\\HangHoa\\src\\Report\\report2.jrxml";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String database = "jdbc:sqlserver://localhost:1433;database=";
            String us = "sa";
            String pa = "123";
            
            //Hashtable hash = new Hashtable();
//                hash.put("MaHD", MaHD);
//                hash.put("TenCH", TenCH);
//                hash.put("TenKH", TenKH);
//                hash.put("DiaChiKH", DiaChiKH);
//                hash.put("SoHD", SoHD);
//                hash.put("TaiKhoan", TaiKhoan);
//                hash.put("MaSoThueKH", MaSoThueKH);
//                hash.put("LyDo", LyDo);
//                hash.put("NgayThanhToan", NgayThanhToan);
//                hash.put("SoSeri", SoSeri);
//                hash.put("ThueSuat", ThueSuat);
//                hash.put("TongTien", TongTien);
//                hash.put("TienThue", TienThue);
//                hash.put("TongTong", TongTong);
//                hash.put("TienRaChu", TienRaChu);
                
            Connection con = DriverManager.getConnection(database, us, pa);

            JasperReport jr = JasperCompileManager.compileReport(link);
            //tao Jasper Print
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            //tao Jasper View   
            JasperViewer.viewReport(jp,false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
