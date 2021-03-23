
//Dies ist ein Kommentar, das liest nur der Programmierer 
class ARBEIT
{
//Der Inhalt einer Klasse wird durch zwei geschweifte Klammern zusammengehalten
    
//Hier werden drei Objekte deklariert
    WELT welt;
    ROBOTER karola;
    ROBOTER dani;
    ROBOTER gon;
    
    
    
    
    public ARBEIT()
    {
        //Hier werden die drei Objekte erzeugt
        welt = new WELT( 20,20,20);
        karola = new ROBOTER(welt);        
        karola.LinksDrehen();
        karola.Schritt();
        karola.Schritt();
        karola.RechtsDrehen();
        
        dani = new ROBOTER(welt);
        dani.LinksDrehen();
        dani.Schritt();
        dani.RechtsDrehen();
        
        gon = new ROBOTER(welt);
        
        int zahl=0;
    }
    
    void beispielMethode()
    {
        //diese Methode tut noch nix
        
    }
    
    void gleichschritt()
    {
        while(karola.IstWand()==false)
        {
            karola.Schritt();
            karola.RechtsDrehen();
            karola.LinksDrehen();
            
            dani.Schritt();
            dani.RechtsDrehen();
            dani.LinksDrehen();
            
            gon.Schritt();
            gon.RechtsDrehen();
            gon.LinksDrehen();
        }
    }
    
    void markesetzen()
    {
        karola.MarkeSetzen();
    }
    
    void burgbauen()
    {
        dani.Schritt();
        dani.LinksDrehen();
        dani.Schritt();
        dani.Schritt();
        dani.RechtsDrehen();
        
        for(int x=0; x<=15; x++)
        {
            for(int y=0; y<=8; y++)
           {
            dani.Hinlegen();
            dani.Schritt();
           }
           dani.LinksDrehen();
        }
        for(int v=0; v<=2; v++)
        {
            if(v==2)
            {
                
            }
        }
    }
    
    void stein()
    {
        int i=0;
        karola.Schritt();
        while(karola.IstMarke()==false)
       {
        if(karola.IstWand()==false)
        {
           karola.Hinlegen();
           karola.Schritt();
        }
        else
        {
            karola.LinksDrehen();
            karola.Schritt();
            karola.LinksDrehen();
        }
       }
        i++;
    }
  
//dies ist die Klammer, die die Klasse schließt
}
