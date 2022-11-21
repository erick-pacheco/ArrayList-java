import java.util.ArrayList;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    ArrayList<String> instruments = new ArrayList<String>();

    String drums = "Drums";
    instruments.add(drums);
    String violin = "Violin";
    instruments.add(violin);

    instruments.add("Guitar");
    instruments.add(new String("Piano"));

    for (int i = 0; i < instruments.size(); i++) {
      log(instruments.get(i));
    }

    instruments.remove("Violin");

    /* Section 6 */
    log("");
    for (int i = 0; i < instruments.size(); i++) {
      log(instruments.get(i));
    }

    /* Section 7 */
    log("");

    instruments.remove(1);

    for (int i = 0; i < instruments.size(); i++) {
      log(instruments.get(i));
    }

    /* Section 8 */
    ArrayList<Integer> arrayOfInts = new ArrayList<Integer>();
    int[] toBeAdded = { 15, 22, 99, 75, 16, 2 };

    for (int newInt : toBeAdded) {
      arrayOfInts.add(newInt);
    }

    /* Section 10 */
    for (int intVal : arrayOfInts) {
      log(intVal);
    }

    /* Section 11 */
    Collections.reverse(arrayOfInts);

    for (int intVal : arrayOfInts) {
      log(intVal);
    }
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}