package ru.mirea.task3;

public class Human {
    private char gender;
    private int weight;

    public Human(int weight,char gender){
        this.gender=gender;
        this.weight=weight;

    }
    public char getGender(){
        return gender;
    }
    public int getWeight() {
        return weight;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public class Head {
        private String hairColor;
        private int eyeNumber;

        public Head(String hairColor, int eyeNumber){
            this.hairColor = hairColor;
            this.eyeNumber = eyeNumber;
        }

        public String getHairColor(){
            return hairColor;
        }

        public void setHairColor(String hair){
            hairColor = hairColor;
        }

        public int getEyeNumber(){
            return eyeNumber;
        }

        public void setEyeNumber(int eyes){
            eyeNumber = eyes;
        }
        public String toString(){
            return String.format("Human hair color and number of eyes-  (%s, %s )",this.hairColor,this.eyeNumber);
        }
    }
    public class Hand {
        private int fingerNumber;
        private int size;

        public Hand(int fingerNumber, int size){
            this.fingerNumber = fingerNumber;
            this.size = size;
        }

        public int getFingerNumber(){
            return fingerNumber;
        }

        public void setFingerNumber(int fingerNumber){
            this.fingerNumber = fingerNumber;
        }

        public int getSize(){
            return size;
        }

        public void setSize(int size){
            this.size = size;
        }
        public String toString(){
            return String.format("Human hand size and number of fingers-  (%s, %s )",this.size,this.fingerNumber);
        }
    }
    public class Leg {
        private int size;
        private boolean both;

        public Leg(int size, boolean both){
           this.both=both;
           this.size=size;
        }

        public int getSize(){
            return size;
        }

        public void setSize(int size){
            this.size=size;
        }

        public boolean getBoth(){
            return both;
        }

        public void setBoth(boolean both){
            this.both=both;
        }
        public String toString(){
            return String.format("Human legs size and does he own both legs-  (%s, %s )",this.size,this.both);
        }
    }
    public String toString(){
        return String.format("Human gender and weight -  (%s, %s)",this.gender,this.weight);
    }


}
