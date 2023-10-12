import java.util.Scanner;
public class metodi {
    public static void stampa(int[][] tab){
        System.out.println("   A B C D E F G H I J");
for(int riga=0,i=0,j=0;riga<10;riga++){
 int colonna=0;
for(;colonna<10;colonna++){
    if(colonna==0){
    if(riga==0)
    System.out.print(" 1 ");
    if(riga==1)
    System.out.print(" 2 ");
    if(riga==2)
    System.out.print(" 3 ");
    if(riga==3)
    System.out.print(" 4 ");
    if(riga==4)
    System.out.print(" 5 ");
    if(riga==5)
    System.out.print(" 6 ");
    if(riga==6)
    System.out.print(" 7 ");
    if(riga==7)
    System.out.print(" 8 ");
    if(riga==8)
    System.out.print(" 9 ");
    if(riga==9)
    System.out.print("10 ");
    }
if(tab[riga][colonna]==0)
    System.out.print("  ");
if(tab[riga][colonna]==1)
System.out.print("O ");
if(tab[riga][colonna]==2)
System.out.print("X ");
if(tab[riga][colonna]==3)
System.out.print("N ");
}
System.out.println();



}



    }
    public static void stampac(int[][] tab){
        System.out.println("   A B C D E F G H I J");
for(int riga=0,i=0,j=0;riga<10;riga++){
 int colonna=0;
for(;colonna<10;colonna++){
    if(colonna==0){
    if(riga==0)
    System.out.print(" 1 ");
    if(riga==1)
    System.out.print(" 2 ");
    if(riga==2)
    System.out.print(" 3 ");
    if(riga==3)
    System.out.print(" 4 ");
    if(riga==4)
    System.out.print(" 5 ");
    if(riga==5)
    System.out.print(" 6 ");
    if(riga==6)
    System.out.print(" 7 ");
    if(riga==7)
    System.out.print(" 8 ");
    if(riga==8)
    System.out.print(" 9 ");
    if(riga==9)
    System.out.print("10 ");
    }
if(tab[riga][colonna]==0)
    System.out.print("  ");
if(tab[riga][colonna]==1)
System.out.print("O ");
if(tab[riga][colonna]==2)
System.out.print("X ");
if(tab[riga][colonna]==3)
System.out.print("  ");
}
System.out.println();



}



    }
public static int[][] sceltanavi(int[][] tab){
    Scanner tastiera=new Scanner(System.in);
    int nav1=2;
    int nav2=3;
    int nav3=3;
    int nav4=1;
    int scelta=0;
    int scelta1=0;
    boolean navip=false;
    String colonna="";
    int riga=0;
    char c;
    int col=0;
    int nnavi=0;
    do{
do{
    navip=false;
    System.out.println("scegli la lunghezza della nave");
 scelta=tastiera.nextInt();
 switch(scelta){
    case 1:
    if(nav1==0){
    System.out.println("navi da 1 finite");
    navip=true;}
    break;
    case 2:if(nav2==0){
    System.out.println("navi da 2 finite");
    navip=true;}
    break;
    case 3:if(nav3==0){
    System.out.println("navi da 3 finite");
    navip=true;}
    break;
    case 4:if(nav4==0){
    System.out.println("navi da 4 finite");
    navip=true;}
    break;
    }
}while((scelta<=0||scelta>4)||navip);
switch(scelta){
case 1:nav1--;
break;
case 2:nav2--;
break;
case 3:nav3--;
break;
case 4:nav4--;
break;
}
do{
    navip=false;
 
do{
System.out.println("scegli la casella");
 colonna=tastiera.next();
 riga=tastiera.nextInt()-1;
  c=colonna.toLowerCase().charAt(0);
   col=c-'a';
}while(colonna.length()!=1||riga<0||riga>9||c>'j'||c<'a'||tab[riga][col]!=0);

switch(scelta){
    case 1:
    if(riga==0&&col==0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3)
    tab[riga][col]=3;
    else
    if(riga==0&&col!=0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3&&tab[riga][col-1]!=3)
    tab[riga][col]=3;
    else
    if(col==0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3&&tab[riga-1][col]!=3)
    tab[riga][col]=3;
    else
    if(riga==10&&tab[riga][col-1]!=3&&tab[riga][col+1]!=3&&tab[riga-1][col]!=3)
    tab[riga][col]=3;
    else
    if(col==10&&tab[riga][col-1]!=3&&tab[riga+1][col]!=3&&tab[riga-1][col]!=3)
    tab[riga][col]=3;
    else
    if(riga>0&&riga<10&&col>0&&col<10&&tab[riga][col-1]!=3&&tab[riga+1][col]!=3&&tab[riga-1][col]!=3&&tab[riga][col+1]!=3)
    tab[riga][col]=3;
    else
    navip=true;
    break;
    case 2:
    case 3:
    case 4:
    do{
        
System.out.println("scegli se  1) su  2) destra 3)sinistra  4)giu");
scelta1=tastiera.nextInt();
    }while(scelta<1||scelta>4);
    switch(scelta1){
        case 1:
       
       int r=riga;
       navip=false;
       for(int i=0;i<scelta&&!navip;i++,r--){
           if (riga<scelta-1)
           navip=true;
           else
           if(col==0){
           if(r==0){
           if(tab[r][col+1]==3)
           navip=true;}
           else
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r-1][col]==3)
        navip=true;}
        else 
        if(col==9){
            if(r==0){
            if(tab[r][col-1]==3)
            navip=true;}
            else
         if(tab[r+1][col]==3|tab[r][col-1]==3|tab[r-1][col]==3)
         navip=true;}
            else
        if(r==9){
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r][col-1]==3)
        navip=true;}
        else 
        if(r==0){
        if(tab[r][col+1]==3|tab[r][col-1]==3)
        navip=true;}
        else
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r][col-1]==3|tab[r-1][col]==3)
        navip=true;
    }
       
       for(int i=0;i<scelta&&!navip;i++,riga--){
        tab[riga][col]=3;
       }
    
         
    break;
        case 2:
         int cl=col;
       navip=false;
       for(int i=0;i<scelta&&!navip;i++,cl++){
           if (col>=11-scelta)
           navip=true;
           else
           if(riga==0){
           if(cl==0){
           if(tab[riga+1][cl]==3|tab[riga][cl+1]==3)
           navip=true;}
           else
           if(cl==9){
           if(tab[riga+1][cl]==3|tab[riga][cl+1]==3)
           navip=true;}
           else
        if(tab[riga+1][cl]==3|tab[riga][cl+1]==3|tab[riga][cl-1]==3)
        navip=true;}
        else 
        if(riga==9){
           
            if(cl==0){
            if(tab[riga-1][cl]==3|tab[riga][cl+1]==3)
            navip=true;}
            else
            if(cl==9){
                if(tab[riga-1][cl]==3)
                navip=true;}
                else
         if(tab[riga][cl+1]==3|tab[riga][cl-1]==3|tab[riga-1][cl]==3){
         navip=true;
       }}
            else
        if(cl==9){
        if(tab[riga+1][cl]==3|tab[riga-1][cl]==3|tab[riga][cl-1]==3)
        navip=true;}
        else 
        if(cl==0){
        if(tab[riga][cl+1]==3|tab[riga-1][cl]==3|tab[riga+1][cl]==3)
        navip=true;}
        else
        if(tab[riga+1][cl]==3|tab[riga][cl+1]==3|tab[riga][cl-1]==3|tab[riga-1][cl]==3)
        navip=true;
    }
       
       for(int i=0;i<scelta&&!navip;i++,col++){
        tab[riga][col]=3;
       }
    
        break;
        case 4:
         r=riga;
       navip=false;
       for(int i=0;i<scelta&&!navip;i++,r++){
           if (riga>=11-scelta)
           navip=true;
           else
           if(col==0){
           if(r==0){
           if(tab[r][col+1]==3|tab[r+1][col]==3)
           navip=true;}
           else
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r-1][col]==3)
        navip=true;}
        else 
        if(col==9){
            if(r==0){
            if(tab[r][col-1]==3|tab[r+1][col]==3)
            navip=true;}
            else
         if(tab[r+1][col]==3|tab[r][col-1]==3|tab[r-1][col]==3)
         navip=true;}
            else
        if(r==9){
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r][col-1]==3)
        navip=true;}
        else 
        if(r==0){
        if(tab[r][col+1]==3|tab[r][col-1]==3|tab[r+1][col]==3)
        navip=true;}
        else
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r][col-1]==3|tab[r-1][col]==3)
        navip=true;
    }
       
       for(int i=0;i<scelta&&!navip;i++,riga++){
        tab[riga][col]=3;
       }
    
         
    break;
        
        case 3: 
         cl=col;
        navip=false;
        for(int i=0;i<scelta&&!navip;i++,cl--){
            if (col<scelta-1)
            navip=true;
            else
            if(riga==0){
            if(cl==0){
            if(tab[riga+1][cl]==3|tab[riga][cl+1]==3)
            navip=true;}
            else
            if(cl==9){
            if(tab[riga+1][cl]==3|tab[riga][cl-1]==3)
            navip=true;}
            else
         if(tab[riga+1][cl]==3|tab[riga][cl+1]==3|tab[riga][cl-1]==3)
         navip=true;}
         else 
         if(riga==9){
             
             if(cl==0){
                
             if(tab[riga-1][cl]==3|tab[riga][cl+1]==3)
             navip=true;}
             else
             if(cl==9){
                
                 if(tab[riga-1][cl]==3|tab[riga][cl-1]==3)
                 navip=true;}
                 else
          if(tab[riga][cl+1]==3|tab[riga][cl-1]==3|tab[riga-1][cl]==3){
          navip=true;
          }
        }
             else
         if(cl==9){
         if(tab[riga+1][cl]==3|tab[riga-1][cl]==3|tab[riga][cl-1]==3)
         navip=true;}
         else 
         if(cl==0){
         if(tab[riga][cl+1]==3|tab[riga-1][cl]==3|tab[riga+1][cl]==3)
         navip=true;}
         else
         if(tab[riga+1][cl]==3|tab[riga][cl+1]==3|tab[riga][cl-1]==3|tab[riga-1][cl]==3)
         navip=true;
     }
        
        for(int i=0;i<scelta&&!navip;i++,col--){
         tab[riga][col]=3;
        }
     
        break;
        }
        

    
    }
    if(navip)
        System.out.println("spazio non disponibile");

}while(navip);

    stampa(tab);
