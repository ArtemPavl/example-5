public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнии задания к уроку 5");
        //Домашняя работа 3
        // Задание 1
        System.out.println("Домашняя работа 3");
        System.out.println("Задание 1");
        int age = 18;
        boolean goWork = age >= 24;
        boolean goUniversity = age >= 18 && age < 24;
        boolean goSchool = age >= 7 && age < 18;
        boolean goKindergarten = age >= 2 && age < 7;
        if(goWork){
            System.out.println("Если возраст человека равен " + age
                    + ", то ему нужно ходить на работу");
        } else if(goUniversity) {
            System.out.println("Если возраст человека равен " + age
                    + ", то ему нужно ходить в университет");
        } else if(goSchool) {
            System.out.println("Если возраст человека равен " + age
                    + ", то ему нужно ходить в школу");
        } else if(goKindergarten) {
            System.out.println("Если возраст человека равен " + age
                    + ", то ему нужно ходить в детский сад");
        }
        // Задание 2
        System.out.println("Задание 2");
        age = 7;
        boolean canNotGoAttraction = age < 5;
        boolean canGoAttraction = age >= 14;
        boolean canGoAttractionWithAdult = age >= 5 && age < 14;
        if(canNotGoAttraction){
            System.out.println("Если возраст ребенка равен " + age
                    + ", то ему нельзя кататься на атракционе");
        } else if(canGoAttraction) {
            System.out.println("Если возраст человека равен " + age
                    + ", то ему моно кататься на атракционе");
        } else if(canGoAttractionWithAdult) {
            System.out.println("Если возраст человека равен " + age
                    + ", то ему можно кататься на атракционе только со взрослым");
        }

        // Задание 3
        System.out.println("Задание 3");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean moreOne = one >= two && one >= three;
        boolean moreTwo = two >= one && two >= three;
        boolean moreThree = three >= one && three >= two;
        if (moreOne){
            System.out.println("Самое большое число " + one);
        } else if (moreTwo){
            System.out.println("Самое большое число " + two);
        } else if (moreThree) {
            System.out.println("Самое большое число " + three);
        }
    }
}