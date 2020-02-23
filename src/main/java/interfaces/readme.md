iInterface

<b>Zadanie 1</B>.Przygotowywanie pizzeria.
Przygotuj  interfejs  o  nazwie  Pizza do  wypiekania  pizzy  posiadający  jedną metodę
void preparePizza(). Zaimplementuj w/w interfejs w klasie Margherita, Hawaiian,  Veggie.
Niech  metoda preparePizza() wyświetla na konsoli kroki jakie należy wykonać
, aby przygotować pizzę. Każda pizza powinna mieć listę składników,
która  będzie  przechowywana  jako  lista.  Utwórz  konstruktor bezparametrowy oraz taki
, który umożliwia przekazanie listy składników  do każdej pizzy.
     
Przygotuj  interfejs  o  nazwie  Ingredients  do  pobierania  składników 
pizzy posiadający metodę List<String> getIngredients() zwracający listę składników
i zaimplementuj go w każdej pizzy. 
     
Przygotuj interfejs do wyrabiania ciasta o nazwie PizzaDough,
a w nim metodę void preparePizzaDough(). Przygotuj następujące klasy
implementujące interfejs PizzaDoughi.AllAmericanThinii.GlutenFreeiii.ChessyBitesiv.
Panv.FeelGoodFlatbreadvi.StuffedCrustZaimplementuj metodę preparePizzaDough() 
w każdej klasie. Niech ta metoda wyświetla tekst na konsoli 
“Przygotowywanie ciasta <nazwa_ciasta>”
Dodaj  zmienną  prywatną  typu  PizzaDough  w  każdej  pizzy  i  rozszerz konstruktor klasy
 tak aby przyjmował zmienną PizzaDough jako argument i przypisywał go do utworzonej zmiennej
 
Rozszerz metodę preparePizza() tak aby jako pierwszy krok była wykonywana metoda preparePizzaDough()
obiektu   przypisanego   do   zmiennej   typu PizzaDough.
   
Do wspólnej listy dodaj kilka różnych pizz (po jednej z każdego rodzaju) i
do każdej z nich przekaż inne ciasto. Następnie korzystając z pętli for wyświetl 
sposób ich wykonywania za pomocą metody preparePizza()
 
 
<b>Zadanie 2</b>. Przygotuj aplikację konsolową, która pobiera od użytkownika imię i wyświetla go
na konsoli. Do aplikacji dodaj mechanizm logowania wyświetlający komunikat 
"Podano imię <podane_imie>". Przygotuj wspólny interfejs o nazwie Logger
z metodą void log(String message) dla mechanizmu logowania a następnie przygotuj
dwie klasy implementujące interfejs Logger. Jedna niech wyświetla informację
na konsoli(klasa o nazwie ConsoleLogger), druga zapisuje logi do pliku
(klasa o nazwie FileLogger).i wykorzystaj go w aplikacji.
Za pomocą metody void logMessage(Logger logger, String message) 
zaloguj informacje do konsoli, a następnie do pliku.