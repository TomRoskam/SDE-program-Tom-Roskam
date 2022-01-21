# SDE-program-Tom-Roskam

**Programma**</br></br>
Er wordt een route voorgeschoteld welke kan worden afgelegd met ofwel de fiets, ofwel de auto. Middels de CLI kan hier op worden geantwoord.
Afhankelijk van het antwoord wordt het gekozen voertuig 'gebouwd' (creational design pattern, Factory Method). Je bent natuurlijk benieuwd hoe lang je er over doet om de route af te leggen. Een auto doet dit sneller dan een fiets. Het verschil tussen minuten of seconden (behavioral design pattern, Strategy). Dit vraagt om een juiste strategie voor het tonen van de tijdsformattering. Dit alles zijn veel verschillende stappen welke moeten worden afghandeld (structural design pattern, Facade).

**Creational design pattern**</br></br>
Er is gekozen voor een Factory Method als design pattern. Deze wordt ingezet om de gekozen voertuigen te bouwen. Dit kan ofwel een fiets, ofwel een auto zijn. Dit wordt gedaan aan de hand van de ingegeven keuze door de client.

**Behavioral design pattern**</br></br>
Afhankelijk van het gekozen voertuig wordt er een berekening gemaakt voor de tijd wat het kost om de afstand af te leggen. Door het verschil in snelheid van de voertuigen is het verschil tussen minuten en seconden. Dit vraagt om een andere strategie voor het weergeven van het tijdsformat. Hierom is er gekozen voor een Strategy pattern.

**Structural design pattern**</br></br>
Om dit alles in goede banen te leiden is er een Facade design pattern. Deze zorgt ervoor dat de verschillende stappen in de juiste volgorde worden uitgevoerd. Het zorgt ervoor dat een complexe taak versimpeld wordt.
