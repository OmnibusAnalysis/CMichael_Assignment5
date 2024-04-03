import com.coderscampus.arraylist.CustomList;

public class CustomListApplication {

    public static void main(String[] args) {
        CustomList<String> caseyList = getCaseyList();
        System.out.println(caseyList.getSize());
        for (int i = 0; i < caseyList.getSize(); i++) {
            System.out.println(caseyList.get(i));
        }
    }

    private static CustomList<String> getCaseyList() {
        CustomList<String> caseyList = new CustomArrayList<>();

        caseyList.add("Casey Micahel");
        caseyList.add("Spud Eternal Slumber Lord");
        caseyList.add("Crow");
        caseyList.add("Tom Servo");
        caseyList.add("Meg Tap");
        caseyList.add("Clint Dietz");
        caseyList.add("Gluten Free Mike");
        caseyList.add("Tam Tam");
        caseyList.add("Big Joe");
        caseyList.add("Stylus the Slinky");
        caseyList.add("Edwin is Completely Unapproachable");
        caseyList.add("Tom Wrobel");
        caseyList.add("Karl Vorndren");
        caseyList.add("The guy on the couch");
        caseyList.add("Dimebag Darrel");
        return caseyList;
    }


}
