package tp3;

class Point {
	private double x;
    private double y;
    


    public Point() {
        this.x = 0;
        this.y = 0;
    }

    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void afficher() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
    
    public void deplacer(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
}
    
    public double distanceOrigine() {
        return Math.sqrt(x * x + y * y);
    }
    
    public double distance(Point p) {
    	double dx = p.x - this.x;
    	double dy = p.y - this.y;
    	return Math.sqrt(dx * dx + dy * dy);
    }
}
public class EX1 {
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		p1.afficher();
		
		
		Point p2 = new Point(3,4);
		p2.afficher();
		
		p2.deplacer(1, 2);
		p2.afficher();
		
		
		
		System.out.println("Distance à l'origine : " + p2.distanceOrigine());
		
	}
}


