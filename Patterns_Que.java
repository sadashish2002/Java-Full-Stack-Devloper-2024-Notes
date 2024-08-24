import java.util.*;
public class Patterns_Que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for print pattern");
        int n = sc.nextInt();
       
                                       // pattern1 
        
                                        // *****
                                        // *****
                                        // *****
                                        // *****
                                        // *****
        /*
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

                                                 // pattern 2
                                         * 
                                        * *
                                        * * *
                                        * * * * 
                                        * * * * *

        /*
          for(int i = 0;i<n;i++){
            for(int j =0 ;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
         }
         */

                                                         //pattern 3
                                                1 
                                                1 2
                                                1 2 3
                                                1 2 3 4
                                                1 2 3 4 5
         /*
          for(int i = 1;i<=n;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
          */

         
                                                        // pattern 4
                                                            1 
                                                            2 2
                                                            3 3 3
                                                            4 4 4 4
                                                            5 5 5 5 5
         /* for(int i = 1;i<=n;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
         }
         */

                                                              // pattern 5
                                                    
                                                    * * * * *
                                                    * * * *
                                                    * * *
                                                    * *
                                                    *
        //   for(int i = n;i>0;i--){
        //     for(int j =1 ;j<=i;j++){
        //             //or 
        //         //for(int i =0;i<n;i++){
        //         // for(int j =1;<n-i+1;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
           
        // }

                                                        //  pattern 6
                                                1 2 3 4 5 
                                                1 2 3 4
                                                1 2 3
                                                1 2
                                                1
                                             
       /*  for(int i =0;i<n;i++){
                for(int j =1;j<n-i+1;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
               
            } */

                                                       /* // pattern 7
                                                       
                                                *    
                                               ***
                                              *****
                                             *******
                                            *********
            for(int i =0;i<n;i++){
                //space print
                for(int j =0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                //star print
                for(int j =0;j<2*i+1;j++){
                    System.out.print("*");
                }
                //space print
                for(int j =0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                System.out.println();
               
            } */

                                             // pattern 8
                                             
                                                     *********
                                                      *******
                                                       *****   
                                                        ***
                                                         *
                                             
       /*
             for(int i =0;i<n;i++){
                //space print
                for(int j =0;j<=i;j++){
                    System.out.print(" ");
                }
                //star print
                for(int j =0;j<2*(n-i)-1;j++){
                    System.out.print("*");
                }
                //space print
                for(int j =0;j<=i;j++){
                    System.out.print(" ");
                }
                System.out.println();
               
            } */

                                                   // pattern 9
                                                *
                                               ***
                                              *****
                                             *******
                                            *********
                                            *********
                                             *******
                                              *****
                                               ***
                                                *
             
             /*
         //above half part patern code
            for(int i =0;i<n;i++){
                //space print
                for(int j =0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                //star print
                for(int j =0;j<2*i+1;j++){
                    System.out.print("*");
                }
                //space print
                for(int j =0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                System.out.println();
               
            } 
       
            //below half part pattern code
             for(int i =0;i<n;i++){
                //space print
                for(int j =0;j<i;j++){
                    System.out.print(" ");
                }
                //star print
                for(int j =0;j<2*(n-i)-1;j++){
                    System.out.print("*");
                }
                //space print
                for(int j =0;j<i;j++){
                    System.out.print(" ");
                }
                System.out.println();
               
            } */

                                                //pattern 10
                                                        *
                                                        * *
                                                        * * *
                                                        * * * *
                                                        * * * * *
                                                        * * * *
                                                        * * *
                                                        * *
                                                        * 
           /*
             for(int i=1;i<=n;i++){
                for(int j =1;j<=i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
           
            int m = n-1;
            for(int i=1;i<=m;i++){
                for(int j =1;j<=m-i+1;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

            */
 
                                              // Pattern 11
                                                    1 
                                                    0 1
                                                    1 0 1
                                                    0 1 0 1
                                                    1 0 1 0 1

                                             
            // int start =0;
            // for(int i=0;i<n;i++){
            //     if(i%2==0)
            //        start =1;
            //     else
            //        start =0;
                
            //     for(int j =0;j<=i;j++){
            //         System.out.print(start+" ");
            //         start = 1 -start;
            //     }
            //     System.out.println();
            // }


                                             // Pattern 12
                                             
                                        1                 1 
                                        1 2             2 1
                                        1 2 3         3 2 1
                                        1 2 3 4     4 3 2 1
                                        1 2 3 4 5 5 4 3 2 1
                                             
 /*
            for(int i = 0;i<n;i++){
                
                for(int j =1;j<=i+1;j++){
                    System.out.print(j+" ");
                }

                for(int j = 0;j<((2*(n-i))-2);j++){
                    System.out.print(" "+" ");
                }

                for(int j =i+1;j>0;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            } */

                                                 //pattern 13
                                                1     
                                                2 3
                                                4 5 6
                                                7 8 9 10
                                                11 12 13 14 15
                                             
