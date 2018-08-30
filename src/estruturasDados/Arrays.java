package estruturasDados;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//metodo normal
		double TempMediaMes01 = 31.9;
		double TempMediaMes02 = 32;
		double TempMediaMes03 = 30.2;
		double TempMediaMes04 = 29.8;
		double TempMediaMes05 = 27.5;
		double TempMediaMes06 = 32.6;
		double TempMediaMes07 = 31;
		
		//metodo array
		double[] temperaturas = new double[31];
		
		temperaturas[0] = 31.9;
		temperaturas[1] = 32;
		temperaturas[2] = 30.2;
		temperaturas[3] = 29.8;
		temperaturas[4] = 27.5;
		temperaturas[5] = 32.6;
		temperaturas[6] = 31;
		temperaturas[7] = 33;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0] + "\n");
		
		System.out.println("O tamanho do array é: " + temperaturas.length + "\n");
		
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
			
		}
	}

}
