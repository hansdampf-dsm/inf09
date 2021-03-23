
//Dies ist ein Kommentar, das liest nur der Programmierer 
class ARBEIT
{
//Der Inhalt einer Klasse wird durch zwei geschweifte Klammern zusammengehalten
    
//Hier werden drei Objekte deklariert
    WELT welt;
    ROBOTER karola;
    ROBOTER cr7;
    ROBOTER messirve;
    
    
    
    public ARBEIT()
    {
        //Hier werden die drei Objekte erzeugt
        welt = new WELT( 20,20,20);
        karola = new ROBOTER(welt);
        karola.LinksDrehen();
        karola.Schritt();
        karola.Schritt();
        
        cr7= new ROBOTER(welt);
        cr7.LinksDrehen();
        cr7.Schritt();
        
        messirve = new ROBOTER(welt);
        
        
        
    }
    
    void gleichschritt()
    {
      while(karola.IstWand()==false) 
      {
       karola.Schritt();
       cr7.Schritt();
       messirve.Schritt();
    }
      {
      karola.RechtsDrehen();
      karola.RechtsDrehen();
      cr7.RechtsDrehen();
      cr7.RechtsDrehen();
     messirve.RechtsDrehen();
      messirve.RechtsDrehen();
   }
   while(karola.IstWand()==false) 
      {
       karola.Schritt();
       cr7.Schritt();
       messirve.Schritt();
    }
  }
    
    void stein(){
        
        while(karola.IstWand()==false)
        {
            karola.Hinlegen();
            karola.Schritt();
            karola.Schritt();
        
    }
    {
        karola.RechtsDrehen();
        karola.Schritt();
        karola.RechtsDrehen();
    }
             
   }
   void karolaKreisdrehen()
   {
       for(int z=0;z<5  ;z++)
       {
           for(int i=0; i<=3; i++)
           {
               for(int j=0; j<=3; j++)
               {
                   karola.Hinlegen();
                   karola.Schritt();
                }
                
               karola.LinksDrehen();
            }
        }
        for(int z=0; z<5; z++)
        {
    }
    }
 

 
    
        
  
//dies ist die Klammer, die die Klasse schließt

