Aufgabe 1)
Vorstellung der Domäne
Die Domäne ist ein Konfigurationstool für das Smarthome. 
Wie sind Sie vorgegangen, um 5 typische Konfigurationen abzuleiten? 
- Minimale Konfiguration
- Maximale Konfiguration
- Zufällig
Warum haben Sie sich für diese Domäne entschieden?
Da ich interessiert an dem Thema Smarthome bin.
Gibt es bereits eine Implementierung, die Sie nutzen möchten?
Nein, ich habe dazu noch keine Implentierung gefunden.


Aufgabe 2)
Welche Fehler haben Sie beim Testen gefunden? 
Ich habe in den zwei implementierten Domänen keine Fehler gefunden. Es gab lediglich Probleme die Constrains zu programmieren, da sich hier ein paar Fehler eingeschlichen haben. 
Wie sind Sie beim Programmieren vorgegangen?
Ich habe mir zunächst überlegt welche zwei Features ich realisieren möchte. Anschließend welche Ausgabe diese haben sollen. Danach wie ich die Parameter während der Laufzeit ändern möchte. 
Haben Sie die Parameter nacheinander entwickelt? 
Nein, da sich die Features sehr ähnlich sind habe ich die Parameter zusammen entwickelt
Welche Änderungen mussten Sie vornehmen?
Keine Änderungen, da neue Implementierung 
Welche der 5 Konfigurationen verhalten sich identisch?
-MarleenSmartHome.xml und TobiasSmartHome.xml
-RodrigosSmartHome.xml und SvenjaSmartHome.xml
-SimonSmartHome.xml


Aufgabe 3)
Welche Fehler haben Sie beim Testen gefunden? 
Ich habe in den 4 implementierten Features keine Fehler gefunden. Es gab lediglich Probleme mit der Syntax vom Präprozessor beim programmieren. Ich musste die Laufzeitvariablität rausnehmen, da dies nicht mit dem Präprozessor geklappt hat.
Wie haben Sie Stellen lokalisiert an denen die neuen Features eingefügt werden mussten?
Durch ausprobieren. Zunächst wollte ich die Features in bei der Laufzeitvariablität integrieren, allerdings hat das nicht mit dem Präprozessor funktioniert. Anschließend habe ich die Laufzeitvariablität rausgenommen und die Features in der Main() eingefügt. 
Gibt es verschachtelte Annotationen?
Ja, gibt es. 
Wie viele Annotationen gibt es maximal zu einem Feature?
2 Annotationen.


Aufgabe 4)
Welche Fehlerhaben Sie beim Testen gefunden? 
Ich habe in den Implementierungen keine Fehler gefunden. Allerdings hat die Konsolenausgabe nicht funktioniert. (Ich habe das zusätzlich mit dem Beispielprojekte probiert, dort hat ebenfalls die Konsolenausgabe nicht funktioniert)
Wie aufwändig ist es, Plugins zu erstellen? 
Es ist nicht sehr aufwendig, da die Ordner, der ausgewählten Features automatisch erstellt werden. 
Wie oft mussten Sie nachträglich das Framework oder die Interfaces anpassen? 
Nachdem ich ein paar test Interfaces erstellt hatte, musste ich bei den richtigen Interfaces nachträglich eher wenig anpassen. 
Wie viele Interfaces gibt es in Ihrer Implementierung? 
Es gibt 4 Interfaces in meiner Implementierung
Welche Anpassungen könnten beim Hinzufügen weiterer Plugins nötig werden?
Für das hinzufügen weiterer Plugins müsste man weiter Interfaces hinzufügen. 


Aufgabe 5)
Welche Fehler haben Sie beim Testen gefunden? 
Keine
Welche Features waren einfach zu modularisieren, welche eher aufwändig und warum?
Alle Features waren einfach zu modlularisieren, da das Projekt sehr klein gehalten wurde. 
War es für die Implementierung eines Feature Moduls nötige, andere Features zu ändern?
Nein
Mussten Sie viel vorausplanen oder waren alle neuen Features leicht umzusetzen?
Nein
Gibt es - neben der Basisimplementierung - Features, die neue Klassen einführen oder bestehende Methoden verfeinern?
Ja