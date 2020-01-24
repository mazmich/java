// Pobawmy siê zdaniami typu Callable by wyliczyæ liczbê PI.

// TWIERDZENIE:
	// Niech kwadrat ma bok o d³ugoœci 2. Wpisane w niego ko³o ma promieñ 1. Pole Ko³a = PI*1^2 = PI. Pole kwadratu = 2*2=4.
	// Stosunek pola ko³a do pola kwadratu = PI/4. St¹d PI = 4 * Pole ko³a / Pole kwadratu.
	// Losuj¹c punkty i sprawdzaj¹c czy mieszcz¹ siê w kole spowoduje, ¿e stosunek iloœci punktów mieszcz¹cych siê w kole
	// do liczby wszystkich punktów da przybli¿enie stosunku pól obu figur.
	// Wystarczy pomno¿yæ przez 4 by daæ przybli¿enie liczby PI.

// Stwórz zadanie typu Callable, które zwraca obiekt typu Double. Ka¿de zadanie (Task) polega na:
	// 1. 10 000 razy losuje punkt jako dwie liczby z zakresu <-1, 1> (wspó³rzêdne x i y), 
	//    a nastêpnie sprawdza czy owy punkt  znajduje siê wewn¹trz ko³a jednostkowego (x^2+y^2 <= 1).
	//    Zliczamy iloœæ takich sytuacji kiedy punkt mieœci³ siê w kole.

	// 2. Ka¿de zadanie da przybli¿enie liczby PI. Zbierz te wyniki - wyznacz œredni¹ za wszystkie w¹tki  i poka¿ wynik.
	// 3. Skorzystaj z Executora jako wykonywacza zadañ a do generowania liczb losowych - klasy Random


public class Pi {

}
