package java_final_classes;

public enum Size {
    S(14, 7.50),
    M(16, 10.50),
    L(18, 12.50),
    XL(20, 14.50)
    ;
  
    private int inches;
    private double cost;
    
    private Size(int s, double c) {
      inches = s;
      cost = c;
    }

    public int getInches() { 
        return this.inches;
    }

    public double getCost() { 
      return this.cost;
    }

    public String toString() {
      return this.name();
    }
  }