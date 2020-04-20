package quiztwo;

import java.util.ArrayList;

/** Creates a potion object.
 *
 * @author G. Wiz
 */
public class Potion {

  private String name;
  private ArrayList<Ingredient> ingredients;

  /** Constructor.
   *
   * @param name The name of the potion.
   */
  public Potion(String name) {
    this.name = name;
    this.ingredients = new ArrayList<Ingredient>();
  }

  public void addIngredient(String name, int amount) {
    Ingredient ingredient = new Ingredient(name, amount);
    this.ingredients.add(ingredient);
  }

  public ArrayList<Ingredient> getIngredients() {
    return this.ingredients;
  }

  /** Creates a string representation of a Potion.
   *
   */
  public String toString() {
    String potion = "Potion name:\t" + this.name + "\n";
    Ingredient ingredient;
    for (int i = 0; i < this.ingredients.size(); i++) {
      ingredient = this.ingredients.get(i);
      potion += "  " + ingredient.getName() + "\t" + ingredient.getAmount() + "\n";
    }
    return potion;
  }
}
