package main;

import java.io.Serializable;


public class monhoc implements Serializable{

	private static final long serialVersionUID = 309985032382357560L;
	   private Integer MaMonHoc;
	   private String TenMonHoc;
	   private Integer SoTinChi;


	   public monhoc() {
	       super();
}
public monhoc(Integer MaMonHoc, String TenMonHoc, Integer SoTinChi) {
	super();
	this.MaMonHoc = MaMonHoc;
	this.TenMonHoc = TenMonHoc;
	this.SoTinChi = SoTinChi;

}
}



