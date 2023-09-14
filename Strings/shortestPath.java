import java.lang.Math;
public class shortestPath{
	public static void path(String path){
		int x = 0, y = 0;
		for (int i = 0; i<path.length(); i++) {
			char direction = path.charAt(i);
			if (direction=='N') {
				y++;
			}
			else if(direction=='S'){
				y--;
			}
			else if(direction=='E'){
				x++;
			} else {
				x--;
			}
		}
		double distance = Math.sqrt((x*x)+(y*y));
		System.out.println("Shortest distance for '" + path + "' path is " + distance);
	}
	public static void main(String[] args) {
		String path = "WNEENESENNN";
		path(path);
	}
}