package org.example;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {


        public static void main(String[] args) {
            JSONObject myObject = new JSONObject();

            // Basic strings
            myObject.put("name", "Chris Cassidy");
            myObject.put("name1", "Anatoly Ivanishin");
            myObject.put("name2", "Ivan Vagner");
            myObject.put("name3", "Doug Hurley");
            myObject.put("name4", "Bob Behnken");




            // Key with array
            String myList = "people :";
            System.out.print(myList);

            // Object inside object

            myObject.put("craft", "ISS");
            myObject.put("craft1", "ISS");
            myObject.put("craft2", "ISS");
            myObject.put("craft3", "Crew Dragon C206");
            myObject.put("craft4", "Crew Dragon C206");
            JSONObject success = new JSONObject();
            myObject.put("message", success);

            // Primitive values

            myObject.put("number", new Integer(21));
            myObject.put("message", new String("success"));


            // Generate JSON String
            System.out.print(myObject);
        }
    }







