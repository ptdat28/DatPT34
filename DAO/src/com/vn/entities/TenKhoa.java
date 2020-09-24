package com.vn.entities;

import java.io.Serializable;

public class TenKhoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5013609544843052548L;

	
	private int MaKhoa;
	private String TenKhoa;
	public int getMaKhoa() {
		return MaKhoa;
	}
	public void setMaKhoa(int maKhoa) {
		MaKhoa = maKhoa;
	}
	public String getTenKhoa() {
		return TenKhoa;
	}
	public void setTenKhoa(String tenKhoa) {
		TenKhoa = tenKhoa;
	}
}
