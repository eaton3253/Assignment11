/* Name: Jerry Eaton
   Assignment #: 11
   Due Date: 4-19-2016
   Course/Section/Term yr:  Computer Programming II  IT2045C  Spring 2016

Program Description:
https://projecteuler.net/problem=142

Perfect Square Collection

Problem 142

Find the smallest x + y + z with integers x > y > z > 0 such that x + y, x − y, x + z, x − z, y + z, y − z are all perfect squares.

Put on GitHub and make me a collaborator , I am nicomp42. Upload the link to BB here. Just the link Not the project.

*/

package EDU.UC.IT205C.Spring2016.Assignment11.eatonjo;

public class Main {

	public static void main(String[] args) {

		Boolean solved = false;
		int x = 434655;   //for testing purposes starting at a high number which I know is close to the answer.
		
		//Brute force method
		while (solved == false) {
			//System.out.println(x); //debug
			for (int y = 2; y <= x; y++){ 
				for (int z = 1; z <= y; z++){ 
					if ((x > y) && (y > z)) {
						if (isPerfectSquare(x + y) && isPerfectSquare(x - y) && isPerfectSquare(x + z)
							&& isPerfectSquare(x - z) && isPerfectSquare(y + z) && isPerfectSquare(y - z)) {
							System.out.println("x: " + x + " y: " + y + " z: " + z + " = " + (x + y + z));
						    solved = true;
						}
					}
				}
			}
			x++;
		}
	}
	
	public final static boolean isPerfectSquare(long n)
	{
	  long test = (long)(Math.sqrt(n) + 0.5);
	  if (test*test == n) {
		  return true;
	    } else {
	    	return false;
	  }
	  
	}

}