package java_final_classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza implements Serializable {
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