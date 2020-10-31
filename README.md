# ProgettoAN

## PRESENTAZIONE

Il progetto si occupa della creazione e sviluppo di un'applicazione Java che, attraverso un sistema di ricerca per paesi, permetta all'utente di consultare dati relativi all'andamento del virus Covid-19 nel mondo e nei vari paesi specifici. 


## DESCRIZIONE DEL FUNZIONAMENTO

![Diagramma Casi d'Uso (6)](https://user-images.githubusercontent.com/72570036/97040539-64672800-156e-11eb-8da6-c8f996763638.png)





Il sistema di ricerca si serve dell'API reference per effettuare il download dell'intero dataset riguardante le specifiche di ogni paese e i relativi dati, effettua successivamente il parsing dei valori ottenuti modellando gli stessi in formato JSON.
Dopo aver avviato l'applicazione, sarà possibile interrogarla attraverso un API testing, ad esempio POSTMAN, all'indirizzo http://localhost:8080.
L'applicazione permette di richiedere mediante API REST (GET o POST) con rotte distinte:

ROTTA  | TIPO | PARAMETRI | DESCRIZIONE
------------- | ------------- | -------------- | -----------
/countries | GET |      |dati riconoscitivi delle nazioni
/info | POST | slug | dati di una sola nazione
/char | POST | letter | dati delle nazioni che iniziano con la lettera inserita dall'utente
/period | POST | slug, from, to | dati delle nazioni in un determinato periodo selezionato dall'utente inserendo due date
/stats | POST | slug, statics | dati riguardo al calcolo di una tra media max min devStd e var


- /COUNTRIES: restituisce il nome di tutte le nazioni, relativo "slug", e codice ISO2.

- /INFO: metadata di una singola nazione selezionata dall'utente attraverso lo "slug" contenente: nome della nazione, sigla della nazione, latitudine, longitudine, casi totali, morti, guariti, casi attivi, data di acquisizione dati.  .

#### ESEMPI DI CHIAMATE

* [chiamata /countries](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20countries.png)

* [chiamata /info](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20info.png)

Grazie al metodo **readurl( )** avviene la lettura dei dati contenuti nell'API reference, utilizzando inoltre il metodo **parsing()** attraverso il quale convertiamo i dati presi in input in oggetti JSON di tipo states; successivamente  il metodo **slugTake( )** preleva l' attributo slug e lo inserisce all'interno di un arraylist di stringhe.
Entra ora in gioco il metodo **slugCheck( )** che ha la funzione di andare a confrontare la stringa inserita su Postman dall'utente con tutti gli slug dei paesi contenuti nell'arraylist; **slugCheck( )** è un metodo di tipo booleano che restituirà "false" (con relativo messaggio d'errore: "Il paese selezionato non fa parte della nostra lista!", gestito dalla classe Exception) in caso di slug non trovato, o "true" in caso positivo; in questa fase viene attivato il metodo **Parsing2( )** il quale trasformerà in formato JSON ciò che è stato letto dal metodo **readURL2( )**.
Tutto ciò avviene attraverso l'utilizzo della classe UrlService ed al suo metodo **getURL( )**, il quale permette di modificare l'URL predefinita aggiungendo lo slug inserito dall'utente accedendo quindi ai dati di una nazione specifica.

### FILTRI

Il programma permette di applicare due diversi filtri ai dati ottenuti dalle chiamate descritte in precedenza:

/CHAR: metadata di tutte le nazioni che iniziano con la lettera inserita dall'utente, contenenti: nome della nazione, sigla della nazione, latitudine, longitudine, casi totali, morti, guariti, casi attivi, data di acquisizione dati.

Tale chiamata permette di andare a confrontare un carattere inserito dall'utente attraverso Postman, con l'arraylist contente i nomi dei paesi ottenuto richiamando il metodo **slugtake()**, successivamente verrà attivato il metodo parsing2() il quale convertirà in formato JSON i dati di tutte quelle nazioni che hanno per iniziale il carattere selezionato dall'utente.

#### ESEMPI DI CHIAMATE /CHAR:

* [chiamata /char parte1](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20char%201.png)

* [chiamata /char parte2](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20char%202.png)

* [chiamata /char parte3](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20char%203.png)




/PERIOD: restituisce in base alla nazione selezionata attraverso lo slug, tutti i dati relativi a tale paese all'interno di un periodo specifico impostato dall'utente attraverso l'inserimento di due date valide.

Tale chiamata nel restituire i dati di una nazione filtrati in un determinato periodo effettua, inizialmente, un controllo sullo slug inserito tramite i metodi **slugtake()** e **slugcheck()**; in seguito grazie al metodo **datemanagement()** le date passate in input su Postman come stringhe, vengono convertite in formato Date, il quale ci permette di utilizzare le funzioni after e before per la gestione dell'ordine delle date inserite.
Nel caso in cui le date scelte siano comprese nel database, vengono convertiti tutti quei dati che rispettano il periodo selezionato; in caso contrario il sistema genera un eccezione che darà luogo ad un messaggio d'errore: "le date inserite non appartengono al periodo fornito dall'API reference".

#### ESEMPI DI CHIAMATE /PERIOD:

* [chiamata /period parte1](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20period%201.png)

* [chiamata /period parte2](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20period%202.png)



### STATISTICHE

- /STATS: restituisce in base alla nazione selezionata attraverso lo slug, il calcolo di una tra le seguenti statistiche: media, massimo, minimo, varianza e deviazione standard; su di un qualsiasi dato tra: casi totali, morti, guariti, casi attivi.

Tale chiamata effettua, inizialmente, un controllo sullo slug inserito tramite i metodi **slugtake()** e **slugcheck()**; in base al parametro **statics** inserito su Postman, la classe StatsService invocherà il metodo corrispondente contenuto nella classe Stats.

Data quindi una lista di nazioni, le statistiche disponibili sono le seguenti:

max      = il numero massimo tra i dati considerati.
min      = il numero minimo tra i dati considerati.
media    = la media tra i dati considerati.
devStd   = la deviazione standard.
var      = la varianza.

#### ESEMPI DI CHIAMATE /STATS:

* [chiamata /stats Casi confermati](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20statistiche%20Confirmed.png)

* [chiamata /stats Decessi](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20statistiche%20Deaths.png)

* [chiamata /stats Guariti](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20statistiche%20Recovered.png)

* [chiamata /stats Casi attivi](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20chiamata%20statistiche%20Active.png)

### EXCEPTION

La gestione delle exception è stata affidata alla classe madre Exception_Err (anch'essa estensione della classe RunTimeException), dalla quale derivano le classi NoCountry e NoDate, di cui abbiamo già descritto il funzionamento e i relativi messaggi d'errore; ne deriva anche la classe Notenought che gestisce l'eccezione nel caso in cui il file da scaricare durante la chiamata /char sia di dimensioni eccessive.
Inoltre, nel package Exception è presente la classe ExceptionManager la quale viene richiamata nel metodo **handler** del controller, che permette di visualizzare le eccezioni sull'applicativo Postman.

#### ESEMPI DI ECCEZIONI:

[NoCountry](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20eccezione%20paese%20non%20trovato.png)
[NoDate](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20eccezione%20data%20non%20corretta.png)
[Notenought](https://github.com/Andrea1708/ProgettoAN/blob/master/Esempi%20chiamate%20Postman/Esempio%20Eccezione%20file%20troppo%20grande.png)


## DIAGRAMMA DELLE CLASSI & PACKAGES


![Diagramma delle Classi ](https://user-images.githubusercontent.com/72570036/97728135-78141080-1ad1-11eb-873f-ff25c24aa0a1.png)




#### package OProject.ANSpringBootApplication;

![Diagramma delle classi sprigbootApplication](https://user-images.githubusercontent.com/72570036/97729847-659ad680-1ad3-11eb-890e-3bd4fd82a418.png)

#### package OProject.ANSpringBootApp.Controller;

![Diagramma delle Classi Controller (1)](https://user-images.githubusercontent.com/72570036/97728195-89f5b380-1ad1-11eb-8a82-7ba108054d8d.png)

#### package OProject.ANSpringBootApp.Model;

![Diagramma delle Classi Model](https://user-images.githubusercontent.com/72570036/97040594-71841700-156e-11eb-8a93-9c9fca576096.png)

#### package OProject.ANSpringBootApp.Service;

![Diagramma delle Classi Service (1)](https://user-images.githubusercontent.com/72570036/97729108-a1816c00-1ad2-11eb-9194-816b5469bedb.png)

#### package OProject.ANSpringBootApp.Util;

![Diagramma delle Classi Util (2)](https://user-images.githubusercontent.com/72570036/97728663-1d2ee900-1ad2-11eb-9cc1-91ff37c69c1e.png)

#### package OProject.ANSpringBootApp.Exception;

![Diagramma delle Classi Exception 2](https://user-images.githubusercontent.com/72570036/97728433-d640f380-1ad1-11eb-9ef6-245a7e81bdba.png)

![Diagramma delle Classi Exception 1 ](https://user-images.githubusercontent.com/72570036/97728439-d6d98a00-1ad1-11eb-935e-260b3657f75d.png)

#### package OProject.ANSpringBootApp.JSON;

![Diagramma delle Classi JSON (3)](https://user-images.githubusercontent.com/72570036/97728485-e8bb2d00-1ad1-11eb-8b07-148d37d7ba5c.png)

## DIAGRAMMA DELLE SEQUENZE

Diagrammi delle sequenze che dettagliano il funzionamento delle chiamate.

#### getallcountries

![Diagramma in Sequenza Chiamata1](https://user-images.githubusercontent.com/72570036/97055954-1f4fef80-1588-11eb-882d-391765220545.png)

#### datescountry

![Diagramma in sequenza chiamata 2](https://user-images.githubusercontent.com/72570036/97730380-11dcbd00-1ad4-11eb-9116-50b9c3ea3cae.png)

#### listcountry

![Diagramma in sequenza chiamata 3](https://user-images.githubusercontent.com/72570036/97730372-10ab9000-1ad4-11eb-8224-3c1b29190d6a.png)

#### valuescountry

![Diagramma in sequenza chiamata 4](https://user-images.githubusercontent.com/72570036/97730377-11442680-1ad4-11eb-89ec-b4104bd26d66.png)

#### getstatics

![Diagramma in sequenza chiamata 5](https://user-images.githubusercontent.com/72570036/97730378-11442680-1ad4-11eb-9caa-1b134d291a24.png)


## SOFTWARE UTILIZZATI

Eclipse - ambiente di sviluppo integrato

Spring Boot - framework per sviluppo applicazioni Java

Maven - strumento di gestione di progetti

Postman - piattaforma per lo sviluppo API

UML Designer - strumento di modellazione grafica



## NOTE 

Gli obiettivi sono stati aggiornati successivamente alla consegna del compito, in seguito ad un ricevimento svolto, poichè impossibilitati allo svolgimento degli obiettivi iniziali che presupponevano l'utilizzo delle funzioni premium all'interno dell'API dato.
Le difficoltà che sono emerse durante la programmazione sono state:

- Nella chiamata "/char" nel momento in cui vengono inserite delle lettere (ad esempio "a","b","s"..) alle quali corrispondono più di 10 paesi, il server ritorna un errore dovuto all'eccessiva dimensione del file da scaricare, non riuscendo a compensare quest'errore abbiamo fatto si che nel momento in cui la lista dei paesi è maggiore di 10, venga generata un'eccezione che ci informa di inserire un' altra lettera.
  
"Ingegneria Informatica e dell'Automazione" - Università Politecnica delle Marche

Programmazione ad Oggetti A.A.2019/2020 - autori: Andrea Belleggia, Nicola Marziali
