## ProgettoAN

# PRESENTAZIONE

Il progetto si occupa della creazione e sviluppo di un'applicazione Java che, attraverso un sistema di ricerca per paesi, permetta all'utente di consultare dati relativi all'andamento del virus Covid-19 nel mondo e nei vari paesi specifici. 

# DESCRIZIONE DEL FUNZIONAMENTO


![Diagramma Casi d'Uso](https://user-images.githubusercontent.com/72570036/97028990-17c72100-155d-11eb-8e78-2fbc0315bc77.png)



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



- metadata di un paese selezionato contenenti i dati sopracitati riferiti ad una specifica data richiesta dall'utente.

# DIAGRAMMA DELLE CLASSI & PACKAGES

![Diagramma delle Classi Package](https://user-images.githubusercontent.com/72570036/97029644-03cfef00-155e-11eb-995e-210779fc5580.png)

package OProject.ANSpringBootApp.Controller;

package OProject.ANSpringBootApp.Model;

![Diagramma delle Classi Model](https://user-images.githubusercontent.com/72570036/97033031-fcf7ab00-1562-11eb-81f9-28f5edb93847.png)

package OProject.ANSpringBootApp.Service;

![Diagramma delle Classi Service](https://user-images.githubusercontent.com/72570036/97033041-fff29b80-1562-11eb-9bb6-8705cb2dfa80.png)

# SOFTWARE UTILIZZATI

Eclipse - ambiente di sviluppo integrato

Spring Boot - framework per sviluppo applicazioni Java

Maven - strumento di gestione di progetti

Postman - piattaforma per lo sviluppo API

UML Designer - strumento di modellazione grafica


# NOTE 

Gli obiettivi sono stati aggiornati successivamente alla consegna del compito, in seguito ad un ricevimento svolto, poichè impossibilitati allo svolgimento degli obittivi iniziali che presupponevano l'utilizzo delle funzioni premium all'interno dell'API dato.

"Ingegneria Informatica e dell'Automazione" - Università Politecnica delle Marche

Programmazione ad Oggetti A.A.2019/2020 - autori: Andrea Belleggia, Nicola Marziali
