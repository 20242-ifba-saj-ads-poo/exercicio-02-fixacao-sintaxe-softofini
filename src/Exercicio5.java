//QUESTÃO 5
class Exercicio5{
	public static void main(String[] args) {
	    float fatorial = 1;
	    
	    
        for (int n = 1; n <= 20; n++){
            fatorial = 1;
            for(int i = n; i > 0; i--){
                fatorial = fatorial*i;
            }
            System.out.println(fatorial);
        }
	    
	
	}
}
