import java.time.chrono.MinguoChronology;
import java.util.Scanner;

class Array_2D{
    Scanner sc=new Scanner(System.in);


    // Addition of the matrix
    public void sum_Of_Matrix(){
        
        System.out.println("enter the size of the array ");
        int size=sc.nextInt();
        int[][] a =new int[size][size];
        int[][] b =new int[size][size];
        int[][] c =new int[size][size];
        
        // input first matrix
        System.out.print("\nEnter the element of the 1st  array     \n");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               a[i][j]=sc.nextInt();  
            }
            System.out.println();
        }

           // input 2nd matrix 
            System.out.print("\nEnter the element of the 2nd array     \n");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                   b[i][j]=sc.nextInt();  
                }
                System.out.println();
                
            }       
         
            // Print sum of the matrix 
            System.out.print("\nsum of the matrix is    \n");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+" ");  
            }
            System.out.println();
        }

    }

    

    // Substraction of the matrix
  
   
    public void substration_Of_Matrix(){
        
        System.out.println("enter the size of the array ");
        int size=sc.nextInt();
        int[][] a =new int[size][size];
        int[][] b =new int[size][size];
        int[][] c =new int[size][size];
        
        // input first matrix 
        System.out.print("\nEnter the element of the 1st  array     \n");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               a[i][j]=sc.nextInt();  
            }
            System.out.println();
        }

           // input 2nd matrix
            System.out.print("\nEnter the element of the 2nd array     \n");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                   b[i][j]=sc.nextInt();  
                }
                System.out.println();
                
            }       
         
            // print the substraction of the matrix
            System.out.print("\nsubstration of the matrix is    \n");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               c[i][j]=a[i][j]-b[i][j];
               System.out.print(c[i][j]+" ");  
            }
            System.out.println();
        }

    }
     


    
    
    // multiplication of the matrix
    public void multiplication_Of_Matrix(){
        
        
        
        System.out.println("enter the size of the array ");
        int size=sc.nextInt();
        int[][] a =new int[size][size];
        int[][] b =new int[size][size];
        int[][] c =new int[size][size];
        
        // input first matrix
        System.out.print("\nEnter the element of the 1st  array     \n");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               a[i][j]=sc.nextInt();  
            }
            System.out.println();
        }

         // input 2nd matrix
            System.out.print("\nEnter the element of the 2nd array     \n");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                   b[i][j]=sc.nextInt();  
                }
                System.out.println();
                
            }       
         
            // print multiplication 
            System.out.print("\nMultiplication of the matrix is    \n");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
            for(int k=0;k<c.length;k++){
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
            System.out.println();
            }
            
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }


    
    // find the sum of the diagonal elements
    public void Sum_Of_Diagonals(){
        int Main_diagonal=0, Min_diagonal=0;
        System.out.println("Enter the size of the matrix    ");
        int n=sc.nextInt();
     int[][] array=new int[n][n];
        
        // input matrix elements
     System.out.print("Enter the element of the matrix   \n");
     for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length;j++){
        array[i][j]=sc.nextInt();
     }   

     System.out.println();
     }
   
        
        // print matrix
     for(int k=0;k<array.length;k++){
        for(int l=0;l<array.length;l++){
            System.out.print(array[k][l]+"  ");
        }
        System.out.println();
     }


        
        // find the sum of the main and minor diagonal
     for(int k=0;k<array.length;k++){
        for(int l=0;l<array.length;l++){
            if(k==l){
                Main_diagonal+=array[k][l];
            }
            if(k+l==n-1){
               Min_diagonal+=array[k][l];
            }
        }
    }
    System.out.println("\n  Sum of the main diagonal   "+Main_diagonal+"\n  Sum of the Min diagonal   "+Min_diagonal);
     }
     


     
    
  // Main method
    public static void main(String[] args) {
        Array_2D object=new Array_2D();
       // object.Sum_Of_Diagonals();
        object.multiplication_Of_Matrix();
        // object.sum_Of_Matrix();
        // object.substration_Of_Matrix();
    }
}






