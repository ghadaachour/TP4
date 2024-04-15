package exercice2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GHADA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private String firstName ;
    private String lastName ;
     private String email;
    private Long cin;
     
    public void displayInfo() {
        System.out.println("firstname: " + firstName);
        System.out.println("lastname: " + lastName);
        System.out.println("e-mail: " + email);
        System.out.println("cin : " + cin);
    }

    public void updateProfile(String newFirstName, String newLastName, String newEmail) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.email = newEmail;
    }
    public Boolean authentification(){
    return true;
}

 
    }
