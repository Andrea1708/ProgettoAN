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
\countries | GET  | dati riconoscitivi delle nazioni
\live\country | GET | dati relativi al covid 19 per ogni nazione
\live\country\slug | POST | dati di una sola nazione


- /COUNTRIES: restituisce il nome di tutte le nazioni, relativo "slug", e codice ISO2.

- /LIVE/COUNTRY: restituisce il dataset completo di tutti le nazioni contenente i seguenti dati circa la situazione sanitaria dovuta al virus Covid-19: Nome della nazione, Sigla, Latitudine, Longitudine, Casi confermati totali, Morti, Guariti, Attivi, Data di riferimento.

- /LIVE/COUNTRY/SLUG: metadata di una singola nazione selezionata dall'utente attraverso lo "slug" contenente i dati sopracitati.

FILTRI



- metadata di un paese selezionato contenenti i dati sopracitati riferiti ad una specifica nazione richiesta dall'utente.

Grazie al metodo **readurl( )** otteniamo degli oggetti JSON di tipo states, da qui il metodo **SlugTake( )** preleva tali attributi e li inserisce all'interno di un arraylist di stringhe.
Entra ora in gioco il metodo **SlugCheck( )** che ha la funzione di andare a confrontare la stringa inserita su Postman dall'utente con tutti gli slug dei paesi contenuti nell'arraylist; **SlugCheck( )** è un metodo di tipo booleano che restituirà "false" (con relativo messaggio d'errore, gestito dalle Exception) in caso di slug non trovato, o "true" in caso positivo, in questa fase viene attivato il metodo **Parsing2( )** il quale trasformerà in formato JSON ciò che è stato letto dal metodo **readURL2( )**.
Tutto ciò avviene attraverso l'utilizzo della classe UrlService ed al suo metodo **getURL( )**, il quale permette di modificare l'URL predefinita aggiungendo lo slug inserito dall'utente accedendo quindi ai dati di una nazione specifica



## DIAGRAMMA DELLE CLASSI & PACKAGES


![Diagramma delle Classi Packages](https://user-images.githubusercontent.com/72570036/97038665-72677980-156b-11eb-827c-fdd13dd41b51.png)


#### package OProject.ANSpringBootApp;

![Diagramma delle Classi Util](https://user-images.githubusercontent.com/72570036/97040206-ec006700-156d-11eb-8b20-0b14d9f6a81c.png)

#### package OProject.ANSpringBootApp.Controller;

![Diagramma delle Classi Controller](https://user-images.githubusercontent.com/72570036/97040664-8e204f00-156e-11eb-97ea-1d52570dd74f.png)

#### package OProject.ANSpringBootApp.Model;

![Diagramma delle Classi Model](https://user-images.githubusercontent.com/72570036/97040594-71841700-156e-11eb-8a93-9c9fca576096.png)

#### package OProject.ANSpringBootApp.Service;

![Diagramma delle Classi Service](https://user-images.githubusercontent.com/72570036/97039954-8f04b100-156d-11eb-89bf-e55433512609.png)

#### package OProject.ANSpringBootApp.Exception;

![Diagramma delle Classi Exception](https://user-images.githubusercontent.com/72570036/97039786-44833480-156d-11eb-85f5-fb06a7f4c06e.png)

#### package OProject.ANSpringBootApp.JSON;

![Diagramma delle Classi JSON](https://user-images.githubusercontent.com/72570036/97039796-46e58e80-156d-11eb-8bf5-67c4690697f6.png)



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
