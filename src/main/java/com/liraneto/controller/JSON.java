package com.liraneto.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liraneto.model.json.FichaJSON;

import java.io.IOException;
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

    public static void jsonToFichaJSON2 (String json){
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
}
