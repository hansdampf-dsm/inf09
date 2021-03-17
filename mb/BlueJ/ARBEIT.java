

//Dies ist ein Kommentar, das liest nur der Programmierer 
class ARBEIT
{
//Der Inhalt einer Klasse wird durch zwei geschweifte Klammern zusammengehalten
    
//Hier werden drei Objekte deklariert
    WELT welt;
    ROBOTER r2d2;
    ROBOTER elpepe;
    ROBOTER mebale;
    int x=2;
    
    public ARBEIT()
    {
        //Hier werden die drei Objekte erzeugt
        welt = new WELT( 20,20,20);
        r2d2 = new ROBOTER(welt);
        r2d2.LinksDrehen();
        r2d2.Schritt();
        r2d2.Schritt();
        r2d2.RechtsDrehen();
        elpepe = new ROBOTER(welt);
        elpepe.LinksDrehen();
        elpepe.Schritt();
        elpepe.RechtsDrehen();
        mebale = new ROBOTER(welt);
        
    }
     
    void bisWandundzuruk()
    {
       for(int e=0; e<=1;e++){
        while(r2d2.IstWand()==false){
    
         
         r2d2.Schritt();
         elpepe.Schritt();
         mebale.Schritt();
    
       }
       if(r2d2.IstWand()==true){
        
         for(int i=0; i<=1;i++){
          r2d2.RechtsDrehen();
          elpepe.RechtsDrehen();
          mebale.RechtsDrehen();
         }
        
        }
     }
    }
    void unweltputzen(){
    
         while(r2d2.IstWand()==false){
            r2d2.Hinlegen();
            r2d2.Schritt();
            if(r2d2.IstWand()==false){
             r2d2.Schritt();
            }
            
            }
         r2d2.RechtsDrehen();
         r2d2.Schritt();
         r2d2.RechtsDrehen();
         elpepe.LinksDrehen();
         elpepe.Schritt();
         elpepe.RechtsDrehen();
         while(elpepe.IstWand()==false){
             if(elpepe.IstZiegel()==true){
                 elpepe.Aufheben();
             
            
             }
             else
             {
                
                
                elpepe.Schritt();
                
                
                
              }     
                
            }
         
    
    
    
    
    }
    void burrrg(){
        r2d2.Schritt();
        r2d2.Schritt();
        
         
        
        
        
        
        for(int k=0; k<=15;k++){
               for(int z=0; z<=7;z++){
              r2d2.Hinlegen(); 
             r2d2.Schritt();
             
          }
          r2d2.LinksDrehen();
        }
        for(int i=0; i<=3;i++){
               for(int j=0; j<=3;j++){
                r2d2.Schritt();
                   r2d2.Hinlegen();
             
                
                 r2d2.Schritt();
             r2d2.MarkeSetzen();
             
             
          }
          
          r2d2.LinksDrehen();
        }
        r2d2.LinksDrehen();
        r2d2.Schritt();
        r2d2.RechtsDrehen();
        for(int e=0; e<=2;e++){
               for(int r=0; r<=x;r++){
             
                r2d2.Hinlegen();
                 
          }
          r2d2.Schritt();
          x--;
        }
        r2d2.Schritt();
        r2d2.Schritt();
        for(int m=0; m<=20;m++){
          while(elpepe.IstWand()==false){
             if(elpepe.IstZiegel()==true){
                 elpepe.Aufheben();
             
            
             }
             else
             {
                
                
                elpepe.Schritt();
                
                
                
              }     
              if(elpepe.IstRoboter()==true){
                
                elpepe.LinksDrehen();
                elpepe.Schritt();
                elpepe.RechtsDrehen();
                elpepe.Schritt();
                elpepe.Schritt();
                elpepe.RechtsDrehen();
                elpepe.Schritt();
                elpepe.LinksDrehen();
                }  
            }
            elpepe.LinksDrehen();
            elpepe.Schritt();
            elpepe.LinksDrehen();
        }
    
    }
//dies ist die Klammer, die die Klasse schließt
}
