public class Madlib {
    String classmate;
    String city;
    String noun;
    String adjective;
    String pluralNoun;
    String pluralAnimal;
    Boolean trueOrFalse;
    double decimalBiggerThan1;
    int number1;
    int number2;
    int wholeNumberBetween1And4;
    String miltonTeacher;
    String miltonDean;
    String letterGrade1;
    String letterGrade2;
    String letterGrade3;
    String season;


    public Madlib() {
        classmate = "stella";
        city = "boston";
        noun = "bookshelf";
        adjective = "scared";
        pluralNoun = "pineapples";
        pluralAnimal = "dogs";
        trueOrFalse = true;
        decimalBiggerThan1 = 3.2;
        number1 = 13;
        number2 = 87;
        wholeNumberBetween1And4 = 3;
        miltonTeacher = "Mr. Robson";
        miltonDean = "Ms. Sugrue";
        letterGrade1 = "A";
        letterGrade2 = "E";
        letterGrade3 = "C";
        season = "winter";
    }

        //define a string called story for madlib
        public void printStory(){
            System.out.println("This weekend I am going camping with "
                + classmate + ". We are going to a campsite in "
                + city + ". I packed my " + noun + " and "
                + pluralNoun + ".  The forecast is calling for a high of "
                + decimalBiggerThan1 + " degrees fahrenheit. So it should be a "
                + adjective + " day! This year, the park rangers have seen "
                + number1 + " " + pluralAnimal + " which seems kind of dangerous. "
                + miltonTeacher + " said it's " + trueOrFalse + " that " + pluralAnimal + " eat class "
                + wholeNumberBetween1And4 + " students in the " + season + ". But, "
                + miltonDean + " said it actually has only happened "
                + number2 + " times. Wish us luck! If we survive, we will earn an "
                + letterGrade1 + "- in P.E. class. If we do not, we will earn an " + letterGrade2 + "! Unfortunately this trip is during exam week so we will automatically earn the class exam average of a " + letterGrade3 + "+ on our other exams!");
    }
}
