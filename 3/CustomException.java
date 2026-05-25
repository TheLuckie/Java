/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brigada11.lab3;

/**
 *
 * @author Danila
 */
public class CustomException extends Exception {  
    public CustomException(String message) {
        super(message);
    }
    
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}