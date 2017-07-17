
public class VM {

	private int timestamps;
	private int VMID;
	private String VMName;
	private int noProperty;
 	private int ClusterID[];
	private int HostID[];
	private double Util1[];
	private double Util2[];
	private double Util3[];
	private property p[];
	private double allocation1[];
	private double allocation2[];
	private double allocation3[];
	private String powerState[];
	private double allocPrice;
	private double clusterPrice;
	
	public VM(int t) {
		timestamps = t/50+1;
	 	ClusterID= new int[timestamps];
		HostID= new int[timestamps];
		noProperty=0;
		allocPrice=0;
		clusterPrice=0;
		p=new property[4];
		Util1 = new double[timestamps];
		Util2 = new double[timestamps];
		Util3 = new double[timestamps];
		allocation1 = new double[timestamps];
		allocation2 = new double[timestamps];
		allocation3 = new double[timestamps];
		powerState = new String[timestamps];
		for(int i=0;i<=10;++i) {
		 	ClusterID[i]=0;
			HostID[i]=0;
			Util1[i]=0;
			Util2[i]=0;
			Util3[i]=0;
			allocation1[i]=0;
			allocation2[i]=0;
			allocation3[i]=0;
			powerState[i]="off";
		}
	}
	public void StoreVMID(int t) {
		VMID = t;
	}
	public void StoreVMName(String t) {
		VMName = t;
	}
	public void StoreHostID(double t,double s,double e) {
		for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
			HostID[i]=(int)t;
		}
	}
	public void StoreClusterID(double t,double u,double s, double e) {
		for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
			if(HostID[i]==(int)t)
				ClusterID[i]=(int)u;
		}
	}
	public void StorePower(String t,double s, double e) {
		for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
			powerState[i]=t;
		}
	}
	public void StoreUtil(String a, double t,double s, double e) {
		if (a.equals("	cpu")) {
			for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
				Util1[i]=t;
			}
		}
		else if (a.equals("	store")) {
			for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
				Util2[i]=t;
			}
		}
		else if (a.equals("	mem")) {
			for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
				Util3[i]=t;
			}
		}
	}
	public void StoreAlloc(String a, double t,double s, double e) {
		if (a.equals("cpu")) {
			for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
				allocation1[i]=t;
			}
		}
		else if (a.equals("store")) {
			for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
				allocation2[i]=t;
			}
		}
		else if (a.equals("mem")) {
			for(int i=(int)(java.lang.Math.floor(s/50));i<(int)(java.lang.Math.floor(e/50));++i) {
				allocation3[i]=t;
			}
		}
	}
	public void StoreProp(String t,double s, double e) {
		p[noProperty]=new property(t,s,e);
		++noProperty;
	}
	public void updateAllocPrice(double p) {
		allocPrice+=p*50;
	}
	public void updateClusterPrice(double p) {
		clusterPrice+=p;
	}
	public int RetVMID() {
		return(VMID);
	}
	public String RetVMName() {
		return(VMName);
	}
	public int RetHostID(int t) {
		return(HostID[t]);
	}
	public int RetClusterID(int t) {	
		return(ClusterID[t]);
	}
	public String RetPower(int t) {
		return(powerState[t]);
	}
	public double RetUtil1(int t) {
		return(Util1[t]);
	}
	public double allocation1(int t) {
		return(allocation1[t]);
	}
	public double RetUtil2(int t) {
		return(Util2[t]);
	}
	public double allocation2(int t) {
		return(allocation2[t]);
	}
	public double RetUtil3(int t) {
		return(Util3[t]);
	}
	public double allocation3(int t) {
		return(allocation3[t]);
	}
	public int RetNoProp() {
		return(noProperty);
	}
	public String RetPropname(int i) {
		return(p[i].Name());
	}
	public double RetPropUse(int i) {
		return(p[i].Duration());
	}
	public double RetAllocPrice() {
		return(allocPrice);
	}
	public double RetClusterPrice() {
		return(clusterPrice);
	}
}
