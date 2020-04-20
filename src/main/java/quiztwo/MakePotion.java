package quiztwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/** Makes a potion.
 *
 * @author G. Wiz
 */
public class MakePotion {
    
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/potion.recipe");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    int column = 1;
    int ingrAmt = 0;
    
    String data;
    String ingrName = null;
    Potion potion = new Potion(input.nextLine());
    Scanner line;
    
    while (input.hasNextLine()) {
      data = input.nextLine();
      line = new Scanner(data);
      line.useDelimiter("\t");
      while (line.hasNext()) {
        switch (column) {
          case 1:
            ingrName = line.next();
            break;
          default:
            ingrAmt = line.nextInt();
            break;
        }
        column++;
      }
      column = 1;
      potion.addIngredient(ingrName, ingrAmt);
    }
    
    System.out.println(potion);
  }
}