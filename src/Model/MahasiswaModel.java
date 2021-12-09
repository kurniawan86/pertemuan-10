package Model;

import Helper.Koneksi;

import java.sql.*;
public class MahasiswaModel {
    private Connection conn = Koneksi.connection();
    private String sql;

    public ResultSet getMahasiswa() {
        Statement stmt = null;
        ResultSet rs = null;
        sql = "SELECT * FROM mahasiswa";
        try {
            stmt = conn.createStatement();
            if (stmt.execute(sql)) {
                rs = stmt.getResultSet();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public void insert(String nama, String npm , String no_hp){
        try{
            sql = "INSERT INTO mahasiswa (nama,npm,no_hp) values (?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,nama);
            preparedStatement.setString(2,npm);
            preparedStatement.setString(3,no_hp);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
