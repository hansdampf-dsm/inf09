


//Dies ist ein Kommentar, das liest nur der Programmierer 
class ARBEIT
{
//Der Inhalt einer Klasse wird durch zwei geschweifte Klammern zusammengehalten
    
//Hier werden drei Objekte deklariert
    WELT welt;
    ROBOTER jose;
    ROBOTER rodri;
    ROBOTER dani;
    ROBOTER mateo;
    
    
    public ARBEIT()
    {
        //Hier werden die drei Objekte erzeugt
        welt = new WELT(20,20,20);
        jose = new ROBOTER(welt);
        jose.LinksDrehen();
        jose.Schritt();
        jose.Schritt();
        jose.Schritt();
        jose.Schritt();
        dani = new ROBOTER(welt);
        dani.LinksDrehen();
        dani.Schritt();
        dani.Schritt();
        dani.Schritt();
        dani.RechtsDrehen();
    }
    void bauen()
    {
        for(int j=0;j<=15;j++)
      {
        for(int i=0;i<=7;i++)
        {
          jose.Hinlegen();
          jose.Schritt();
        } 
        jose.RechtsDrehen();
      }
      for(int l=0;l<=3;l++)
      {
        for(int k=0;k<=3;k++)
        {
          jose.Schritt();
          jose.Hinlegen();
          jose.Schritt();
          jose.MarkeSetzen();
        }
        jose.RechtsDrehen();
      }
      for (int m=0; m<=1; m++)
      {
          dani.Hinlegen();
          dani.Schritt();
          dani.Hinlegen();
      }
      dani.Hinlegen();
      dani.Hinlegen();
      dani.Schritt();
      dani.Hinlegen();
      dani.Hinlegen();
      dani.Hinlegen();
      dani.Hinlegen();
      dani.Schritt();
      dani.LinksDrehen();
      dani.Schritt();
    }
    public void destruccionexe()
    {
      jose.RechtsDrehen();
      jose.Schritt();
      jose.Schritt();
      jose.Schritt();
      jose.RechtsDrehen();
      jose.Schritt();
      dani.LinksDrehen();
      for (int n=0; n<=2; n++)
      {
          dani.Schritt();
      }
      dani.Aufheben();
      dani.Schritt();
      dani.MarkeLoeschen();
      dani.RechtsDrehen();
      for (int o=0; o<=15; o++)
      {
        for (int p=0; p<=6; o++)
        {
          dani.Schritt(); 
          dani.Aufheben();
          dani.MarkeLoeschen();
        }
        dani.LinksDrehen();
      }
    }
  
//dies ist die Klammer, die die Klasse schließt
}