nnavi++;
    }while(nnavi<9);
    return tab;
}



public static int[][] creauto(int [][] tab){
    int nav1=2;
    int nav2=3;
    int nav3=3;
    int nav4=1;
    int scelta=0;
    int scelta1=0;
    boolean navip=false;
    String colonna="";
    int riga=0;
    char c;
    int col=0;
    int nnavi=0;
    do{
do{
    navip=false;
if(nav1>0){
 scelta=1;
nav1--;}
 else 
 if(nav2>0){
 scelta=2;
nav2--;}
 else 
 if(nav3>0){
 scelta=3;
nav3--;}
 else 
 if(nav4>0){
 scelta=4;
 nav4--;}

}while((scelta<=0||scelta>4)||navip);

do{
    navip=false;
do{
 riga=(int)(Math.random()*10);
 col=(int)(Math.random()*10);
}while(riga<0||riga>9||tab[riga][col]!=0||col<0||col>9);

switch(scelta){
    case 1:
    if(riga==0&&col==0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3)
    tab[riga][col]=3;
    else
    if(riga==0&&col!=0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3&&tab[riga][col-1]!=3)
    tab[riga][col]=3;
    else
    if(col==0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3&&tab[riga-1][col]!=3)
    tab[riga][col]=3;
    else
    if(riga==10&&tab[riga][col-1]!=3&&tab[riga][col+1]!=3&&tab[riga-1][col]!=3)
    tab[riga][col]=3;
    else
    if(col==10&&tab[riga][col-1]!=3&&tab[riga+1][col]!=3&&tab[riga-1][col]!=3)
    tab[riga][col]=3;
    else
    if(riga>0&&riga<10&&col>0&&col<10&&tab[riga][col-1]!=3&&tab[riga+1][col]!=3&&tab[riga-1][col]!=3&&tab[riga][col+1]!=3)
    tab[riga][col]=3;
    else
    navip=true;
    break;
    case 2:
    case 3:
    case 4:
    do{
        

scelta1=(int)(Math.random()*4+1);

    }while(scelta<1||scelta>4);
    switch(scelta1){
        case 1:
      
       int r=riga;
       navip=false;
       for(int i=0;i<scelta&&!navip;i++,r--){
           if (riga<scelta-1)
           navip=true;
           else
           if(col==0){
           if(r==0){
           if(tab[r][col+1]==3)
           navip=true;}
           else
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r-1][col]==3)
        navip=true;}
        else 
        if(col==9){
            if(r==0){
            if(tab[r][col-1]==3)
            navip=true;}
            else
         if(tab[r+1][col]==3|tab[r][col-1]==3|tab[r-1][col]==3)
         navip=true;}
            else
        if(r==9){
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r][col-1]==3)
        navip=true;}
        else 
        if(r==0){
        if(tab[r][col+1]==3|tab[r][col-1]==3)
        navip=true;}
        else
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r][col-1]==3|tab[r-1][col]==3)
        navip=true;
    }
       
       for(int i=0;i<scelta&&!navip;i++,riga--){
        tab[riga][col]=3;
       }
    
         
    break;
        case 2:
         int cl=col;
       navip=false;
       for(int i=0;i<scelta&&!navip;i++,cl++){
           if(col>=(11-scelta)||navip){
           navip=true;}
           else
           if(riga==0){
           if(cl==0){
           if(tab[riga+1][cl]==3|tab[riga][cl+1]==3)
           navip=true;}
           else
           if(cl==9){
           if(tab[riga+1][cl]==3|tab[riga][cl-1]==3)
           navip=true;}
           else
        if(tab[riga+1][cl]==3|tab[riga][cl+1]==3|tab[riga][cl-1]==3)
        navip=true;}
        else 
        if(riga==9){
           
            if(cl==0){
            if(tab[riga-1][cl]==3|tab[riga][cl+1]==3)
            navip=true;}
            else
            if(cl==9){
                
                if(tab[riga-1][cl]==3|tab[riga][cl-1]==3){
                   
                    navip=true;}
            }
               else
            
         if(tab[riga][cl+1]==3|tab[riga][cl-1]==3|tab[riga-1][cl]==3){

            
         navip=true;}}
            else
        if(cl==9){
        if(tab[riga+1][cl]==3|tab[riga-1][cl]==3|tab[riga][cl-1]==3)
        navip=true;}
        else 
        if(cl==0){
        if(tab[riga][cl+1]==3|tab[riga-1][cl]==3|tab[riga+1][cl]==3)
        navip=true;}
        else
        if(tab[riga+1][cl]==3|tab[riga][cl+1]==3|tab[riga][cl-1]==3|tab[riga-1][cl]==3)
        navip=true;
    }
       
       for(int i=0;i<scelta&&!navip;i++,col++){
        tab[riga][col]=3;
       }
    
        break;
        case 4:
        r=riga;
       navip=false;
       for(int i=0;i<scelta&&!navip;i++,r++){
           if(riga>=11-scelta){
           navip=true;
           }
           else
           if(col==0){
           if(r==0){
           if(tab[r][col+1]==3|tab[r+1][col]==3)
           navip=true;}
           else
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r-1][col]==3)
        navip=true;}
        else 
        if(col==9){
            if(r==0){
            if(tab[r][col-1]==3|tab[r+1][col]==3)
            navip=true;}
            else
            if(r==9){
                if(tab[r][col-1]==3|tab[r-1][col]==3)
                navip=true;}
                else
         if(tab[r+1][col]==3|tab[r][col-1]==3|tab[r-1][col]==3)
         navip=true;}
            else
        if(r==9){
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r][col-1]==3)
        navip=true;}
        else 
        if(r==0){
        if(tab[r][col+1]==3|tab[r][col-1]==3|tab[r+1][col]==3)
        navip=true;}
        else
        if(tab[r+1][col]==3|tab[r][col+1]==3|tab[r][col-1]==3|tab[r-1][col]==3)
        navip=true;
    }
       
       for(int i=0;i<scelta&&!navip;i++,riga++){
        tab[riga][col]=3;
       }
    
         
    break;
        
        case 3: 
         cl=col;
        navip=false;
        for(int i=0;i<scelta&&!navip;i++,cl--){
            if (col<scelta-1|navip)
            navip=true;
            else
            if(riga==0){
            if(cl==0){
            if(tab[riga+1][cl]==3|tab[riga][cl+1]==3)
            navip=true;}
            else
            if(cl==9){
               
            if(tab[riga+1][cl]==3|tab[riga][cl-1]==3)
            navip=true;}
            else
         if(tab[riga+1][cl]==3|tab[riga][cl+1]==3|tab[riga][cl-1]==3)
         navip=true;}
         else 
         if(riga==9){
            
             if(cl==0){
              
             if(tab[riga-1][cl]==3|tab[riga][cl+1]==3)
             navip=true;}
             else
             if(cl==9){
                
                 if(tab[riga-1][cl]==3|tab[riga][cl-1]==3)
                 navip=true;}
                 else
                 
          if(tab[riga][cl+1]==3|tab[riga][cl-1]==3|tab[riga-1][cl]==3){
          navip=true;
          }
        }
             else
         if(cl==9){
         if(tab[riga+1][cl]==3|tab[riga-1][cl]==3|tab[riga][cl-1]==3)
         navip=true;}
         else 
         if(cl==0){
         if(tab[riga][cl+1]==3|tab[riga-1][cl]==3|tab[riga+1][cl]==3)
         navip=true;}
         else
         if(tab[riga+1][cl]==3|tab[riga][cl+1]==3|tab[riga][cl-1]==3|tab[riga-1][cl]==3)
         navip=true;
     }
        
        for(int i=0;i<scelta&&!navip;i++,col--){
         tab[riga][col]=3;
        }
     
        break;
        }
        

    
    }
    

}while(navip);

   
nnavi++;

    }while(nnavi<9);






    return tab;
}




