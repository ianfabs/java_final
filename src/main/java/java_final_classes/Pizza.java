package java_final_classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Pizza implements Serializable {
  private static final long serialVersionUID = -1123329175878415802L;
  public String name = "";
  public ArrayList<Topping> toppings = new ArrayList<Topping>();
  public Size size = Size.M;
  /**
   * @return the name
   */
  public double getCost() {
    return size.getCost() + toppings.stream().map(za -> za.getCost()).reduce(0.0, Double::sum);
  }
  
  public Pizza() {}
  public Pizza(String n) {
    this.name = n;
  }
  public Pizza(Size s) {
    this.size = s;
  }
  public Pizza(String n, Size s) {
    this.name = n;
    this.size = s;
  }
  public Pizza(Topping[] ts) {
    this.toppings = new ArrayList<Topping>(Arrays.asList(ts));
  }
  public Pizza(Size s, Topping[] ts) {
    this.size = s;
    this.toppings = new ArrayList<Topping>(Arrays.asList(ts));;
  }
  public Pizza(String n, Size s, Topping[] ts) {
    this.name = n;
    this.size = s;
    this.toppings = new ArrayList<Topping>(Arrays.asList(ts));;
  }
}