//Dies ist ein Kommentar, das liest nur der Programmierer 
class ARBEIT
{
    //Der Inhalt einer Klasse wird durch zwei geschweifte Klammern zusammengehalten
    //Hier werden drei Objekte deklariert
    WELT welt;
    ROBOTER karola;
    ROBOTER karola2;
    ROBOTER karola3;
    
    
    
    public ARBEIT()
    {
        //Hier werden die drei Objekte erzeugt
        welt = new WELT( 20,20,20);
        
        karola = new ROBOTER(welt);
        karola.LinksDrehen();
        karola.Schritt();
        karola.Schritt();
        karola.RechtsDrehen();
        
        karola2 = new ROBOTER(welt);
        karola2.LinksDrehen();
        karola2.Schritt();
        karola2.RechtsDrehen();
        
        karola3 = new ROBOTER(welt);
        
        
    }
    void Bewegen()
    {
        for (int b = 0; b <= 15; b++) 
        {
          for (int a = 0; a <= 7; a++)
          {
            karola.Hinlegen();
            karola.Schritt();
          }
          karola.LinksDrehen();
        }
       
        for (int c = 0; c <= 3; c++)
         {
           for (int a = 0; a <= 3; a++)
           {
             karola.Schritt();
             karola.Hinlegen();
             karola.Schritt();
           }
           karola.LinksDrehen();
           //karola.LinksDrehen();
        }
    }
}
    
