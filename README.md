# ProgettoAN

PRESENTAZIONE

Il progetto si occupa della creazione e sviluppo di un'applicazione Java che, attraverso un sistema di ricerca per paesi, permetta all'utente di consultare dati relativi all'andamento del virus Covid-19 nel mondo e nei vari paesi specifici. 

DESCRIZIONE DEL FUNZIONAMENTO



Il sistema di ricerca si serve dell'API reference per effettuare il download dell'intero dataset riguardante le specifiche di ogni paese e i relativi dati, effettua successivamente il parsing dei valori ottenuti modellando gli stessi in formato JSON.
L'applicazione permette di richiedere mediante API REST (GET o POST) con rotte distinte:

- /COUNTRIES: nome di tutte le nazioni, relativo "slug", e codice ISO2.

- /LIVE/COUNTRY/SLUG: metadata di un paese selezionato dall'utente attraverso lo "slug" contenente i seguenti dati circa la situazione sanitaria dovuta al virus Covid-19: Nome della nazione, Sigla, Latitudine, Longitudine, Casi confermati totali, Morti, Guariti, Attivi, Data di riferimento.

-metadata di un paese selezionato contenenti i dati sopracitati riferiti ad una specifica data richiesta dall'utente.

NOTE 

Gli obiettivi sono stati aggiornati successivamente alla consegna del compito, in seguito ad un ricevimento svolto, poichè impossibilitati allo svolgimento degli obittivi iniziali che presupponevano l'utilizzo delle funzioni premium all'interno dell'API dato.

"Ingegneria Informatica e dell'Automazione" - Università Politecnica delle Marche

Programmazione ad Oggetti A.A.2019/2020
