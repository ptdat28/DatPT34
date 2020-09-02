package main;

import java.io.Serializable;
import lombok.Data;

public class MaKhoa implements Serializable {
	private static final long serialVersionUID = -4295826540480964215L;

	
	private Integer MaKhoa;
	private String TenKhoa;

	public MaKhoa() {
		super();
}
	public MaKhoa(Integer MaKhoa, String TenKhoa) {
		super();
		this.MaKhoa = MaKhoa;
		this.TenKhoa = TenKhoa;
	}
}
