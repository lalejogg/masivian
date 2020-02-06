
public class Tools {

	public Valuesdefault Etapa1(Valuesdefault values)
	{
		int MULT[] = new int[values.getORDMAX()+1];

		while (values.getK() < values.getM()) 
		{
			do 
			{
				values.setJ(values.getJ() + 2);
				if( values.getJ() == values.getSQUARE()) {
					values.setORD(values.getORD() + 1);
					values.setSQUARE(values.getP()[values.getORD()]*values.getP()[values.getORD()]);
					MULT[values.getORD()-1]=values.getJ();
				}
				values.setN(2);
				values.setJPRIME(true);
        		
				while (values.getN() < values.getORD() && values.getJPRIME()) {
					while (MULT[values.getN()]<values.getJ()) 
						MULT[values.getN()] += values.getP()[values.getN()] + values.getP()[values.getN()];

					if (MULT[values.getN()] == values.getJ())
						values.setJPRIME(false);
					values.setN(values.getN() + 1);     
				}
    		} while (!values.getJPRIME());
    		
			values.setK(values.getK() + 1);
			values.setP(values.getK(), values.getJ());  
		}
		
		return values;
	}

	public Valuesdefault Etapa2(Valuesdefault values)
	{
		int ROWOFFSET;
		int C;
		while (values.getPAGEOFFSET() <= values.getM()) {
			System.out.print("The First ");
			System.out.print(Integer.toString(values.getM()));
			System.out.print(" Prime Numbers === Page ");
			System.out.print(Integer.toString(values.getPAGENUMBER()));
			System.out.println("\n");
			for (ROWOFFSET=values.getPAGEOFFSET();ROWOFFSET <= values.getPAGEOFFSET()+values.getRR()-1; ROWOFFSET++) {
				for (C = 0; C <= values.getCC() - 1; C++)
				if (ROWOFFSET + C * values.getRR() <= values.getM())
				{
					Object[] a = new Object[values.getP().length]; 
					for (int i=0; i<values.getP().length; i++) {
						Integer myInt = Integer.valueOf(values.getP()[i]);
					    a[i] = myInt;
					}
		
					
					System.out.printf("%10d", a);
				}
				System.out.println();
			}
    
			System.out.println("\f");
			
			values.setPAGENUMBER(values.getPAGENUMBER() + 1);
			values.setPAGEOFFSET(values.getPAGEOFFSET() + values.getRR()*values.getCC());
		}  
		
		return values;
	}
}
