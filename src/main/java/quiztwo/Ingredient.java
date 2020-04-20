package quiztwo;

/** Creates an ingredient object.
 *
 * @author G. Wiz
 */
public class Ingredient {
  
  private String name;
  private double amount;
  
  /** Constructor.
   *
   * @param name Name of ingredient
   * @param amount Amount of ingredient
   */
  public Ingredient(String name, double amount) {
    this.name = name;
    this.amount = amount;
  }
  
  /** Get name of ingredient.
   *
   */
  public String getName() {
    return this.name;
  }
  
  /** Get amount of ingredient.
   *
   */
  public double getAmount() {
    return this.amount;
  }
}