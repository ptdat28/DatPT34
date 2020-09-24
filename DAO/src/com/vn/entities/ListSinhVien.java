package com.vn.entities;

import java.io.Serializable;
import java.sql.Date;

public class ListSinhVien implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5472101275771815336L;
	
	private int IDnumber;
	private String TenSinhVien;
	private String GioiTinh;
	private Date NgaySinh;
	private String NguyenQuan;
	private int MaKhoa;
	public int getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(int iDnumber) {
		IDnumber = iDnumber;
	}
	public String getTenSinhVien() {
		return TenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		TenSinhVien = tenSinhVien;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getNguyenQuan() {
		return NguyenQuan;
	}
	public void setNguyenQuan(String nguyenQuan) {
		NguyenQuan = nguyenQuan;
	}
	public int getMaKhoa() {
		return MaKhoa;
	}
	public void setMaKhoa(int maKhoa) {
		MaKhoa = maKhoa;
	}
}
