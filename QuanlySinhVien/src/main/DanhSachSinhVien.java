package main;

import java.io.Serializable;
import java.sql.Date;

public class DanhSachSinhVien implements Serializable {


	private static final long serialVersionUID = 3286512445449042314L;
	   private Integer IDnumber;
	   private String TenSinhVien;
	   private String GioiTinh;
	   private Date NgaySinh;
	   private String NguyenQuan;
	   private Integer MaKhoa;

	   public DanhSachSinhVien() {
	       super();
}
public DanhSachSinhVien(Integer IDnumber, String TenSinhVien, String GioiTinh, Date NgaySinh, String NguyenQuan, Integer MaKhoa) {
	super();
	this.IDnumber = IDnumber;
	this.TenSinhVien = TenSinhVien;
	this.GioiTinh = GioiTinh;
	this.NgaySinh = NgaySinh;
	this.NguyenQuan = NguyenQuan;
	this.MaKhoa = MaKhoa;
}
}

