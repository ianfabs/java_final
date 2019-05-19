package java_final_classes;

public enum Topping {
    OLIVE(0.25),
    PINEAPPLE(0.50),
    HAM(0.25),
    MUSHROOM(0.25),
    PEPPERONI(0.25),
    FLOUR(0.15),
    EXTRA_CHEESE(0.00),
    SARDINES(15.00)
    ;

    private double cost;

    private Topping(double c){
      this.cost = c;
    }
    
    public double getCost() {
      return this.cost;
    }
  }