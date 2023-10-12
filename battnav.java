import java.util.Scanner;
 class battnav{
public static void main(String[] arg){
Scanner tastiera = new Scanner(System.in);
int[][] utente=new int[11][11];
int[][] computer=new int[11][11];
int[] mossac=new int[2];
int scelta=0;
boolean mosscom=false;
boolean vittoria=true;
boolean vittoriau=true;
boolean vittoriac=true;
do{
System.out.println("scegli se scelta 1) a mano    2)automatica");
 scelta=tastiera.nextInt();
}while(scelta!=1&&scelta!=2);
switch(scelta){
    case 1:
metodi.sceltanavi(utente);
break;
case 2:
metodi.creauto(utente);
}
metodi.creauto(computer);
System.out.println("Utente:");
metodi.stampa(utente);
System.out.println();
System.out.println("Computer:");
metodi.stampac(computer);
//metodi.stampa(computer);
do{
    vittoria=true;
    vittoriau=true;
    vittoriac=true;
metodi.mossautente(computer);
mosscom=metodi.mossacomputer(utente,mosscom,mossac);
System.out.println("Utente:");

metodi.stampa(utente);
System.out.println();
System.out.println("Computer:");
metodi.stampac(computer);
//metodi.stampa(computer);
vittoriac=metodi.vittoria(utente,vittoria);
//System.out.println(vittoriac+ "  "+vittoriau);
vittoriau=metodi.vittoria(computer,vittoria);
//System.out.println(vittoriau+ "  "+vittoriac);
}while(!vittoriau&&!vittoriac);
if(vittoriau)
System.out.println("Hai vinto");
else
if(vittoriac)
System.out.println("Hai perso");
else
System.out.println("Hai pareggiato");
}
}