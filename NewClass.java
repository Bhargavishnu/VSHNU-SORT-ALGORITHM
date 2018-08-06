/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BHARGAV VISHNU
 */
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class NewClass {
    public static void main(String args[])
    {int i,n,q,temp,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of elements");
    n=sc.nextInt();
    int a[]=new int [2000];
    System.out.println("enter new array");
    for(i=0;i<n;i++)
    {a[i]=sc.nextInt();
    }
    j=0;
    q=n/2;
    while(j<=q)
    {for(i=0;i<n-1;i=i+2)
    { if(a[i]>a[i+1])
    {temp=a[i];
    a[i]=a[i+1];
    a[i+1]=temp;
    }}
    for(i=1;i<n-1;i=i+2)
    { if(a[i]>a[i+1])
    {temp=a[i];
    a[i]=a[i+1];
    a[i+1]=temp;
    }}
    j++;
    }
    System.out.println("array elements sorted is");
    for(i=0;i<n;i++)
    {System.out.println(a[i]);
    }
    }}