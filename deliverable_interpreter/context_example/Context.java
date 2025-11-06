package context_example;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, Double> variables = new HashMap<>();

    // Storing variables
    public void setValue(String variableName, double value) {
        variables.put(variableName, value);
    }

    //Get value of variable
    public double getValue(String variableName) {
        if (!variables.containsKey(variableName)) {
            System.out.println("Error: Variable no definida: " + variableName);
            return 0; // O lanzar una excepción
        }
        return variables.get(variableName);
    }

}
