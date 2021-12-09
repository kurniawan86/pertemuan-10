package Controller;

import Model.MahasiswaModel;

import java.sql.ResultSet;

public class MahasiswaController {
    private MahasiswaModel mahasiswaModel = new MahasiswaModel();

    public ResultSet getMahasiswa(){
        return mahasiswaModel.getMahasiswa();
    }

    public void insert(String nama, String npm , String no_hp){
        mahasiswaModel.insert(nama,npm,no_hp);
    }

}
