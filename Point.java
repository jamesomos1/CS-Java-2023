class Point 
{
        private double x; // x coordinate
        private double y; // y coordinate

        public Point( double xCoordinate, double yCoordinate ) 
        {
                x = xCoordinate; // set x
                y = yCoordinate; // set y
        }
        // return x
        public double getX() 
        {
          return x;
        }

        // return y
        public double getY() 
        {
           return y;
        }

        public String toString() 
        {
                return String.format( "( %.1f, %.1f )", getX(), getY() );
        }
}

class quad 
{
        public static void main( String args[] ) 
        {

// A quadrilateral is a four-sided polygon
                Quadrilateral quadrilateral =
                    new Quadrilateral( 1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4 );

// A trapezoid is a quadrilateral having exactly two parallel sides
                Trapezoid trapezoid =
                    new Trapezoid( 0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0 );

// A parallelogram is a quadrilateral with opposite sides parallel
                Parallelogram parallelogram =
                    new Parallelogram( 5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0 );

// A rectangle is an equiangular parallelogram
                Rectangle rectangle =
                    new Rectangle( 17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0 );

                Square square =
                    new Square( 4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0 );

                System.out.printf(
                    "%s %s %s %s %s\n", quadrilateral, trapezoid, parallelogram,
                    rectangle, square );
        }
}