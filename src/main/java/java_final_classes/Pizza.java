package java_final_classes;

// Fuck this shit!!!

public interface Pizza {
  public Topping[] toppings = new Topping[]{};
  public Size size = Size.M;
  public void changeSize (Size newSize) {
    this.size = newSize;
  }
}

public enum Size {
  S(14),
  M(16),
  L(18),
  XL(20)
}

public enum Topping {
  OLIVE,
  MUSHROOM,
  PEPPERONI,
  FLOUR,
  EXTRA_CHEESE,
  SARDINES
}

public class Pie implements Pizza {
  public Pie(Size s) {
   this.size = s; 
  } 
}

