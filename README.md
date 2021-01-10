## HospitalServiceSystem
Ablikacja webowa dająca możliwość rejestracji pacjenta albo doktora. W zależności od typu użytkownika oferuje następujące funkcjonalności:<br />
Pacjentowi umożliwia wyszukiwanie dostępnych wizyt u wybranego lekarza, rezerwacje oraz podgląd otrzymanej diagnozy.<br />
Konto doktora oferuje dodawanie wizyt, przekładanie ich oraz uzupełnianie diagnozy pacjenta.

| Nazwisko i imię | Wydział | Kierunek | Semestr | Grupa | Rok akademicki |
| :-------------: | :-----: | :------: | :-----: | :---: | :------------: |
| Wiktor Wanat        | WIMiIP  | IS       |   5     | 5     | 2019/2020      |
| Michał Zmarły       | WIMiIP  | IS       |   5     | 5     | 2019/2020      |

## Diagram przypadków użycia 
![screenshot](/sources/useCase.jpg)

## Diagram klas
![screenshot](/sources/classDiagram.jpg)


## Diagram sekwencji
![screenshot](/sources/diagramSekwencjiOba.jpg)

## Aplikacja
Aplikacja napisana w języku programowania Java.<br />
Baza danych oparta na H2 obsługiwana prze Hibernate.<br />
Aplikacja webowa z frontendem opartym na jsp przy użyciu spring MVC. 

## Wygląd aplikacji
Okno logowania
![screenshot](/sources/loginPage.jpg)

Strona głowa
![screenshot](/sources/homePage.jpg)

Lista doktorów
![screenshot](/sources/doctorsPage.jpg)

Rezerwacja wizyty u danego doktora
![screenshot](/sources/setupVisitPage.jpg)

Zakładka My Account przechowująca informacje o zalogowanym użytkowniku
![screenshot](/sources/myaccountPage.jpg)

Zakładka Diagnosis z lista diagnoz wystawionych danemu użytkownikowi
![screenshot](/sources/userDiagnosisPage.jpg)





