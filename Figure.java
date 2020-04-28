public abstract class Figure { 

   // attributs
          // instance
             protected double longueur;
          // Classe
            protected static String unite;  

   // Méthodes
    // Intances
     // Constructeur: est une méthode qui porte le meme nom que la classe et n'a pas de type // de retour
       // Constructeur par défaut
        public Figure () {
      }

   // Getters et Setters => toujours méthodes concretes, méthodes Intances ou methodes de classe
     // Getters et Setters de longueur
      public  double  getLongeur () {
          ruturn this.longueur;
     }

     public  void  setLongeur (double  longueur){
            this.longueur =longueur;
     }

  // Getters et Setters de unite
      public  static  String  getUnite(){
          retourner unite;
     }

     public  static  void  setUnite(String  unite){
            Figure.unite=unite;
     }
   
   // metiers
     public abstract double demiPerimetre();    
      
     public double  périmètre() {
         demiPerimetre() * 2;
   }  

    public abstract double surface();
    public abstract double diagonale();
    
      

}