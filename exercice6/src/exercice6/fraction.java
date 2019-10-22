package exercice6;

public class fraction{
	private int denominateur;
	private int numerateur ;

	fraction (int num , int d ){
		denominateur=num;
		numerateur =d;
	}

	fraction (int num)
	{
		denominateur=1;
		numerateur=num;
	}
	fraction(){
		numerateur=0;
				denominateur=1;
	}
		
	public final fraction zero = new fraction(0,1);
	public final fraction un = new fraction (1,1);
	
	public int getDenumerateur(){
		return	this.denominateur;
	}
	
	public int getNumerateur() {
		return this.numerateur;
	}
	
	public double getRes(){
		return ((double)numerateur/(double)denominateur);
	}
	
	public String toString(){
		 String res = String.valueOf(numerateur) + "/" + String.valueOf(denominateur);
		 return res;
	}

	public boolean testFraction(fraction a)
	{
	if( this.getRes()==a.getRes())
	{
		return true;
	}
	else return false;
	}
	
	public fraction compare(fraction f) {
		if(this.getRes() > f.getRes())
			return this;
		return f;
	}
}

