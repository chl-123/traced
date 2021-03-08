import java.util.Scanner;

public class Suggest {
    public static void doSuggest(Location[] locations,Person person){
        Scanner scanner=new Scanner(System.in);
        String name=null;
        String locationName=null;

        System.out.println("以下请输入您的信息");
        System.out.println("————————————————————————————————");
        System.out.println("请输入您的全名");
        name = scanner.next();
        person.setName(name);
        System.out.println("请输入您要去的国家。1.supermarket，2.hospital，3.residence，4.airport，,5.plaza，6.other");
        locationName = scanner.next();
        for (int i = 0; i < 6; i++) {
            if (locations[i].getLocationName().equals(locationName)) {
                Location location=new Location();
                location.s
                person.getLocation().setLocationName();
            }
        }
        switch (locationName) {
            case "supermarket":
                Print.PrintPartTwoMsg(person);

                break;
            case "hospital":
                Print.PrintPartTwoMsg(person);

                break;
            case "residence":
                Print.PrintPartTwoMsg(person);

                break;
            case "airport":
                Print.PrintPartTwoMsg(person);

                break;
            case "plaza":
                Print.PrintPartTwoMsg(person);

                break;
            default:
                Print.PrintPartTwoMsg(person);

        }
    }
}
