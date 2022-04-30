package activity1;

public class Rectangle {
  private int width, height;
  
  public Rectangle() {}

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    if (width > 0) {
      this.width = width;
    }
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int perimeter() {
    return 2 * (width + height);
  }

  public int area() {
    return width * height;
  }

  public boolean isSquare() {
    return width == height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "width=" + width +
            ", height=" + height +
            '}';
  }
}
