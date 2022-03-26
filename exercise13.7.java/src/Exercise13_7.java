public class Exercise13_7 {
  public static void main(String[] args) {
    GeometricObject2[] squares = {new Square(2), new Square(3),
                                  new Square(4), new Square(5),
                                  new Square(6)};

    for (int i = 0; i < squares.length; i++) {
      System.out.println("Area: " + squares[i].getArea());
      System.out.println("How to Color: " + ((Square)squares[i]).howToColor());
    }
  }
}
