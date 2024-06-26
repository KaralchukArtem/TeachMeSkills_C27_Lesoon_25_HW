package com.teachmeskills.lesson25;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONExample {
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        //First Employee book
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstNameBook", "Lokesh");
        employeeDetails.put("lastNameBook", "Gupta");
        employeeDetails.put("websiteBook", "howtodoinjava.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);

        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
