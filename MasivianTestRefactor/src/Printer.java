public class Printer 
{     
	public static void main(String[] args) {
		Valuesdefault values = new Valuesdefault();
		values.setP(1, 2);

		Tools tools = new Tools();
		values = tools.Etapa1(values);

		values.setPAGENUMBER(1); 
		values.setPAGEOFFSET(1);

		values = tools.Etapa2(values);
	}
}
