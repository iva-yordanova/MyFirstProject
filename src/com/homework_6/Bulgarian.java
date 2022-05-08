package com.homework_6;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, String languageSpoken, String nationality, String job, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, nationality, job, countryOfResidence);
    }

    public String sayHello() {
        if (languageSpoken == "Bulgarian") {
            return "Здравейте! ";
        } else {
            return "Hello! I don't speak Bulgarian. ";
        }
    }

    public String celebrateEaster() {
        if ((religion == "Orthodox" || religion == "Catholic") && languageSpoken == "Bulgarian") {
            return "Aз празнувам Великден.";
        } else if ((religion != "Orthodox" || religion != "Catholic") && languageSpoken == "Bulgarian") {
            return "Аз не празнува Великден.";
        } else if ((religion == "Orthodox" || religion == "Catholic") && languageSpoken != "Bulgarian") {
            return "I celebrate Easter.";
        } else {
            return "I don't celebrate Easter.";
        }
    }
}


