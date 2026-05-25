/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brigada11.lab2;

/**
 *
 * @author Danila
 */
public class RecIntegral {
    private double lower;   // Нижний порог
    private double upper;   // Верхний порог
    private double step;    // Шаг
    private double result;  // Результат вычислений
    
    public RecIntegral(double lower, double upper, double step, double result) {
            this.lower = lower;
            this.upper = upper;
            this.step = step;
            this.result = result;
        }
    
    public double getLower() { 
        return lower; 
    }
    
    public double getUpper() { 
        return upper; 
    }
    
    public double getStep() { 
        return step; 
    }
    
    public double getResult() { 
        return result; 
    }
    
    // Сеттеры (методы для установки значений)
    
    public void setLower(double lower) { 
        this.lower = lower; 
    }
    
    public void setUpper(double upper) { 
        this.upper = upper; 
    }
    
    public void setStep(double step) { 
        this.step = step; 
    }
    
    public void setResult(double result) { 
        this.result = result; 
    }
}


