package exercice2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GHADA
 */

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Hatto
 */
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String name ;
    private List<String> contents;
    private Float coefficient;
 

}
    

