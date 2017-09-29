package shapes;

public class ShapesTest_OLD {

  public static void main(String[] args) {

    Measurable myShape = new Measurable() {
      @Override
      public void setLength() {

      }

      @Override
      public void setWidth() {

      }
    };


  Rectangle box1 = new Rectangle(5, 4);
  Rectangle box2 = new Square( 5);

    System.out.println("This is the area of the rectangle: " + box1.getArea());
    System.out.println("This is the area of the square: " + box2.getArea());
    System.out.println("This is the perimeter of the rectangle: " + box1.getPerimeter());
    System.out.println("This is the perimeter of the square: " + box2.getPerimeter());

  }

}



/*

  Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,

        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        In the Square class, override the getArea and getPerimeter methods with the following definitions for a square


        perimter = 4 x side
        area = side ^ 2
        Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
*/