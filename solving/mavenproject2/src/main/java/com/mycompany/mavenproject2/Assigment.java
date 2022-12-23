/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Mohamed
 */

import java.util.Scanner;
public class Assigment {
    
    public static void main(String argu[]) {
    int n1=0, n2=1;
    System.out.print(n1+' '+n2+' ');
    Scanner input = new Scanner(System.in);
    int limit = input.nextInt();
    for(int i= 2; i< limit;i++ ){
        int next = n1+n2;
        System.out.print(next + ' ');
        int tmp = n2;
        n2 = next;
        n1 = tmp;
    }
    }
}
