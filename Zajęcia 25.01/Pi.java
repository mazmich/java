// Pobawmy się zdaniami typu Callable by wyliczyć liczbę PI.

// TWIERDZENIE:
	// Niech kwadrat ma bok o długości 2. Wpisane w niego koło ma promień 1. Pole Koła = PI*1^2 = PI. Pole kwadratu = 2*2=4.
	// Stosunek pola koła do pola kwadratu = PI/4. Stąd PI = 4 * Pole koła / Pole kwadratu.
	// Losując punkty i sprawdzając czy mieszczą się w kole spowoduje, że stosunek ilości punktów mieszczących się w kole
	// do liczby wszystkich punktów da przybliżenie stosunku pól obu figur.
	// Wystarczy pomnożyć przez 4 by dać przybliżenie liczby PI.

// Stwórz zadanie typu Callable, które zwraca obiekt typu Double. Każde zadanie (Task) polega na:
	// 1. 10 000 razy losuje punkt jako dwie liczby z zakresu <-1, 1> (współrzędne x i y), 
	//    a następnie sprawdza czy owy punkt  znajduje się wewnątrz koła jednostkowego (x^2+y^2 <= 1).
	//    Zliczamy ilość takich sytuacji kiedy punkt mieścił się w kole.

	// 2. Każde zadanie da przybliżenie liczby PI. Zbierz te wyniki - wyznacz średnią za wszystkie wątki  i pokaż wynik.
	// 3. Skorzystaj z Executora jako wykonywacza zadań a do generowania liczb losowych - klasy Random




public class Pi {

}
