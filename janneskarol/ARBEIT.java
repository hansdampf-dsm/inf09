
//Dies ist ein Kommentar, das liest nur der Programmierer 
class ARBEIT
{
    //Der Inhalt einer Klasse wird durch zwei geschweifte Klammern zusammengehalten

    //Hier werden drei Objekte deklariert
    WELT welt;
    ROBOTER Robi;
    ROBOTER Tobi;
    ROBOTER Karl;

    public ARBEIT()
    {
        //Hier werden die drei Objekte erzeugt
        welt = new WELT( 20,20,20);
        Robi = new ROBOTER(welt);
        Robi.Schritt();
        Robi.Schritt();
        Tobi = new ROBOTER(welt);
        Tobi.Schritt();
        Karl = new ROBOTER(welt);

    }

    void beispielMethode()
    {
        //diese Methode tut noch nix

    }

    void gleichschrittMethode()
    {
        Robi.LinksDrehen();
        Robi.Schritt();
        Robi.Schritt();
        Robi.LinksDrehen();
        Robi.Schritt();
        Robi.Schritt();
        Robi.LinksDrehen();
        Robi.LinksDrehen();
        Tobi.LinksDrehen();
        Tobi.Schritt();
        Tobi.LinksDrehen();
        Tobi.Schritt();
        Tobi.LinksDrehen();
        Tobi.LinksDrehen();
        while(Robi.IstWand()==false)
        {
            Robi.Schritt();

        }
        while(Tobi.IstWand()==false)
        {
            Tobi.Schritt();
        }
        while(Karl.IstWand()==false)
        {
            Karl.Schritt();
        }
        while(Robi.IstWand()==true)
        {
            Robi.LinksDrehen();
            Robi.LinksDrehen();
        }
        while(Tobi.IstWand()==true)
        {
            Tobi.LinksDrehen();
            Tobi.LinksDrehen();
        }
        while(Karl.IstWand()==true)
        {
            Karl.LinksDrehen();
            Karl.LinksDrehen();
        }
        while(Robi.IstWand()==false)
        {
            Robi.Schritt();

        }
        while(Tobi.IstWand()==false)
        {
            Tobi.Schritt();
        }
        while(Karl.IstWand()==false)
        {
            Karl.Schritt();
        }
    }

    void BurgbauMethode()
    {
        Robi.LinksDrehen();
        Robi.Schritt();
        Robi.Schritt();
        Robi.Schritt();
        Robi.Schritt();
        for(int z=0; z <= 3; z++)
        {
            for(int f=0; f <= 3; f++)
            {
                for( int i=0; i <= 7; i++)
                {
                    Robi.Hinlegen();
                    Robi.Schritt();

                }
                Robi.RechtsDrehen();

            }
        }

        for(int d=0; d<= 3; d++)
        {
            for(int t=0; t<= 3; t++)
            {
                Robi.Schritt();
                Robi.Hinlegen();
                Robi.Schritt();
                Robi.MarkeSetzen();

               
            } 
            Robi.RechtsDrehen();
        }
        Tobi.Schritt();
        Tobi.LinksDrehen();
        Tobi.Schritt();
        Tobi.Schritt();
        Tobi.Schritt();
        Tobi.RechtsDrehen();
        Tobi.Hinlegen();
        Tobi.Schritt();
        Tobi.Hinlegen();
        Tobi.Hinlegen();
        Tobi.Schritt();
        Tobi.Hinlegen();
        Tobi.Hinlegen();
        Tobi.Hinlegen();
        Tobi.Schritt();
        Tobi.Hinlegen();
        Tobi.Hinlegen();
        Tobi.Hinlegen();
        Tobi.Hinlegen();
        Tobi.Schritt();
        Tobi.LinksDrehen();
        Tobi.Schritt();
        Tobi.RechtsDrehen();
        Tobi.Schritt();
    }
}   //dies ist die Klammer, die die Klasse schließt
