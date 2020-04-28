classe abstraite  publique Figure { 

   // attributs
          // instance
             double   longeur protégé ;
          // Classe
            protégé  statique  String unite;  

   // Méthodes
    // Intances
     // Constructeur: est une méthode qui porte le meme nom que la classe et n'a pas de type // de retour
       // Constructeur par défaut
        Figure publique () {
      }
   // Getters et Setters => toujours methodes betons, methodes Intances ou methodes // Classe
     // Getters et Setters de longueur
      public  double  getLongeur () {
          retourner  cela . longueur;
     }

     public  void  setLongeur ( double  longueur ) {
            ça . longueur = longueur;
     }

  // Getters et Setters de unite
      public  static  String  getUnite () {
          retourner unir;
     }

     public  static  void  setUnite ( String  unite ) {
            La figure . unir = unir;
     }
   
   // metiers
     public  abstrait  double  demiPerimetre ();    
      
     double  périmètre public () {
         demiPerimetre () * 2 ;
   }  

    double surface abstraite  publique (); 
    double diagonale abstraite  publique ();    

      

}