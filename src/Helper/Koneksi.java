package Helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    public static Connection connection()
    {
        Connection conn = null;
        String driver = "org.gjt.mm.mysql.Driver";
        String url = "jdbc:mysql://localhost:3306/project_kelas_pakkur";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            System.out.println("Koneksi Gagal !");
            e.printStackTrace();
        }
        return conn;
    }
}
