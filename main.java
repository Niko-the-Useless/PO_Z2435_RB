class point{ 
	double x;
	double y;
	//konstruktor
	public point(double x, double y){
		this.x=x;
		this.y=y;
	}
};

class calculator
{
	double distance (point a, point b){
		return Math.sqrt(Math.pow((b.x-a.x),2)+Math.pow((b.y-a.y),2));
	};
	double distanceX (point a, point b){
		return Math.abs(a.x-b.x);
	};
	double distanceY (point a, point b){
		return Math.abs(a.y-b.y);
	};
};

class circle
{
	point center;
	double r;

	double area(){
		return Math.PI*r*r;
	};
	double circ(){
		return 2*Math.PI*r;
	};
	//konstruktor
	public circle(point center, double r){
		this.center=center;
		this.r=r;
	};
};

class exec 
{
	public static void main(String[] args){
		point a = new point(0.0,1.0);
		point b = new point(2.0,3.0);
		calculator calc = new calculator();
		circle circle = new circle(a,5);
		System.out.println(calc.distance(a,b));
		System.out.println(calc.distanceX(a,b));
		System.out.println(calc.distanceY(a,b));
		System.out.println(circle.area());
		System.out.println(circle.circ());
	}
};
