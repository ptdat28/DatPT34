package main;

import java.io.Serializable;

public class diemthi implements Serializable{

	private static final long serialVersionUID = -7005062923467552992L;
	
	   private Integer IDnumber;
	   private Integer MaMonHoc;
	   private Integer Diemthi;


	   public diemthi() {
	       super();
}
public diemthi(Integer IDnumber, Integer MaMonHoc, Integer Diemthi) {
	super();
	this.IDnumber = IDnumber;
	this.MaMonHoc = MaMonHoc;
	this.Diemthi = Diemthi;

}
}
