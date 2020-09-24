package com.vn.DAOTEST;

import java.util.List;
import com.vn.entities.ListSinhVien;


public interface ListSinhVienDao {
	   ListSinhVien creat(ListSinhVien NguyenQuan);
       List<ListSinhVien> getAll();
       ListSinhVien update(ListSinhVien NguyenQuan);
       String delete(String IDnumber);
       
}
