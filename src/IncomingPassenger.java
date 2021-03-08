import java.util.Scanner;

public class IncomingPassenger {

    public static void travel(Country[] TheCountry){

        Person person=new Person();
        Scanner scanner=new Scanner(System.in);
        String name=null;
        String data=null;
        String country=null;



        System.out.println("以下请输入您的信息");
        System.out.println("————————————————————————————————");
        System.out.println("请输入您的全名");
        name = scanner.next();
        person.setName(name);
        System.out.println("请输入您的国籍。1.Malaysia，2.American，3.China，4.Britain，,5.Russia，6.other");
        country = scanner.next();
        for (int i = 0; i < 6; i++) {
            if (TheCountry[i].getCountryName().equals(country)) {
                person.setMyCountry(TheCountry[i]);
                break;
            }
        }
        System.out.println("请输入您的出发日期,例如：2021-3-06");
        data = scanner.next();
        person.setData(CreatData.createMyData(data));
        System.out.println("请输入您要去的国家。1.Malaysia，2.American，3.China，4.Britain，,5.Russia，6.other");
        country = scanner.next();
        for (int i = 0; i < 6; i++) {
            if (TheCountry[i].getCountryName().equals(country)) {
                person.setToCountry(TheCountry[i]);
            }
        }
        switch (country) {
            case "Malaysia":
                Print.PrintPartOneMsg(person);
                break;
            case "American":
                Print.PrintPartOneMsg(person);
                break;
            case "China":
                Print.PrintPartOneMsg(person);
                break;
            case "Britain":
                Print.PrintPartOneMsg(person);
                break;
            case "Russia":
                Print.PrintPartOneMsg(person);
                break;
            default:
                Print.PrintPartOneMsg(person);
        }
    }



}
