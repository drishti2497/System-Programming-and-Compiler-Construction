/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drishti Dhamejani
 */
import java.util.*;
public class Main {
static int i=0,j=0;
static String[] input=new String[100];
static String[] inputArray=new String[100];
static char pVariable;
static String startProd="Not initialised yet";
static String alpha,beta;
static int prodStart;
public static void main(String args[]){
        System.out.println("Enter the productions: (Enter 'end' for end of input)");
        Scanner sc=new Scanner(System.in);
        
        do
        {
            input[i]=sc.nextLine();  
            i++;
        }while(!input[i-1].equals("end"));
        int n=i-1;
        //for(i=0;i<n;i++)
        //{
        //inputArray=input[i].split(" ");
       // }
        for(i=0;i<n;i++)
        {
           // if(inputArray[i].equals("->"))
            //{
             //   pVariable=inputArray[i-1];
               // startProd=inputArray[i+1];
            //}
            prodStart=input[i].indexOf('-');
            pVariable=input[i].charAt(prodStart-1);
            if(input[i].charAt(prodStart-1)==input[i].charAt(prodStart+2))
           {
               System.out.println("Left Recusion occurs");
                Main obj=new Main();
                obj.removeLeftRecursion(inputArray,startProd,input,n);
           }
                
        }
        
    }
  public void removeLeftRecursion(String[] inputArray,String startProd,String[] input, int n)
  {
      System.out.println("Removal of left recursion...");
      int prodEnd=input[j].indexOf("|");
      int start=input[j].indexOf("-");
      for(int j=0;j<n;j++)
      {
      alpha=input[j].substring(start+3,prodEnd);
      beta=input[j].substring(prodEnd+1,input[j].length());
      System.out.println(pVariable+" -> "+beta+" P ");
      System.out.println("P -> epsilon | "+alpha+" P ");
      }
  }
    
}
