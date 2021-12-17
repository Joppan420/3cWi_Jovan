package at.ran.basics;

import java.util.HashMap;
import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caesar c = new Caesar(3);
        String ceasar = scanner.next();
        System.out.println(c.verschluessele(ceasar));
        System.out.println(c.entschluessele(c.verschluessele(ceasar)));
    }
        HashMap<Character, Character> verschluesseln;
        HashMap<Character, Character> entschluesseln;

        public Caesar(int verschiebung) {
            super();
            verschluesseln = new HashMap<Character, Character>();
            entschluesseln = new HashMap<Character, Character>();

            initCaeser(verschiebung);
        }

        public String entschluessele(String text){
            return uebersetze(text, entschluesseln);
        }

        public String verschluessele(String text){
            return uebersetze(text, verschluesseln);
        }

        private String uebersetze(String text, HashMap<Character, Character> alphabet){
            String keineKleinbuchstaben = text.toUpperCase().replace(" ", "");

            String ausgabe = " ";

            for (int i = 0; i < keineKleinbuchstaben.length(); i++) {
                ausgabe += alphabet.get(keineKleinbuchstaben.charAt(i));
            }

            return ausgabe;
        }

        private void initCaeser(int verschiebung) {
            for(char schleife = 'A'; schleife <='Z'; schleife++){
                if((schleife + verschiebung) <= 'Z'){
                    verschluesseln.put(schleife, (char) (schleife + verschiebung));
                    entschluesseln.put((char) (schleife + verschiebung), schleife);
                }else{
                    verschluesseln.put(schleife, (char) (schleife + verschiebung -26));
                    entschluesseln.put((char) (schleife + verschiebung -26), schleife);
                }


            }
        }
    }
//}


