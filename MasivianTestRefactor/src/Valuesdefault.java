
public class Valuesdefault {
	
	private final int M = 1000;
	private final int RR = 50;
	private final int CC = 4;
	private final int ORDMAX = 30;
	private int P[] = new int[M+1];
	private int PAGENUMBER;
	private int PAGEOFFSET;
	
	private int J=1;
	private int K=1;
	private boolean JPRIME;
	private int ORD = 2;
	private int SQUARE = 9;
	private int N=0;
	
	public Valuesdefault()
	{}
	  public int getM() {
	        return M;	  }
	  public int getCC() {
	        return RR;	  }
	  public int getRR() {
	        return CC;	  }
	  public int getORDMAX() {
	        return ORDMAX;	  }
	  public int[] getP() {
	        return P;	  }
	  public int getPAGENUMBER() {
	        return PAGENUMBER;	  }
	  public int getPAGEOFFSET() {
	        return PAGEOFFSET;	  }
	  public int getJ() {
	        return J;	  }
	  public int getK() {
	        return K;	  }
	  public boolean getJPRIME() {
	        return JPRIME;	  }
	  public int getORD() {
	        return ORD;	  }
	  public int getSQUARE() {
	        return SQUARE;	  }
	  public int getN() {
	        return N;	  }
	  
	  public void setJ(int j) {
	        J = j;	  }
	  public void setORD(int ord) {
	        ORD = ord;	  }
	  public void setSQUARE(int square) {
		  SQUARE = square;}	 
	  public void setN(int n) {
	        N = n;	  }
	  public void setJPRIME(boolean jprime) {
		  JPRIME = jprime;	  }
	  public void setK(int k) {
		  K = k;	  }
	  public void setP(int p, int value) {
		  P[p] = value;	  }
	  public void setPAGENUMBER(int pAGENUMBER) {
		  PAGENUMBER = pAGENUMBER;}
	  public void setPAGEOFFSET(int pAGEOFFSET) {
		  PAGEOFFSET = pAGEOFFSET;}
}
