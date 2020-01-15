package numero;


public class numero {
	//atributo
		private int num;
		
		//constructores
		numero() {num = 0; }
		numero(int n) {num = n; }
		
		//metodos
		public void anayde(int valor) {
			num += valor;
		}
		public void resta(int valor) {
			num -= valor;
		}
		public int getValor() {
			return num;
		}
		public boolean esPrimo() {
			boolean primo=true;
			for(int i=2; i<num/2; i++)
				if (num%i==0) {
					primo=false;
					break;
				}
			return primo;

		}
		public void setNumero(int valor) {
			valor=num;
		}
		
		public static void main (String [] args) {
			numero n1 = new numero(2);
			n1.setNumero(11);
			n1.anayde(3);
			n1.resta(3);
			System.out.println(n1.getValor());
			System.out.println("¿El numero "+n1.getValor()+" es primo? "+n1.esPrimo());

			
		}
	}
