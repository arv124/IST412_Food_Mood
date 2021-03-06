/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecontroller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Alex
 */
public class Database {
    
    public String url = "https://foodmood-a4f9d.firebaseio.com/";
    private String username;
    private String password;
    
    public Database() {}
    //*********************************************************************Profile Section********************************************************************
 
    public boolean authProfile(String username, String password)
    {
     String url = "https://foodmood-a4f9d.firebaseio.com/profiles/" + username + ".json";
        String inputLine = "";
        //System.out.println(url);
        try {
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            inputLine = in.readLine();

            if (inputLine.contains(username) && inputLine.contains(password))
                    {
                        System.out.println("Holy shit it works!");
                    return true;
                    }
            else return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    
//This method should take a ProfileModel object.
    public void POSTProfile() throws Exception {
        try {
            URL urlConnection = new URL(url);

            HttpURLConnection con = (HttpURLConnection) urlConnection.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");
// User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();

            //System.out.println("");

            OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream());
            osw.write(jsonFormattedUserData);
            osw.flush();
            osw.close();

            if (con.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                System.out.print("HTTP code : "
                        + con.getResponseCode());
            }

        } catch (MalformedURLException e) {
            System.out.print("URL Malformed");
        }

    }
    // This method should return a profile model object.
    public void readProfileData(String username) {
        String url = "https://foodmood-a4f9d.firebaseio.com/profiles/" + username + ".json";
        String inputLine = "";
        //System.out.println(url);
        try {
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            inputLine = in.readLine();

            //System.out.println(inputLine);//testline
        } catch (Exception e) {
            e.printStackTrace();
        }
        // This will construct a profile model object.
        //return new ProfileModel();
    }
    // this method will take a profilemodel, user data parameter (e.g. weight) and the value of the parameter (e.g. 180)
    public void updateProfileData(String username)
    {
    try {
        String url = "https://foodmood-a4f9d.firebaseio.com/profiles/" + username + ".json";
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");

            
          // User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();
            
            
        } 
    catch (Exception e) 
        {
            e.printStackTrace();
        }
    
    }
    // this method will take a ProfileModel object
    public void deleteProfileData(String username)
    {
    try {
            String url = "https://foodmood-a4f9d.firebaseio.com/profiles/" + username + ".json";
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");

            
          // User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();
            
            
        } 
    catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    // **************************************************************FOODS SECTION***************************************************************************
    public void POSTFood() throws Exception {
        try {
            URL urlConnection = new URL(url);

            HttpURLConnection con = (HttpURLConnection) urlConnection.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");
// User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();

            //System.out.println("");

            OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream());
            osw.write(jsonFormattedUserData);
            osw.flush();
            osw.close();

            if (con.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                System.out.print("HTTP code : "
                        + con.getResponseCode());
            }

        } catch (MalformedURLException e) {
            System.out.print("URL Malformed");
        }

    }
    // This method should return a profile model object.
    public void readFoodData(String foodID) {
        String url = "https://foodmood-a4f9d.firebaseio.com/foods/" + foodID + ".json";
        String inputLine = "";
        //System.out.println(url);
        try {
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            inputLine = in.readLine();

            //System.out.println(inputLine);//testline
        } catch (Exception e) {
            e.printStackTrace();
        }
        // This will construct a profile model object.
        //return new ProfileModel();
    }
    // this method will take a profilemodel, user data parameter (e.g. weight) and the value of the parameter (e.g. 180)
    public void updateFoodData(String foodID)
    {
    try {
        String url = "https://foodmood-a4f9d.firebaseio.com/foods/" + foodID + ".json";
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");

            
          // User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();
            
            
        } 
    catch (Exception e) 
        {
            e.printStackTrace();
        }
    
    }
    // this method will take a ProfileModel object
    public void deleteFoodData(String foodID)
    {
    try {
            String url = "https://foodmood-a4f9d.firebaseio.com/foods/" + foodID + ".json";
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");

            
          // User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();
            
            
        } 
    catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
     // **************************************************************Moods SECTION***************************************************************************
    public void POSTMood() throws Exception {
        try {
            URL urlConnection = new URL(url);

            HttpURLConnection con = (HttpURLConnection) urlConnection.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");
// User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();

            //System.out.println("");

            OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream());
            osw.write(jsonFormattedUserData);
            osw.flush();
            osw.close();

            if (con.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                System.out.print("HTTP code : "
                        + con.getResponseCode());
            }

        } catch (MalformedURLException e) {
            System.out.print("URL Malformed");
        }

    }
    // This method should return a profile model object.
    public void readMoodData(String moodID) {
        String url = "https://foodmood-a4f9d.firebaseio.com/moods/" + moodID + ".json";
        String inputLine = "";
        //System.out.println(url);
        try {
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            inputLine = in.readLine();

            //System.out.println(inputLine);//testline
        } catch (Exception e) {
            e.printStackTrace();
        }
        // This will construct a profile model object.
        //return new ProfileModel();
    }
    // this method will take a profilemodel, user data parameter (e.g. weight) and the value of the parameter (e.g. 180)
    public void updateMoodData(String moodID)
    {
    try {
        String url = "https://foodmood-a4f9d.firebaseio.com/foods/" + moodID + ".json";
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");

            
          // User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();
            
            
        } 
    catch (Exception e) 
        {
            e.printStackTrace();
        }
    
    }
    // this method will take a ProfileModel object
    public void deleteMoodData(String moodID)
    {
    try {
            String url = "https://foodmood-a4f9d.firebaseio.com/foods/" + moodID + ".json";
            URL urlConnect = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlConnect.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            con.setRequestMethod("POST");

            
          // User profile info gets translated into JSON to be used in the next line. Use .getname() kinda stuff.
            String jsonFormattedUserData = new String();
            
            
        } 
    catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

}
