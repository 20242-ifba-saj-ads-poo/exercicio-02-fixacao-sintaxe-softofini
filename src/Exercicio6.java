//QUESTÃO 6
class Exercicio6 {
    public static void main(String[] args) {
    int numero = 1;
    int anterior1 = 0;
    int anterior2 = 1;
    
   while (numero<=100){
       numero = anterior1 + anterior2;
       anterior1 = anterior2;
       anterior2 = numero;
      
       System.out.println(numero);
       
       
    } 
    
    
    
}
}
