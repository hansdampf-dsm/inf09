class ARBEIT
{

    WELT welt;
    ROBOTER mateo;
    ROBOTER lore;
    ROBOTER joe;

    public ARBEIT()
    {
        welt = new WELT(10,10,10);
        
        mateo = new ROBOTER(welt);
               
        mateo.Schritt();
        
        lore = new ROBOTER(welt);
         
        //joe = new ROBOTER(welt);
        
        //joe.Schritt();
        //joe.LinksDrehen();
        
        
    }
    
    void bauen()
    {
        //für 8 solles hier unten 15 sein 
       for(int i=0; i<=15;i++)
       {
          for(int s=1; s<=6; s++)
         {
           mateo.Hinlegen();
           mateo.Schritt();
           lore.Schritt();
         }
         mateo.LinksDrehen();
         mateo.Hinlegen();
         mateo.Schritt();
        
         lore.Schritt();
         lore.LinksDrehen();
       }
       
       for (int r=0; r<=3; r++)
       {
         for(int z=0; z<=2; z++)
         {  
           mateo.Hinlegen();
           mateo.Schritt();
           mateo.MarkeSetzen();
           
           lore.Schritt();
           mateo.Schritt();
           lore.Schritt();
         }
         mateo.LinksDrehen();
         mateo.Schritt();
         
         lore.Schritt();
         lore.LinksDrehen();
       }
       
       mateo.LinksDrehen();
       int t=4;
       int x;
       for(int m=0; m<=2; m++)
       {
           
         
           for(x=t-1; x>=1; x--)
         {
           mateo.Hinlegen();
         }
         mateo.Schritt();
         t--;
         
       }
       mateo.Schritt();
        mateo.RechtsDrehen();
    }
          
      void zerstören()
    {
       
       for (int r=0; r<=3; r++)
       {
         for(int z=0; z<=2; z++)
         {  
           lore.Schritt();
           lore.Aufheben();
           lore.Schritt();
           
           
           
         }
         lore.Schritt();
         lore.LinksDrehen();
         
       }
       
       for(int i=0; i<=15;i++)
       {
          for(int s=1; s<=6; s++)
         {
           lore.Aufheben();
           lore.Schritt();
           
         }
         lore.Aufheben();
         lore.Schritt();
         lore.LinksDrehen();
         
        
         
       }
    }  
}
