# ProgettoAN

## PRESENTAZIONE

Il progetto si occupa della creazione e sviluppo di un'applicazione Java che, attraverso un sistema di ricerca per paesi, permetta all'utente di consultare dati relativi all'andamento del virus Covid-19 nel mondo e nei vari paesi specifici. 


## DESCRIZIONE DEL FUNZIONAMENTO

![Diagramma Casi d'Uso](https://user-images.githubusercontent.com/72570036/97039208-5912fd00-156c-11eb-803f-86efd2c904ae.png)




Il sistema di ricerca si serve dell'API reference per effettuare il download dell'intero dataset riguardante le specifiche di ogni paese e i relativi dati, effettua successivamente il parsing dei valori ottenuti modellando gli stessi in formato JSON.
Dopo aver avviato l'applicazione, sarà possibile interrogarla attraverso un API testing, ad esempio POSTMAN, all'indirizzo http://localhost:8080.
L'applicazione permette di richiedere mediante API REST (GET o POST) con rotte distinte:

ROTTA  | TIPO | DESCRIZIONE
------------- | ------------- | --------------
\countries | GET  | dati riconoscitivi delle nazioni
\live\country | GET | dati relativi al covid 19 per ogni nazione
\live\country\slug | POST | dati di una sola nazione


- /COUNTRIES: restituisce il nome di tutte le nazioni, relativo "slug", e codice ISO2.

- /LIVE/COUNTRY: restituisce il dataset completo di tutti le nazioni contenente i seguenti dati circa la situazione sanitaria dovuta al virus Covid-19: Nome della nazione, Sigla, Latitudine, Longitudine, Casi confermati totali, Morti, Guariti, Attivi, Data di riferimento.

- /LIVE/COUNTRY/SLUG: metadata di una singola nazione selezionata dall'utente attraverso lo "slug" contenente i dati sopracitati.

FILTRI



- metadata di un paese selezionato contenenti i dati sopracitati riferiti ad una specifica nazione richiesta dall'utente.

Grazie al metodo readurl( ) otteniamo degli oggetti JSON di tipo states, da qui il metodo SlugTake( ) preleva tali attributi e li inserisce all'interno di un arraylist di stringhe.
Entra ora in gioco il metodo SlugCheck( ) che ha la funzione di andare a confrontare la stringa inserita su Postman dall'utente con tutti gli slug dei paesi contenuti nell'arraylist; SlugCheck( ) è un metodo di tipo booleano che restituirà "false" (con relativo messaggio d'errore, gestito dalle Exception) in caso di slug non trovato, o "true" in caso positivo, in questa fase viene attivato il metodo Parsing2( ) il quale trasformerà in formato JSON ciò che è stato letto dal metodo readURL2( ).
Tutto ciò avviene attraverso l'utilizzo della classe UrlService ed al suo metodo getURL( ), il quale permette di modificare l'URL predefinita aggiungendo lo slug inserito dall'utente accedendo quindi ai dati di una nazione specifica



## DIAGRAMMA DELLE CLASSI & PACKAGES


![Diagramma delle Classi Packages](https://user-images.githubusercontent.com/72570036/97038665-72677980-156b-11eb-827c-fdd13dd41b51.png)



#### package OProject.ANSpringBootApp.Controller;

La classe Controller gestisce le richieste dell'utente ed eventuali eccezioni.

#### package OProject.ANSpringBootApp.Model;



#### package OProject.ANSpringBootApp.Service;



La classe urlService si occupa di modificare l'URL cui indirizzarsi a seconda della richiesta effettuata dall'utente tramite lo slug.



## SOFTWARE UTILIZZATI

Eclipse - ambiente di sviluppo integrato

Spring Boot - framework per sviluppo applicazioni Java

Maven - strumento di gestione di progetti

Postman - piattaforma per lo sviluppo API

UML Designer - strumento di modellazione grafica



## NOTE 

Gli obiettivi sono stati aggiornati successivamente alla consegna del compito, in seguito ad un ricevimento svolto, poichè impossibilitati allo svolgimento degli obittivi iniziali che presupponevano l'utilizzo delle funzioni premium all'interno dell'API dato.

"Ingegneria Informatica e dell'Automazione" - Università Politecnica delle Marche

Programmazione ad Oggetti A.A.2019/2020 - autori: Andrea Belleggia, Nicola Marziali
