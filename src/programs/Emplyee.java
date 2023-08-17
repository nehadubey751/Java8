package programs;

public class Emplyee {
	private int eid;
	private String ename;
	
	@Override
	public String toString() {
		return " [eid=" + eid + ", ename=" + ename + "," + eaddress + "]";
	}
	public Emplyee(int eid, String ename,Address eaddress) {
		
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	private Address eaddress;

	public Address getEaddress() {
		return eaddress;
	}
	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}

}
