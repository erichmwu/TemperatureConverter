/**
 * Created by Eric on 2/2/2015.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    double celsius, fahrenheit;
    if (args.length != 2 || !isInt(args[1])) {
      System.err.println("Illegal second argument");
      System.exit(1);
    }
    if (!args[0].equalsIgnoreCase("-F") && !args[0].equalsIgnoreCase("-C")) {
      System.err.println("Illegal first argument");
      System.exit(1);
    }

    if (args[0].equals("-F")) {
      celsius = (convertToInt(args[1]) - 32) * 5.0 / 9.0;
      System.out.println(args[1] + "F in C is " + celsius);
    } else if (args[0].equals("-C")) {
      fahrenheit = (convertToInt(args[1]) * 9.0/5.0) + 32;
      System.out.println(args[1] + "C in F is " + fahrenheit);
    }
  }

  public static boolean isInt(String input) {
    try {
      Integer.parseInt(input);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }

  public static int convertToInt(String input) {
    return Integer.parseInt(input);
  }
 }
