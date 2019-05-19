package java_final_classes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class PizzaDB {
    private ArrayList<Pizza> set = new ArrayList<Pizza>();
    private String file;

    public PizzaDB(String name) {
      // Name is the DB name AKA the file name
      this.file = name;
    }
  
    private void refreshSet() {
      try {
        FileInputStream fileStream = new FileInputStream(this.file);
        ObjectInputStream inputStream = new ObjectInputStream ( fileStream );	           
        ArrayList<Pizza> pizzas = (ArrayList<Pizza>) inputStream.readObject();
        this.set = pizzas;
          inputStream.close();
      } catch(Exception err) {
        System.out.println("Error: " + err);
      }
    }
  
    private void updateBinary() {
      try {
        FileOutputStream fileStream = new FileOutputStream(this.file);
        ObjectOutputStream OutputStream = new ObjectOutputStream ( fileStream );	           
        OutputStream.writeObject(this.set);
          OutputStream.close();
      } catch(Exception err) {
        System.out.println("Error: " + err);
      }
    }
  
    public ArrayList<Pizza> getPizzas() {
      this.refreshSet();
      return this.set;
    }
  
    public void addPizza(Pizza za) {
      this.set.add(za);
      this.updateBinary();
    }

    public void addPizzas(Pizza[] zas) {
        this.set.addAll(Arrays.asList(zas));
        this.updateBinary();
    }
  
  }