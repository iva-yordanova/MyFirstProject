package com.homework_6;

public class Italian extends Person{
    public Italian(String name, String sex, String religion, String languageSpoken, String nationality, String job, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, nationality, job, countryOfResidence);
    }
    public String sayHello() {
        if (languageSpoken == "Italian") {
            return "Ciao! ";
        } else {
            return "Hello! I don't speak Italian. ";
        }
    }

    public String celebrateEaster() {
        if ((religion == "Orthodox" || religion == "Catholic") && languageSpoken == "Italian") {
            return "Celebro la Pasqua.";
        } else if ((religion != "Orthodox" || religion != "Catholic") && languageSpoken == "Italian") {
            return "Non celebro la Pasqua.";
        } else if ((religion == "Orthodox" || religion == "Catholic") && languageSpoken != "Italian") {
            return "I celebrate Easter.";
        } else {
            return "I don't celebrate Easter.";
        }
    }
}
