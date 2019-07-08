public class Numprimo{
	private int num;
	public Numprimo(int num){
		this.num=num;
		
	}
	public void setNum(int num){
		num=num;
	}
	public float getNum(){
		return num;
	}
	public void CalculoPrimo(){
		int contador = 0;
		int i; 
        for(i = 1; i <= num; i++)
        {
            if((num % i) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
}
}