import java.util.*;

public class main
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);

        Random generator = new Random();
        System.out.println("Podaj obecny rok");

        int rok=in.nextInt();
        String[] imiona = {"Dawid","Antek","Janek","Patryk","Tomek","Andrzej","IsamUxPompa","Maciek","Michał","Franek","Hubert","Emil","Kamil","Miłosz","Zbigniew","Robert","Czarek","Fryderyk","Irek","Jędrek"};
        String[] drugie_imiona={"Dawid","Antek","Janek","Patryk","Tomek","Andrzej","IsamUxPompa","Maciek","Michał","Emil","Hubert","Franek","Zbigniew","Fryderyk","Robert","Irek","Miłosz","Czarek","Irek","Jędrek"};
        String[] nazwiska ={"Kowalski","Mikołajczyk"};
        String[] miasta = {"Kalisz","Wrocław","Łódz","Gdańsk","Warszawa","Poznań","Szczecin","Toruń","Kielce","Kraków","Opole","Olsztyn","Koszalin","Częstochowa","Gliwice","Lublin","Tychy","Rzeszów","Gdynia","Radom"};
        String[] adres1= {"Działkowa","Parczewskiego","Harcerska","3 maja"};
        String[] kody_pocztowe = {"62-800","62-872","61-744","61-526","61-505"};
        //String[] wiek = {"13","12","9","8","47","82","43","79","3","22","34"};
        int [] rok_urodzenia =new int[10000];

        String dane[][]=new String[10000][5];
        for(int i=0; i<dane.length;i++)
        {
            int index_imie = generator.nextInt(imiona.length);

            int index_drugie_imie = generator.nextInt(drugie_imiona.length);
            int index_miasta = generator.nextInt(miasta.length);
            int index_adres1 = generator.nextInt(adres1.length);
            //System.out.println(""+index_adres1);
            int v_rok_urodzenia = ((int)(Math.random() * ((rok-1950)+1)) + 1950);

            if(index_imie != index_drugie_imie)
            {

            }
            else
            {
                while(index_imie == index_drugie_imie)
                {
                    index_drugie_imie = generator.nextInt(drugie_imiona.length);
                }
            }

            //             System.out.println("Imie: "+imiona[index_imie]);
            //             System.out.println("Drugie imie: "+drugie_imiona[index_drugie_imie]);
            //             System.out.println("Nazwisko: "+nazwiska[generator.nextInt(nazwiska.length)]);
            //             System.out.println("Miasto:" +miasta[index_miasta]);
            //             System.out.println("Wiek:" +(rok-rok_urodzenia));
            //             System.out.println("========================================");

            dane[i][0]=imiona[index_imie];
            dane[i][1]=drugie_imiona[index_drugie_imie];
            dane[i][2]=nazwiska[generator.nextInt(nazwiska.length)];
            dane[i][3]=miasta[index_miasta];
            dane[i][4]=adres1[index_adres1];
            rok_urodzenia[i]=v_rok_urodzenia;
            

        }
        
        in.close();
      
        
        in=new Scanner(System.in);
        String imie;
        System.out.println("Wpisz imię: ");
        imie=in.nextLine();

        
        
        String drugie_imie;
        System.out.println("Wprowadź drugie imie: ");
        drugie_imie = in.next();
       
        
        in.close();
      
        
        in=new Scanner(System.in);
        String nazwisko;
        System.out.println("Wprowadź nazwisko: ");
        nazwisko = in.nextLine();
        in.close();
      
        
        in=new Scanner(System.in);
        String miasto;
        System.out.println("Wprowadź miasto: ");
        miasto = in.nextLine();
        in.close();
      
        
        in=new Scanner(System.in);
        int rok_urodzenia1;
        System.out.println("Wprowadź rok urodzenia: ");
        rok_urodzenia1 = in.nextInt();
        in.close();
      
        
        in=new Scanner(System.in);
        String adres;
        System.out.println("Wprowadź adres: ");
        adres = in.nextLine();


        String pelne_dane;
        //pelne_dane = imie + " " + drugie_imie + " "+ miasto +" " + rok_urodzenia1 + " " + adres ;
        //System.out.println("Twoje dane to: " + pelne_dane); 
        System.out.println("========================================="); 

        boolean[] tablica_bledow={true,true,true,true,true,true};

        if(imie.equals("-"))
        {
            imie="";
            tablica_bledow[0]=false;
        }
        else
        {
            for(int i=0; i<dane.length;i++)
            {
                if(imie.equals(dane[i][0]))
                {
                    //blad=false;
                    tablica_bledow[0]=false;
                }

            }
        }
        
        if(drugie_imie.equals("-"))
        {
            drugie_imie="";
            tablica_bledow[1]=false;
        }
        else
        {
             
            for(int i=0; i<dane.length;i++)
            {
                //System.out.println("Jestem w ifie "+drugie_imie);
                // System.out.println("Jestem w ifie "+drugie_imie+" "+dane[i][1]+" ??? "+dane[i][1].contains((String)drugie_imie));
                if(drugie_imie.equals(dane[i][1]))
                {
                   
                    //blad=false;
                    tablica_bledow[1]=false;
                }

            }
        }
        
        if(nazwisko.equals("-"))
        {
            nazwisko="";
             tablica_bledow[2]=false;
        }
        else
        {
            for(int i=0; i<dane.length;i++)
            {
                if(nazwisko.equals(dane[i][2]))
                {
                    //blad=false;
                    tablica_bledow[2]=false;
                }

            }
        }
        if(miasto.equals("-"))
        {
            miasto="";
            tablica_bledow[3]=false;
        }
        else
        {
            for(int i=0; i<dane.length;i++)
            {
                if(miasto.equals(dane[i][3]))
                {
                    //blad=false;
                    tablica_bledow[3]=false;
                }

            }
        }
        if(adres.equals("-"))
        {
            adres="";
            tablica_bledow[5]=false;
   
        }
        else
        {
            //System.out.println("Jestem w ifie "+adres);
            for(int i=0; i<dane.length;i++)
            {
                //System.out.println("Jestem w ifie "+dane[i][4]);
                if(adres.equals(dane[i][4]))
                {
                    //blad=false;
                    tablica_bledow[5]=false;
                    
                }

            }
        }
        //System.out.println(""+dane.length);

        //tablica_bledow[0] imiona
        //tablica bledow[1]drugie_imiona
        //tablica bledow[2]nazwiska
        //tablica bledow[3]miasta
        //tablica bledow[4]rok urodzenia
        //boolean blad=true;

        
        if(rok_urodzenia1<=rok)
        {
            tablica_bledow[4]=false;
        }
        if(tablica_bledow[0])
        {
            System.out.println("Bład 404 nie ma takiego imienia");
        }
        if(tablica_bledow[1])
        {
            System.out.println("Bład 404 nie ma takiego drugiego imienia");
        }
        if(tablica_bledow[2])
        {
            System.out.println("Bład 404 nie ma takiego nazwiska");
        }
        if(tablica_bledow[3])
        {
            System.out.println("Bład 404 nie ma takiego miasta");
        }
        if(tablica_bledow[4])
        {
            System.out.println("Wyszukiwany rok nie może byc wiekszy od bierzącego");
        }

        if(tablica_bledow[5])
        {
            System.out.println("Bład 404 nie ma takiego adresu");
        }
        if(!tablica_bledow[0] && !tablica_bledow[1] && !tablica_bledow[2] && !tablica_bledow[3] &&  !tablica_bledow[4] && !tablica_bledow[5])

        {

            for(int i=0; i<10000;i++)
            {

                if(dane[i][0].contains(imie)  && dane[i][2].contains(nazwisko) && dane[i][3].contains(miasto) && rok_urodzenia[i]<=rok_urodzenia1 && dane[i][4].contains(adres))
                {
                    System.out.println("Imie : "+dane[i][0]);
                    System.out.println("Drugie imie : "+dane[i][1]);
                    System.out.println("Nazwisko : "+dane[i][2]);
                    System.out.println("Miasto : "+dane[i][3]);
                    System.out.println("Rok urodzenia : "+rok_urodzenia[i]);
                    System.out.println("Wiek : "+(rok-rok_urodzenia[i]));
                    System.out.println("Adres : "+dane[i][4]);
                    System.out.println("========================================");

                }

            }
        }//PRACA DOMOWA -WYSZUKIWANIE PO IMIENIU DRUGIM IMIENIUM MIESCIE I ROKU URODZENIA z klawiatury.
        //PRACA DOMOWA KOD POCZTOWY,ADRES (BŁĘDY,GENERATOR)
    }  
}
