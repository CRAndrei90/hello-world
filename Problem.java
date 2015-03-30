package projetOne;

interface Calculare{
	public abstract void arieCerc(int r);
	public abstract double arieDreptunghi(int L,int l);
}

abstract class Perimetru{
	public abstract void perimetruCerc(int r);
}
class Aria extends Perimetru implements Calculare{
	  public void arieCerc(int r)
	  {
		  double pi = 3.14;
		  System.out.println("Aria Cercului este:"+(pi*Math.pow(r, 2)));
	  }
	  public double arieDreptunghi(int L,int l){
		  return L*l;
	  }
	  public void perimetruCerc(int r)
	  {
		  double pi = 3.14;
		  System.out.println("Perimetrul este :"+ (int)(2*pi*r));
	  }
	}



public class Problem extends Aria{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y =6;
		Aria arie = new Aria();
		arie.arieCerc(x);
		int dreptunghi = (int)arie.arieDreptunghi(x,y);
		System.out.println("Aria dreptunghilui este :"+ dreptunghi);
		arie.perimetruCerc(y);
	}

}
