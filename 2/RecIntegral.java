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
    private double lower;
    private double upper;
    private double step;
    private double result;
    
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
    
public static double calculateIntegral(double a, double b, double h) {
    java.util.function.DoubleUnaryOperator f = x -> 1/x;
    
    double sum = 0;
    double currentX = a;
    
    while (currentX < b) {
        double nextX = currentX + h;

        if (nextX > b) {
            h = b - currentX;
            nextX = b;
        }

        sum += (f.applyAsDouble(currentX) + f.applyAsDouble(nextX)) * h / 2.0;
        
        currentX = nextX;
    }
    
    return sum;
    }
}


