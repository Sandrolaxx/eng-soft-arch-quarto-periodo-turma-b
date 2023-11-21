package services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CaculatorServices {
 
    public Double addition (double val1, double val2){
        return val1 + val2;
    }

   public Double subtraction(double val1, double val2){
        return val1 - val2;
    }

    public Double division (double val1, double val2){
        return val1 / val2;
    }

    public Double multiplication(double val1, double val2){
        return val1 * val2;
    }
    
}
