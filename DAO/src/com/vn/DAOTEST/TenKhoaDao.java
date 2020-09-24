package com.vn.DAOTEST;

import java.util.List;

import com.vn.entities.TenKhoa;


public interface TenKhoaDao {

	String delete(String MaKhoa) ;
	List<TenKhoa> getAll();
	TenKhoa findById(String MaKhoa);

}
