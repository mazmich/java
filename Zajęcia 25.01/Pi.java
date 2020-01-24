// Pobawmy si� zdaniami typu Callable by wyliczy� liczb� PI.

// TWIERDZENIE:
	// Niech kwadrat ma bok o d�ugo�ci 2. Wpisane w niego ko�o ma promie� 1. Pole Ko�a = PI*1^2 = PI. Pole kwadratu = 2*2=4.
	// Stosunek pola ko�a do pola kwadratu = PI/4. St�d PI = 4 * Pole ko�a / Pole kwadratu.
	// Losuj�c punkty i sprawdzaj�c czy mieszcz� si� w kole spowoduje, �e stosunek ilo�ci punkt�w mieszcz�cych si� w kole
	// do liczby wszystkich punkt�w da przybli�enie stosunku p�l obu figur.
	// Wystarczy pomno�y� przez 4 by da� przybli�enie liczby PI.

// Stw�rz zadanie typu Callable, kt�re zwraca obiekt typu Double. Ka�de zadanie (Task) polega na:
	// 1. 10 000 razy losuje punkt jako dwie liczby z zakresu <-1, 1> (wsp�rz�dne x i y), 
	//    a nast�pnie sprawdza czy owy punkt  znajduje si� wewn�trz ko�a jednostkowego (x^2+y^2 <= 1).
	//    Zliczamy ilo�� takich sytuacji kiedy punkt mie�ci� si� w kole.

	// 2. Ka�de zadanie da przybli�enie liczby PI. Zbierz te wyniki - wyznacz �redni� za wszystkie w�tki  i poka� wynik.
	// 3. Skorzystaj z Executora jako wykonywacza zada� a do generowania liczb losowych - klasy Random


public class Pi {

}