static public int[][] mossautente(int[][] tab){

    String colonna="";
    int riga=0;
    int col=0;
    do{
    colonna="";
     riga=0;
     char c;
     col=0;
    Scanner tastiera=new Scanner(System.in);
    do{
        System.out.println("scegli la casella");
         colonna=tastiera.next();
         riga=tastiera.nextInt()-1;
          c=colonna.toLowerCase().charAt(0);
           col=c-'a';
        }while(colonna.length()!=1||riga<0||riga>9||c>'j'||c<'a'||tab[riga][col]==1||tab[riga][col]==2);
        if(tab[riga][col]==0)
        tab[riga][col]=1;
        if(tab[riga][col]==3)
        tab[riga][col]=2;
        metodi.stampac(tab);
    }while(tab[riga][col]==2);
    return tab;
}




public static boolean mossacomputer(int[][] tab,boolean mosscomp,int[] mossac){
    Scanner tastiera=new Scanner(System.in);
    int riga=0;
    int col=0;
    int i=0;
    int f=0;
    int prova=0;
    boolean spazio=true;
    boolean rifai=false;
    boolean dx=false;
    boolean sx=false;
    boolean su=false;
    boolean giu=false;
    boolean eseguire=false;
    boolean navip=false;
    int reset=0;
    int[] mossa1=new int[2];
    do{
       // System.out.println("funz");
        riga=0;
         col=0;
        i=0;
        rifai=false;
     spazio=true;
     eseguire=false;
        if(!mosscomp){
            do{
        riga=(int)(Math.random()*10);
        col=(int)(Math.random()*10);
                /*if (prova==0){
                    System.out.println("scegli la casella++");
         col=tastiera.nextInt();
         riga=tastiera.nextInt()-1;
          
           prova++;
                }*/
        f=0;
        if(riga==0&&col==0&&tab[riga+1][col]!=2&&tab[riga][col+1]!=2)
        tab[riga][col]=3;
        else
        if(riga==0&&col!=0&&tab[riga+1][col]!=2&&tab[riga][col+1]!=2&&tab[riga][col-1]!=2)
        navip=false;
        else
        if(col==0&&tab[riga+1][col]!=2&&tab[riga][col+1]!=2&&tab[riga-1][col]!=2)
        navip=false;
        else
        if(riga==10&&tab[riga][col-1]!=2&&tab[riga][col+1]!=2&&tab[riga-1][col]!=2)
        navip=false;
        else
        if(col==10&&tab[riga][col-1]!=2&&tab[riga+1][col]!=2&&tab[riga-1][col]!=2)
        navip=false;
        else
        if(riga>0&&riga<10&&col>0&&col<10&&tab[riga][col-1]!=2&&tab[riga+1][col]!=2&&tab[riga-1][col]!=2&&tab[riga][col+1]!=2)
        navip=false;
        else
        navip=true;       
    }while(riga<0||riga>9||tab[riga][col]==2||tab[riga][col]==1||col<0||col>9||navip);
    }
    else {
        do{
            navip=false;
            reset=0;
            //System.out.println(eseguire+"  "+riga+"  "+col+"  "+tab[riga][col]);
            System.out.println("funz1");
            
            spazio=true;
    riga=mossac[0];
    col=mossac[1];
    System.out.println(riga+"    "+col);
   // System.out.println(dx+" "+sx+" "+su+" "+giu);
       if(dx)
       i=3;
       else
       if(sx)
       i=4;
       else
       if(su)
       i=1;
       else
       if(giu)
       i=2;
    else{
 i=(int)(Math.random()*4+1);
eseguire=true;}
 switch(i){
case 1:
riga++;
dx=false;
sx=false;
su=true;
giu=false;
break;
case 2:
riga--;
dx=false;
sx=false;
su=false;
giu=true;
break;
case 3:
col++;
dx=true;
sx=false;
su=false;
giu=false;
break;
case 4:
col--;
dx=false;
sx=true;
su=false;
giu=false;
break;

 }
 if(riga<0||riga>9||col<0||col>9||tab[riga][col]==2||tab[riga][col]==1)
reset++;
if(reset==1){
    dx=false;
    sx=false;
    su=false;
    giu=false;
}
/*if(riga==0&&col==0&&tab[riga+1][col]!=2&&tab[riga][col+1]!=2)
navip=false;
else
if(riga==0&&col!=0&&tab[riga+1][col]!=2&&tab[riga][col+1]!=2&&tab[riga][col-1]!=2)
navip=false;
else
if(col==0&&tab[riga+1][col]!=2&&tab[riga][col+1]!=2&&tab[riga-1][col]!=2)
navip=false;
else
if(riga==10&&tab[riga][col-1]!=2&&tab[riga][col+1]!=2&&tab[riga-1][col]!=2)
navip=false;
else
if(col==10&&tab[riga][col-1]!=2&&tab[riga+1][col]!=2&&tab[riga-1][col]!=2)
navip=false;
else
if(riga>0&&riga<10&&col>0&&col<10&&tab[riga][col-1]!=2&&tab[riga+1][col]!=2&&tab[riga-1][col]!=2&&tab[riga][col+1]!=2)
navip=false;
else
navip=true;       */
//System.out.println(reset);
        }while(eseguire&&(riga<0||riga>9||col<0||col>9||tab[riga][col]==2||tab[riga][col]==1||navip));

    }

   // System.out.println(spazio+"  "+riga+"  "+col);
       if(tab[riga][col]==0){
       tab[riga][col]=1;
    spazio=false;
    riga=mossac[0];
    col=mossac[1];  }
    else
       if(tab[riga][col]==3)
       tab[riga][col]=2;

       if(riga==0&&col==0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3)
       mosscomp=false;
       else
       if(riga==0&&col!=0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3&&tab[riga][col-1]!=3)
       mosscomp=false;
       else
       if(col==0&&tab[riga+1][col]!=3&&tab[riga][col+1]!=3&&tab[riga-1][col]!=3)
       mosscomp=false;
       else
       if(riga==10&&tab[riga][col-1]!=3&&tab[riga][col+1]!=3&&tab[riga-1][col]!=3)
       mosscomp=false;
       else
       if(col==10&&tab[riga][col-1]!=3&&tab[riga+1][col]!=3&&tab[riga-1][col]!=3)
       mosscomp=false;
       else
       if(riga>0&&riga<10&&col>0&&col<10&&tab[riga][col-1]!=3&&tab[riga+1][col]!=3&&tab[riga-1][col]!=3&&tab[riga][col+1]!=3)
       mosscomp=false;
       else
       mosscomp=true;
       
      // if(tab[riga][col]==3&&f==0)

      
       if(mosscomp&&spazio){
           mossac[0]=riga;
           mossac[1]=col;
           f++;
       }
       
       if(tab[riga][col]==2){
       rifai=true;
       //System.out.println("va");
       }
      
        if(!spazio){
            System.out.println("F: "+f);
            
                if(dx){
                    if(mossac[1]>1)
                    if(tab[mossac[0]][mossac[1]-1]==3)
                    spazio=true;
                    dx=false;
                    sx=true;
                    rifai=true;
                    if(mossac[1]>2)
                    if(tab[mossac[0]][mossac[1]-1]==2&&tab[mossac[0]][mossac[1]-2]==3)
                    spazio=true;
                    dx=false;
                    sx=true;
                    rifai=true;
                    if(mossac[1]>3)
                    if(tab[mossac[0]][mossac[1]-1]==2&&tab[mossac[0]][mossac[1]-2]==2&&tab[mossac[0]][mossac[1]-3]==3)
                    spazio=true;
                    dx=false;
                    sx=true;
                    rifai=true;
                }
                if(sx){
                    if(mossac[1]<9)
                    if(tab[mossac[0]][mossac[1]+1]==3)
                    spazio=true;
                    dx=false;
                    sx=true;
                    rifai=true;
                    if(mossac[1]<8)
                    if(tab[mossac[0]][mossac[1]+1]==2&&tab[mossac[0]][mossac[1]+2]==3)
                    spazio=true;
                    dx=false;
                    sx=true;
                    rifai=true;
                    if(mossac[1]<7)
                    if(tab[mossac[0]][mossac[1]+1]==2&&tab[mossac[0]][mossac[1]+2]==2&&tab[mossac[0]][mossac[1]+3]==3)
                    spazio=true;
                    dx=false;
                    sx=true;
                    rifai=true;
             }
             if(giu){
                if(mossac[0]<9)
                if(tab[mossac[0]][mossac[1]+1]==3)
                spazio=true;
                dx=false;
                sx=true;
                rifai=true;
                if(mossac[0]<8)
                if(tab[mossac[0]+1][mossac[1]]==2&&tab[mossac[0]+2][mossac[1]]==3)
                spazio=true;
                dx=false;
                sx=true;
                rifai=true;
                if(mossac[0]<7)
                if(tab[mossac[0]+1][mossac[1]]==2&&tab[mossac[0]+2][mossac[1]]==2&&tab[mossac[0]+3][mossac[1]]==3)
                spazio=true;
                dx=false;
                sx=true;
                rifai=true;
             }
             if(su){
               
                

                if(mossac[0]>1)
                if(tab[mossac[0]][mossac[1]-1]==3)
                spazio=true;
                dx=false;
                sx=true;
                rifai=true;
                if(mossac[0]>2)
                if(tab[mossac[0]-1][mossac[1]]==2&&tab[mossac[0]-2][mossac[1]]==3)
                spazio=true;
                dx=false;
                sx=true;
                rifai=true;
                if(mossac[0]>3)
                if(tab[mossac[0]-1][mossac[1]]==2&&tab[mossac[0]-2][mossac[1]]==2&&tab[mossac[0]-3][mossac[1]]==3)
                spazio=true;
                dx=false;
                sx=true;
                rifai=true;
             }
             System.out.println("funziona+"+mossac[0]+"  "+mossac[1]);
            
             
         }
        
           if(!rifai){
        //System.out.println("funz2");
        dx=false;
        sx=false;
        su=false;
        giu=false;
       }
      // System.out.println(rifai+"      "+riga+"      "+col+"        "+spazio+"    "+mosscomp);
       metodi.stampa(tab);
    }while(rifai&&spazio);
    System.out.println("mosssac:"+mossac[0]+"  "+mossac[1]);
return mosscomp;

    }


    public static boolean vittoria(int[][] tab,boolean vittoria){
for(int riga=0;riga<tab.length&&vittoria;riga++){
int colonna=0;
for(;colonna<tab.length&&vittoria;colonna++){
if(tab[riga][colonna]==3)
vittoria=false;
}
}
return vittoria;
}
}
