# ProgettoAN

## PRESENTAZIONE

Il progetto si occupa della creazione e sviluppo di un'applicazione Java che, attraverso un sistema di ricerca per paesi, permetta all'utente di consultare dati relativi all'andamento del virus Covid-19 nel mondo e nei vari paesi specifici. 


## DESCRIZIONE DEL FUNZIONAMENTO

![Diagramma Casi d'Uso (6)](https://user-images.githubusercontent.com/72570036/97040539-64672800-156e-11eb-8da6-c8f996763638.png)





Il sistema di ricerca si serve dell'API reference per effettuare il download dell'intero dataset riguardante le specifiche di ogni paese e i relativi dati, effettua successivamente il parsing dei valori ottenuti modellando gli stessi in formato JSON.
Dopo aver avviato l'applicazione, sarà possibile interrogarla attraverso un API testing, ad esempio POSTMAN, all'indirizzo http://localhost:8080.
L'applicazione permette di richiedere mediante API REST (GET o POST) con rotte distinte:

ROTTA  | TIPO | DESCRIZIONE
------------- | ------------- | --------------
/countries | GET  | dati riconoscitivi delle nazioni
/info | POST | dati di una sola nazione


- /COUNTRIES: restituisce il nome di tutte le nazioni, relativo "slug", e codice ISO2.

- /INFO: metadata di una singola nazione selezionata dall'utente attraverso lo "slug" contenente: nome della nazione, sigla della nazione, latitudine, longitudine, casi totali, morti, guariti, casi attivi, data di acquisizione dati.  .

#### FILTRI

- metadata di un paese selezionato contenente i dati sopracitati riferiti ad una specifica nazione richiesta dall'utente.

Grazie al metodo **readurl( )** otteniamo degli oggetti JSON di tipo states, da qui il metodo **SlugTake( )** preleva tali attributi e li inserisce all'interno di un arraylist di stringhe.
Entra ora in gioco il metodo **SlugCheck( )** che ha la funzione di andare a confrontare la stringa inserita su Postman dall'utente con tutti gli slug dei paesi contenuti nell'arraylist; **SlugCheck( )** è un metodo di tipo booleano che restituirà "false" (con relativo messaggio d'errore, gestito dalla classe Exception) in caso di slug non trovato, o "true" in caso positivo, in questa fase viene attivato il metodo **Parsing2( )** il quale trasformerà in formato JSON ciò che è stato letto dal metodo **readURL2( )**.
Tutto ciò avviene attraverso l'utilizzo della classe UrlService ed al suo metodo **getURL( )**, il quale permette di modificare l'URL predefinita aggiungendo lo slug inserito dall'utente accedendo quindi ai dati di una nazione specifica.

- metadata di un paese selezionato contenente i dati sopracitati a partire da una specifica data richiesta dall'utente.

Il metodo **GetURL2( )** come nel caso precedente, va a modificare l'URL predefinita aggiungendo nome della nazione e data scelta, inseriti anche questa volta dall'utente, rendendo cosi tale URL leggibile dal metodo **ReadURL3( )**, il quale richiamerà il metodo **Parsing3( )**; esso svolge il compito di restituire un arraylist contenente i dati relativi al virus Covid-19 dalla data selezionata in poi, della nazione specificata.
Durante tale processo avviene una verifica sull'inserimento della nazione, nel caso non fosse una nazione esistente nel database, verrà mostrato  un messaggio di errore personalizzato, sempre gestio dalla classe Exception




## DIAGRAMMA DELLE CLASSI & PACKAGES


![Diagramma delle Classi ](https://user-images.githubusercontent.com/72570036/97728135-78141080-1ad1-11eb-873f-ff25c24aa0a1.png)




#### package OProject.ANSpringBootApp;

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

#### getcountries

![Diagramma in Sequenza Chiamata1](https://user-images.githubusercontent.com/72570036/97055954-1f4fef80-1588-11eb-882d-391765220545.png)

#### getlivecountryslug

![Diagramma in sequenza chiamata 2](https://user-images.githubusercontent.com/72570036/97729692-3d12dc80-1ad3-11eb-8107-2029a2983c8d.png)

#### getlivecountrydate

![Diagramma in sequenza chiamata 3](https://user-images.githubusercontent.com/72570036/97729693-3d12dc80-1ad3-11eb-854e-a36d73e30235.png)

#### get

![Diagramma in sequenza chiamata 4](https://user-images.githubusercontent.com/72570036/97729681-3be1af80-1ad3-11eb-95e0-e8a6a903f2b8.png)

#### get

![Diagramma in sequenza chiamata 5](https://user-images.githubusercontent.com/72570036/97729690-3c7a4600-1ad3-11eb-942e-3d2a5c24940c.png)


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
