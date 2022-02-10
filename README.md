# Applicativo di Simulazione Monitoraggio Oliveto
L’elaborato simula in maniera semplicistica la manutenzione di un Oliveto.
Attraverso il software è possibile monitorare un terreno adibito alla coltivazione degli ulivi, potendoli inserire o rimuovere  dal campo tenendo
conto delle dimensioni del terreno stesso.
Possono essere coltivate quattro varietà di ulivi: frantoio, leccino, moraiolo e pendolino; ognuno con le proprie caratteristiche in termini di
produzione di olive e resa finale di olio. 
Un parametro fondamentale per l’olivo è la decisione sul tipo di coltivazione: se biologica oppure no.
Ogni pianta è sottoposta a monitoraggio sul proprio stato di salute, rilevando vari tipi di malattie (batteriche, fungine ecc.) e a seconda della scelta
del parametro di cui parlavamo precedentemente verrà scelta una strategia antiparassitaria adeguata. Quando un olivo si ammala subisce una perdita della produzione delle olive se  non viene curato, altrimenti, a seconda della cura si ha sempre una diminuzione di produzione ma più lieve (per semplicità la percentuale del danno è stata impostata a 5 nel caso  di utilizzo di pesticidi e a 10 nel caso di cura biologica, mentre nel momento in cui la pianta si ammala viene impostato ad un valore random compreso tra 0 e 50). 
Viene effettuato anche un controllo, attraverso delle analisi chimiche del suolo, per l’elaborazione di un corretto piano di concimazione. I microelementi analizzati sono i principali, ovvero l’azoto (N), il fosforo (P) e il potassio (K), nel caso in cui risulti una carenza di uno dei tre verrà rintegrato nel suolo attraverso una concimazione mirata alla reimmisione dell’elemento carente.


### Design Pattern utilizzati 
   * **Observer** : Ulitizzato in due casi, la prima relazione tra la classe **Ulivo** (Subject) e **Monitoraggio Ulivo** (Observer);
		     la seconda relazione tra **Campo** (Sunject) e **MonitoraggioTerreno** (Observer)
   * **Strategy** : L'interfaccia **CuraMalattiaUlivo** generalizza le due sottoclassi **CuraBiologica** e **Pesticidi**


La descrizione dell'intero programma nel file `Relazione.docx`
