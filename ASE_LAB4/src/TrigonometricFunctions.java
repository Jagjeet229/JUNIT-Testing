/*
 * ASE LAB 4 ASSIGNMENT
 * 
 * LAB GROUP 14
 * 
 * @AUTHORS
 * ASHUTOSH SADANA
 * STD_ID:110074919
 * 
 * JAGJEET SINGH
 * STD_ID:110077544
 * 
 * Version1: If we comment the ROUNDOFF IN DEG FUNCTIONS ::> 27  test cases fail
 * Version2: Implementing the fix i.e.THE ROUNDOFF IN DEG FUNCTIONS ::> All Test cases pass.
 * 	
 * 
 * */
public class TrigonometricFunctions {

	public static double sinRad(double x, int n) {
        //Reference URL : https://stackoverflow.com/questions/12343377/java-sin-cos-tan-ln-other-precision-for-double
        double result = x;
        double term = x;
        for (int i = 3, n2 = n * 2; i <= n2; i += 2) {
            term *= -x * x / ((i - 1) * i);
            result += term;
        }
        return result;
    }

    public static double sinDeg(int degrees, int n) {

        double radian = degrees * 3.141592 / 180;
        radian =  Math.round(radian*1000.0)/1000.0;
        return sinRad(radian,n);
    }

    public static double cosRad(double x, int n) {
        double result = 1;
        double term = 1;
        for (int i = 2; i <= n*2; i += 2) {
            term *= -x * x / ((i - 1) * i);
            result += term;
        }
        return result;
    }

    public static double cosDeg(int degrees, int n) {

        double radian = degrees * 3.141592 / 180;
        radian =  Math.round(radian*1000.0)/1000.0;
        return cosRad(radian,n);
    }

    public static double tanRad(double x, int n) {

        double results = sinRad(x,n)/cosRad(x,n);
        return results;
    }

    public static double tanDeg(int degrees, int n) {

        double radian = degrees * 3.141592 / 180;
        radian =  Math.round(radian*1000.0)/1000.0;
        return tanRad(radian,n);
    }

    public static void main(String... args) {

//     System.out.println("SIN90 in radians: "+sinRad(1.571,99));
//     System.out.println("SIN90 in degrees: "+sinDeg(90,99));
//     System.out.println();
//     System.out.println("COS90 in radians: "+cosRad(1.571,99));
//     System.out.println("COS90 in degrees: "+cosDeg(90,9));
//     System.out.println();
//     System.out.println("TAN90 in radians: "+tanRad(1.571,99));
//     System.out.println("TAN90 in degrees: "+tanDeg(90,99));  

        }
    
    
}