
public class property {
	private String PropertyName;
	private double S,E,D;
	
	public property(String t,double s, double e){
    	PropertyName=t;
    	S=s;
    	E=e;
    	D=e-s;
    }
	public String Name(){
    	return(PropertyName);
    }
	public double Duration(){
    	return(D);
    }
}
