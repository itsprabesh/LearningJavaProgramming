package com.prabeshpaudel;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Credentials {
    private String username;
    private String password;
    private static  Map<String, String> credentials = new HashMap<>();


    public String getUsername() {
        return username;
    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;

        try {
            FileWriter fileWriter = new FileWriter("credentials.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter, true);
            printWriter.append(username + " " + password + " \n");
            printWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error");
        }
    }

    public static void loadCredentials() {
        try {
            FileReader fileReader = new FileReader("credentials.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;


            while ((line = bufferedReader.readLine()) != null ) {
                String[] creds = line.split("\\s+");
                String user = creds[0];
                String pass = creds[1];
                credentials.put(user, pass);
            }
        }
        catch (IOException ex) {
            System.out.println("Error");
        }
    }

    public static boolean canLogin(String username,String password) {
        loadCredentials();
        if(credentials.containsKey(username) && credentials.get(username).equals(password)) {
                return true;
        } else {
            return false;
        }
    }

    public static void changePassword(String username, String oldPassword, String newPassword) {
        loadCredentials();
        if(credentials.containsKey(username) && credentials.get(username).equals(oldPassword)) {
            credentials.put(username, newPassword);

        }
        try {
            FileWriter fileWriter = new FileWriter("credentials.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write("");
            printWriter.close();
            fileWriter.close();

            FileWriter newFileWriter = new FileWriter("credentials.txt", true);
            PrintWriter newPrintWriter = new PrintWriter(newFileWriter, true);

            for(Map.Entry<String, String > credential : credentials.entrySet()) {
                newPrintWriter.append(credential.getKey() + " " + credential.getValue() + "\n");
            }
            newPrintWriter.close();
            newFileWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error");
        }
    }

    public void changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)) {
            changePassword(this.username, oldPassword, newPassword);
        }
    }
}
