package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Exercise23 {


    public static Map<String, Person> createHashMap() {
        Map<String, Person> hash = new HashMap<>();

        hash.put("person", new Person("John", "Smith"));
        hash.put("teacher", new Teacher("María", "Montessori", "Educación"));
        hash.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        hash.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        return hash;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        //map.put("police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry <String, Person> hashUpdate : map.entrySet()){
            System.out.println(hashUpdate.getKey() + " & ");
            hashUpdate.getValue().getDetails();
        }
    }
    
}
