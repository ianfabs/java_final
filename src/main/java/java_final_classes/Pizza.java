package java_final_classes;

public class Pizza {
  public Topping[] toppings = new Topping[] {};
  public Size size = Size.M;

  public Pizza(Size s) {
    this.size = s;
  }
  public Pizza(Topping[] ts) {
    this.toppings = ts;
  }
  public Pizza(Size s, Topping[] ts) {
    this.size = s;
    this.toppings = ts;
  }
}