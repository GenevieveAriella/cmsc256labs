package cmsc256;
// Completed by Uriah Coblentz and Maggie Dooley 1.19.2022

/** 
  Determines if three doubles can be sides of triangle. 
*/
public class Triangle  {

   /** Length of side 1. */
   private double sideA;

   /** Length of side 2. */
   private double sideB;

   /** Length of side 3. */
   private double sideC;

   /**
    * Creates a Triangle.
    *
    * @param aIn length of side 1.
    * @param bIn length of side 2.
    * @param cIn length of side 3.
    */
   public Triangle(double aIn, double bIn, double cIn) {
      
      if (aIn <= 0 || bIn <= 0 || cIn <= 0) {
         throw new IllegalArgumentException("Sides: " + aIn + " " + bIn + " " + cIn
            + "Not a triangle, cannot have side length zero or less");       // add an explanation why this exception is being thrown.
      }
     
      if ((aIn >= bIn + cIn) || (bIn >= aIn + cIn) || (cIn >= aIn + bIn)) {
         throw new IllegalArgumentException("Sides: "
            + aIn + " " + bIn + " " + cIn
            + "Not a triangle, cannot have side length greater than sum of other two sides");      // add an explanation why this exception is being thrown.
      }
     
      sideA = aIn;
      sideB = bIn;
      sideC = cIn;
   }

   /**
    *  Classifies a triangle based on the lengths of the three sides.
    *  The classifications are either: "equilateral", "scalene", "isosceles", 
    *  or "not a triangle". The returned string must match one of these.Tri
    * 
    * @return the triangle classification.
    */
   public String classify() {
      String result = "";
      if ((sideA == sideB) && (sideB == sideA)) {
         result = "equilateral";
      } if ((sideA != sideB) && (sideA != sideC)) {
         result = "scalene";
      } if (((sideA == sideB) && (sideA != sideC)) || ((sideB == sideC) && (sideB != sideA)) || ((sideC == sideA) && (sideC != sideB))){
         result = "isosceles";
      }
      if (sideA <= 0 || sideB <= 0 || sideC <= 0){
         result = "Not a triangle";
      }
      if((sideA >= sideB + sideC)||(sideB >= sideA + sideC)||(sideC >= sideB + sideA)){
         result = "Not a triangle";
      }
      return result;
   }




}
