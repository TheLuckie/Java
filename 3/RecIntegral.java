/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brigada11.lab3;

/**
 *
 * @author Danila
 */
public class RecIntegral {
    private double lower;   // Нижний порог
    private double upper;   // Верхний порог
    private double step;    // Шаг
    private double result;  // Результат вычислений
    
    // Константы для диапазона
    private static final double MIN_VALUE = 0.000001;
    private static final double MAX_VALUE = 1000000;

    public RecIntegral(double lower, double upper, double step, double result) 
            throws CustomException {
        
        validateValue(lower, "Нижний предел");
        validateValue(upper, "Верхний предел");
        validateValue(step, "Шаг");
        
        // ✅ Добавить проверку: нижний предел должен быть меньше верхнего
        if (lower >= upper) {
            throw new CustomException(
                String.format("Нижний предел (%.6f) должен быть меньше верхнего предела (%.6f)", lower, upper)
            );
        }
        
        // ✅ Добавить проверку: шаг должен быть положительным
        if (step <= 0) {
            throw new CustomException("Шаг должен быть положительным числом!");
        }
        
        this.lower = lower;
        this.upper = upper;
        this.step = step;
        this.result = result;
    }
    
    private void validateValue(double value, String fieldName) 
            throws CustomException {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new CustomException(
                String.format("%s должен быть в диапазоне от %f до %f! (Введено: %f)", 
                fieldName, MIN_VALUE, MAX_VALUE, value)
            );
        }
    }
    
    public double getLower() {
        return lower;
    }

    public void setLower(double lower) throws CustomException {
        validateValue(lower, "Нижний предел");
        // ✅ Проверка: нижний не должен быть больше или равен верхнему
        if (lower >= this.upper) {
            throw new CustomException(
                String.format("Нижний предел (%.6f) должен быть меньше верхнего предела (%.6f)", lower, this.upper)
            );
        }
        this.lower = lower;
    }

    public double getUpper() {
        return upper;
    }

    public void setUpper(double upper) throws CustomException {
        validateValue(upper, "Верхний предел");
        // ✅ Проверка: верхний не должен быть меньше или равен нижнему
        if (this.lower >= upper) {
            throw new CustomException(
                String.format("Нижний предел (%.6f) должен быть меньше верхнего предела (%.6f)", this.lower, upper)
            );
        }
        this.upper = upper;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) throws CustomException {
        validateValue(step, "Шаг");
        if (step <= 0) {
            throw new CustomException("Шаг должен быть положительным числом!");
        }
        this.step = step;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public static void validateStep(double step) throws CustomException {
        if (step <= 0) {
            throw new CustomException("Шаг должен быть положительным числом! (Введено: " + step + ")");
        }
        // ✅ Также проверить диапазон
        if (step < MIN_VALUE || step > MAX_VALUE) {
            throw new CustomException(
                String.format("Шаг должен быть в диапазоне от %f до %f! (Введено: %f)", 
                MIN_VALUE, MAX_VALUE, step)
            );
        }
    }
}