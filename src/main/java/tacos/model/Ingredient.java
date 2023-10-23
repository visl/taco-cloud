package tacos.model;

import lombok.Data;

@Data
public class Ingredient {

  private String id;
  private String name;
  private Type type;

  public Ingredient(String id, String name, Type type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}