/*
 
            int num =1;
        for(int i =1;i<=n;i++){
            for(int j =0;j<i;j++){
            System.out.print(num+++" ");

            }
               //space
        for(int j =0;j<n-i;j++){
            System.out.print(" ");
        }
        System.out.println();
        }
 */

    // Pattern 1
                                                    A B 
                                                    A B C
                                                    A B C D
                                                    A B C D E
                                                    A B C D E F 
         /*
          
    for(int i = 1;i<=n;i++){
        for(char j = 'A';j<='A'+i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
          */

                                    // Pattern 15
                                        
                                        // A B 
                                        // A B C
                                        // A B C D
                                        // A B C D E
                                        // A B C D E F
          /*for(int i = 0;i<n;i++){
            for(char j = 'A';j<= 'A'+(n-1-i);j++){
                System.out.print(j+" "); 
            }
            System.out.println();
        } */

                                       // Pattern 16
        
                                            // A 
                                            // B B
                                            // C C C
                                            // D D D D
                                            // E E E E E
     /*   char ch = 'A';
        for(int i = 0;i<n;i++){
            for(char j = 0;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        } */

                                                    // Pattern 17
        
                                            //           A     
                                            //         A B A
                                            //       A B C B A
                                            //     A B C D C B A  
                                            //   A B C D E D C B A
/*
for(int i = 0;i<n;i++){
    // space 
    for(int j = 0;j<n-1-i;j++){
        System.out.print("-"+" ");
    }
    //Alphabet
    for(char j = 'A';j<='A'+i;j++){
         System.out.print(j+" ");
    }
    //Alphabet
    if(i!=0){ 
    char c = (char) ('A'+i);
    for(int j = 0;j<i;j++){
        
            System.out.print(--c+" ");    
    }
    }
    //space
    for(int j = 0;j<n-1-i;j++){
        System.out.print("-"+"");

    }
    System.out.println();
} */

                                        // pattern 18
        
                                            // E 
                                            // D E
                                            // C D E
                                            // B C D E
                                            // A B C D E

             /*for(int i =0;i<n;i++){
                char c = (char)('A'+(n-i-1));
                for(int j=0;j<=i;j++){
                    System.out.print(c++ +" " );
                }
                System.out.println();
             } */

                                            //pattern 19

                                                // E 
                                                // E D
                                                // E D C
                                                // E D C B
                                                // E D C B A
        
            /* for(int i =0;i<n;i++){
                char c = (char)('A'+(n-1));

            for(int j=0;j<=i;j++){
               System.out.print(c-- +" " );
             }
              System.out.println();
             } */

                                                //pattern 20
        
                                            // * - - - - - - - - * 
                                            // * * - - - - - - * *
                                            // * * * - - - - * * *
                                            // * * * * - - * * * *
                                            // * * * * * * * * * * 
                                            // * * * * - - * * * *
                                            // * * * - - - - * * *
                                            // * * - - - - - - * * 
                                            // * - - - - - - - - *
        
        //Upper symmetrics pattern print

           /*  for(int i =0;i<n;i++){
                //star
                for(int j =0;j<n-i;j++){
                    System.out.print("*"+" ");
                }
                //spaces
                for(int j =1;j<=2*i;j++){
                    System.out.print("-"+" ");
                }
                //star
                for(int j =n-i;j>0;j--){
                    System.out.print("*"+" ");
                }
                System.out.println();
                 
             }
           //lower symmetrics pattern print
             for(int i =0;i<n;i++){
                //star
                for(int j =0;j<=i;j++){
                    System.out.print("*"+" ");
                }
                //spaces
                for(int j =1;j<=2*(n-i-1);j++){
                    System.out.print("-"+" ");
                }
                //star
                for(int j =1;j<=i+1;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
             } */
 

                                             // pattern 21
        
                                            // * * * * * * * * * *
                                            // * * * * - - * * * * 
                                            // * * * - - - - * * * 
                                            // * * - - - - - - * * 
                                            // * - - - - - - - - *
                                            // * - - - - - - - - * 
                                            // * * - - - - - - * *
                                            // * * * - - - - * * * 
                                            // * * * * - - * * * * 
                                            // * * * * * * * * * * 
             /*int space = 2*n-2;
             for(int i =1;i<=2*n-1;i++){
                int star  =i;

                if(i>n){
                    star = 2*n-i;
                }
                //star
                for(int j =1;j<=star;j++){
                    System.out.print("*"+" "); 
                }
                //spaces
                for(int j =1;j<=space;j++){
                    System.out.print("-"+" ");
                }
                //star
                for(int j =1;j<=star;j++){
                    System.out.print("*"+" "); 
                }
                System.out.println();
                if(i<n){
                    space -= 2;
                }
                else{
                    space += 2;
                }
             }
                 */

      // Pattern 22
        
                                                    // *****
                                                    // *   *
                                                    // *   *
                                                    // *   *
                                                    // *****
    
      for(int i =0;i<n;i++){
        for(int j = 0;j<n;j++){
            if(i==0 || j==0 || i ==n-1 || j==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }




    }
}
