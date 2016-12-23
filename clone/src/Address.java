
public class Address implements Cloneable{
	int id ;
	int lineNO;
	String city;
	 
	
	
	public Address(int id, int lineNO, String city) {
		super();
		this.id = id;
		this.lineNO = lineNO;
		this.city = city;
	}



	@Override
	public String toString() {
		return "Address [id=" + id + ", lineNO=" + lineNO + ", city=" + city + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getLineNO() {
		return lineNO;
	}



	public void setLineNO(int lineNO) {
		this.lineNO = lineNO;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}
	
}
