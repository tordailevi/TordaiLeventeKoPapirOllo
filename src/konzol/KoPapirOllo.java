package konzol;

import java.util.Scanner;
import java.util.Random;

public class KoPapirOllo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String tipp = "";
        while (!tipp.equalsIgnoreCase("Kő") && !tipp.equalsIgnoreCase("Papír") && !tipp.equalsIgnoreCase("Olló")){
            System.out.println("Kő papír olló?! Add meg a választásod: ");
            tipp = scanner.nextLine();
        }
        
        int gep = (int) (Math.random() * 3) + 1;
        String gepTippje = "";
        
        if (gep == 1){
            gepTippje = "kő";
        }else if (gep == 2){
            gepTippje = "papír";
        }else if (gep == 3){
            gepTippje = "olló";
        }
        
        String felhasznaloTippje = tipp.toLowerCase();
        
        if (felhasznaloTippje.equals(gepTippje)) {
            System.out.println("Döntetlen!");
        } else if (felhasznaloTippje.equals("kő") && gepTippje.equals("papír")) {
            System.out.println("Vesztettél!");
        } else if (felhasznaloTippje.equals("papír") && gepTippje.equals("olló")) {
            System.out.println("Vesztettél!");
        } else if (felhasznaloTippje.equals("olló") && gepTippje.equals("kő")) {
            System.out.println("Vesztettél!");
        } else if (felhasznaloTippje.equals("papír") && gepTippje.equals("kő")) {
            System.out.println("Győztél!");
        } else if (felhasznaloTippje.equals("olló") && gepTippje.equals("papír")) {
            System.out.println("Győztél!");
        } else if (felhasznaloTippje.equals("kő") && gepTippje.equals("olló")) {
            System.out.println("Győztél!");
        }
    }
    
}
