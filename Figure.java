puplic abstract class Fihure{

   //attributs
          //instance
              protected double longueur;
          //classe
              protected static String unite;


   //methodes
          //instance 
   //constructeur : est une methode qui porte le meme nom que la classe et n'a pas de type de retour
   //constructeur par defaut

     public Figure(){
     
     }


    // getters setters => toujours des methodes concretes, des methodes d'instances ou methodes de class
   

     //classe 
         //getters et setters longueur
         public double getLongueur(){
             return this.longueur;
         }

         puplic void setLongueur(double longueur){
             this.longueur=Longueur;
         }

         //getters et setters de unite
         public static String  getUnite(){
             return unite;
         }

         puplic static void setUnite(String unite){
             Figure.unite=unite;
         }
 

         //metiers
            puplic abstract double demiPerimetre();
                
            public double perimetre(){
                  demiPeimetre * 2;
            }
 
            public abstract double surface();
            public abstract 

} 
