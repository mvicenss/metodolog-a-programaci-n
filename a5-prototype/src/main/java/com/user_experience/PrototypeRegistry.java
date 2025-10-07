package src.main.java.com.user_experience;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    
    //to store prototypes (the actual objects)
    private Map<String, UserExperiencePrototype> prototypes = new HashMap<>();
    
    //to add prototypes into the registry
    public void addPrototype(String key, UserExperiencePrototype prototype) {
        prototypes.put(key, prototype);
    }

    //to get a clone from the registry 
    public UserExperiencePrototype getClone(String key){

        UserExperiencePrototype prot = prototypes.get(key);

        if(prot == null){ //check if prototype exists
            return null; // if it doesn't, can't clone
        }else{
            try {
                return (UserExperiencePrototype) prot.clone(); // if it exists, clone prototype
            }catch (CloneNotSupportedException e) { //if it fails to clone, return null
                return null; 
            }
        }        
    }

    public void showPrototype(){
        System.out.println("Prototypes in registry:");
        for(UserExperiencePrototype proto: prototypes.values()){
            ui.show(proto);
        }
    }
}