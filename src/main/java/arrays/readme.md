Zadanie 1. Napisz program wyświetlający wyświetlający tablicę w formacie

{ x1, x2, x3, x4, x5, x6 }

Zadanie 2. Napisz program zwracający zwracający tablicę w następującym formacie tekstowym

{ x1, x2, x3, x4, x5, x6 }
Metoda wyświetlająca tablicę ma następującą sygnaturę
public String printArray(int[] array)

Zadanie 3. Napisz program, który sprawdza czy w danej tablicy “array” znajduje się szukana
liczba “key”. Sygnatura metody jest następująca:
public boolean contains(int[] array, int key)

Zadanie 4. Napisz program, który sprawdza czy podane 2 arrays są identyczne. Sygnatura
metody sprawdzającej jest następująca
public boolean equals(int[] array1, int[] array2)

Zadanie 5. Napisz program, który zwraca kopię podanej tablicy. Sygnatura metody kopiującej
jest następująca:
public int[] copyArray(int[] array)

Zadanie 6. Napisz program, który zwraca tablicę w kolejności odwrotnej niż podana.
Przykładowo dla tablicy [1, 5, 6, 9, 55] program zwraca tablicę [55, 9, 6, 5, 1].
Sygnatura metody odwracającej tablicę jest następująca:
public void reverse(int[] array)

Zadanie 7. * Napisz program, który oblicza osobno sumę liczb w tablicy na pozycjach parzystych
i nieparzystych, a następnie sprawdza która suma jest większa wyświetlając
stosowny komunikat. Przygotuj testy jednostkowe sprawdzające działanie metody.

Zadanie 8. * Napisz program, który sprawdza czy w podanej tablicy 3 liczby o indeksach n-1, n,
n+1 spełniają warunek xn-1+1 = xn = xn+1-1. Sygnatura metody sprawdzającej jest
następująca:
public boolean checkArray(int[] array)
Przygotuj testy jednostkowe sprawdzające działanie metody.

Zadanie 9. * Napisz program, który usuwa z tablicy wartości znajdujące się w drugiej tablicy.
Przykładowo tablica wejściowa wygląda następująco [1, 5, 19, 100, 999]. Tablica z
liczbami do usunięcia wygląda następująco [19, 100]. Tablica będąca wynikiem
działania algorytmu powinna wyglądać następująco [1, 5, 999]. Sygnatura metody
usuwającej elementy z tablicy wygląda następująco:
public int[] removeValues(int[] array1, int[] array2)