import java.util.Random;

public class MotivationsSpruch {
    public static void main(String[] args) {
        String[] sprueche = {
                "Ein Bug ist kein Fehler, sondern eine unerwartete Feature-Anfrage.",
                "Java ist wie C++: Du schießt dir nicht direkt in den Fuß, aber Java baut dir eine riesige Fabrik, " +
                        "die dir nach 20 Klassen eine FootShootingException wirft.",
                "'Write once, run everywhere' bedeutet meistens 'Write once, debug everywhere'.",
                "Debugging: Wie ein Detektiv sein, der auch der Mörder ist.",
                "Ein NullPointerException ist Javas Art zu sagen: 'Ich weiß genau, was du tun wolltest, aber ich weigere mich.'",
                "Programmierer sind Organismen, die Koffein in Code umwandeln.",
                "Es gibt 10 Arten von Menschen auf der Welt: Die, die Binärcode verstehen, und die, die es nicht tun.",
                "Code ohne Fehler ist wie ein Einhorn: Hübsch anzusehen, aber existiert leider nicht.",
                "System.out.println(\"Hier bin ich 1\"); ist das mächtigste Debugging-Tool des Universums.",
                "Warum tragen Java-Programmierer Brillen? Weil sie nicht C# (see sharp) sehen können.",
                "Mein Code funktioniert nicht und ich weiß nicht warum. Mein Code funktioniert und ich weiß nicht warum.",
                "Das beste Passwort ist der Name einer Java-Klasse: AbstractSingletonProxyFactoryBean errät niemand.",
                "Kompiliert ohne Warnungen beim ersten Versuch? Da stimmt gewaltig etwas nicht.",
                "In Java ist alles ein Objekt. Außer deine Freizeit, die ist null.",
                "Try-Catch-Blöcke sind die Pflaster der Softwareentwicklung: Einfach alles einwickeln und hoffen, dass es aufhört zu bluten.",
                "Ein Algorithmus ist die Schritt-für-Schritt-Anleitung, mit der ein Computer Fehler macht, auf die der Mensch nie gekommen wäre.",
                "Vererbung ist, wenn du das Chaos deiner Eltern erbst und noch eine eigene Exception hinzufügst.",
                "Hardware ist der Teil des Computers, den man schlagen kann. Software ist der Teil, den man nur beschimpfen kann.",
                "Kommentare im Code sind wie Schilder an der Straße: Sie sagen dir, wo du bist, stimmen aber oft nicht mehr mit der Realität überein.",
                "Ein Garbage Collector ist nicht die Müllabfuhr, sondern das schlechte Gewissen deines Arbeitsspeichers.",
                "// TODO: Später aufräumen – Die größte Lüge der Softwaregeschichte.",
                "Interfaces sind wie Neujahrsvorsätze: Sie definieren genau, was gemacht werden soll, aber implementiert wird es erst später (oder nie).",
                "Es gibt zwei Möglichkeiten, fehlerfreien Code zu schreiben. Aber nur die dritte funktioniert.",
                "Public, Private, Protected: Java sorgt dafür, dass deine Variablen mehr Privatsphäre haben als du selbst."
        };

        Random zufall = new Random();

        while (true) {
            int index = zufall.nextInt(sprueche.length);

            System.out.println("\nDein Spruch alle 10 Sekunden:");
            System.out.println(sprueche[index]);
            System.out.println("---------------------------------------------------------------------------------------------");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.err.println("Schleife wurde unterbrochen.");
                break;
            }
        }
    }
}