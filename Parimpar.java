public class Parimpar{
	private int num;
	public Parimpar(int num){
		this.num=num;
		
	}
	public void setNum(int num){
		num=num;
	}
	public float getNum(){
		return num;
	}
	public void Calculo(){
		if(num%2==0){
			System.out.println("Es par.");
		}else{System.out.println("Es impar.");
		}
	}
}