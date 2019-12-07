// Napisz metod� klasyczn� (nie statyczn�), o nazwie contains,
// kt�ra przyjmuje typ generyczny <T> kt�ra przyjmuje 2 argumenty:
//	- Dowoln� list� obiekt�w typu T
//	- Jeden element typu T

// Metoda zwraca true, je�li element podany w drugim parametrze znajduje si� w tablicy
// (z dok�adno�ci� do metody equals).



public class Main {
  
  // tutaj napisz niestatyczn� metod� contains

  public static void main(String[] args) {
    String[] array = {"element", "item"};
    String element1 = "element";
    String element2 = "element2";
    
    Main main = new Main();
    System.out.println(main.contains(array, element1));
    System.out.println(main.contains(array, element2));
    
    
  }
}