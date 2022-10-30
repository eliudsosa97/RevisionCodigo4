//Primero se importa el scanner
//Se quitaron signos que estaban sobrando
// Se agregaron correctamente los corchetes faltantes
// Se agregó "public static void main" 
//Se agregó "System.in" en el scanner
//Se cierran los scanner con .close
//Se cambió "==" por ".equals" ya que se van a comparar strings
//Agregué algunos Syso para ver si estaba funcionando correctamente el scanner

 package eliud.sosa;

import java.util.Scanner;

public class codigo4 {
	public static void main(String []argh) {
	
    Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);
    String j2 = s2.nextLine();
//    System.out.println(j1);
//    System.out.println(j2);
    
    int g = 2;
    if (j1.equals(j2)) {
      System.out.println("Empate");
    } else {
     
      switch(j1) {
        case "piedra" :
          if (j2.equals("tijeras")) {
            g = 1;}
            break;
          

        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
            break;
          }
        case "tijeras":
          if (j2.equals("papel")) {
            g = 1;
            break;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
      s.close();
      s2.close();
    }
    
  
	}
}
