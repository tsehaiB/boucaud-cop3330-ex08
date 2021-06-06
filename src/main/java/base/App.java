package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String args[]){
        App myApp = new App();
        int people = myApp.readIn("people");
        int pizzas = myApp.readIn("pizzas do you have");
        int slicesPerPizza = myApp.readIn("slices per pizza");
        int slices = myApp.totalSlices(pizzas, slicesPerPizza);
        System.out.println(people + " people with " + pizzas + " pizzas (" + slices + " slices)");
        System.out.println("Each person gets " + myApp.divPizza(slices, people) + " pieces of pizza");
        System.out.println("There are " + myApp.leftOver(slices, people) + " leftover pieces");
    }
    private int readIn(String words){
        System.out.print("How many " + words + "? ");
        return Integer.parseInt(inp.nextLine());
    }
    private int totalSlices(int pizza, int slice){
        return pizza * slice;
    }
    private int divPizza(int slices, int people)
    {
        return slices/people;
    }
    private int leftOver(int slices, int people)
    {
        return slices % people;
    }
}
