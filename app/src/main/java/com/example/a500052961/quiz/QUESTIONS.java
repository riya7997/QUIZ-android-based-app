package com.example.a500052961.quiz;


public class QUESTIONS {
    public String Ques[] = {"The language spoken by the people by Pakistan is ?",
            "The World Largest desert is ? ?",
            "The metal whose salts are sensitive to light is ?",
            "The Central Rice Research Station is situated in ?",
            "Country that has the highest in Barley Production ?",
            "First Computer Virus is known as?",
            "A dual layer Blue-ray Disc can store upto?",
            "Who is the founder of Wikipedia?",
            "Durand Cup is associated with?",
            "The Man Booker Prize or commonly called Booker Prize is given in which field?"

    };
    private String Options[][] = {
            {"Hindi", "Palauan", "Sindhi", " Nauruan"},
            {"Thar", " Kalahari", " Sahara", " Sonoran"},
            {"Zinc", "Silver", "Copper", " Aluminium"},
            {"Chennai", "Cuttack", "Bangalore", " Quilon"},
            {"China", "India", "Russia", " France"},
            {"Rabbit", "Creeper Virus", "Elk Cloner", "SCA Virus"},
            {"20 GB", "30 GB", "50 GB", " 15 GB"},
            {"Peer Schneider", "Byron Looper", "Jimmy wales", "Mark Fletcher"},
            {"Swimming", "Football", "TableTennis", "Hockey"},
            {"Sports", "Medicine", "Science", "Fiction writing"}
    };
    private String Answers[] = {"Sindhi", "Sahara", "Silver", "Cuttack", "Russia", "Elk Cloner", "50 GB", "Jimmy wales", "Football", "Fiction writing"};

    public String getQuestion(int a) {
        String q = Ques[a];
        return q;
    }

    public String getOption1(int a) {
        String c = Options[a][0];
        return c;
    }

    public String getOption2(int a) {
        String c = Options[a][1];
        return c;
    }

    public String getOption3(int a) {
        String c = Options[a][2];
        return c;
    }

    public String getOption4(int a) {
        String c = Options[a][3];
        return c;
    }
    public String correctans(int a){
        String ans = Answers[a];
        return ans;
    }
}