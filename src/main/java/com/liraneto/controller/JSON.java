package com.liraneto.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liraneto.model.json.FichaJSON;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Paths;

public class JSON {

    public static void jsonToFichaJSON (String json){
        try {
            FichaJSON fichaJSON;
            ObjectMapper objectMapper = new ObjectMapper();
            fichaJSON = objectMapper.readValue(json, FichaJSON.class);
            System.out.println(fichaJSON);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printFichaJSONFromFile (String json){
        try {
            FichaJSON fichaJSON;
            ObjectMapper objectMapper = new ObjectMapper();
            fichaJSON = objectMapper.readValue(Paths.get(json).toFile(), FichaJSON.class);
            System.out.println(fichaJSON);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FichaJSON getFichaJSONFromFile (String json){
        try {
            FichaJSON fichaJSON;
            ObjectMapper objectMapper = new ObjectMapper();
            fichaJSON = objectMapper.readValue(Paths.get(json).toFile(), FichaJSON.class);
            return fichaJSON;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static FichaJSON getFichaJSONFromURL (String id){
        String json = "";

        try {
            json = readJsonFromUrl("https://pathbuilder2e.com/json.php?id=" + id);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        try {
            FichaJSON fichaJSON;
            ObjectMapper objectMapper = new ObjectMapper();
            fichaJSON = objectMapper.readValue(json, FichaJSON.class);
            return fichaJSON;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static String readJsonFromUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            return jsonText;
        } finally {
            is.close();
        }
    }
}
