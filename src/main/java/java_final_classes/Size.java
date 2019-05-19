package java_final_classes;

public enum Size {
    S(14),
    M(16),
    L(18),
    XL(20)
    ;
  
    private int inches;
    
    private Size(int s) {
      inches = s;
    }

    public int getInches() 
    { 
        return this.inches;
    }
  }