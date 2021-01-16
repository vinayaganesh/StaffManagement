/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author vinga
 */
public class NewClass {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s="Raj Kapoor";
        s=s.toLowerCase();
        System.out.println("Input Name");
        String userNameToSearch = sc.nextLine();
        
        if (s.contains(userNameToSearch.toLowerCase())){
            System.out.println("IT DOES");
        }else
            System.out.println("It Doesnt");
    }
}
