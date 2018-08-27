import java.io.*;
import java.util.*;

    public class Time{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Some Integer For Change into Hour Format:");
        int Input=sc.nextInt();
        int Hour=Input/60;
        int Minutes=Input%60;
        System.out.println("---->"+Hour+":"+Minutes);
        }
      }  
