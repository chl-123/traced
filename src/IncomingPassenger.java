import java.util.Scanner;

public class IncomingPassenger {

    public void travel(Country[] TheCountry){

        Person person=new Person();
        Country mycountry=new Country();
        Country tocountry=new Country();
        Scanner scanner=new Scanner(System.in);
        String name=null;
        String data=null;
        String country=null;
        String SwitchCountry=null;
        String msg="您来自:"+person.getMyCountry().getCountryName()+"，在："+person.getData()+"出行，"+"隔离时间为："+person.getToCountry().getQuarantine_data();
        while (person==null){
            System.out.println("以下请输入您的信息");
            System.out.println("————————————————————————————————");
            System.out.println("请输入您的全名");
            name=scanner.next();
            person.setName(name);
            System.out.println("请输入您的国籍。1.国家A，2.国家B，3.国家C，4.国家D，,5.国家E，6.其他国家");
            country=scanner.next();
            for (int i = 0; i < 6; i++) {
                if (TheCountry[i].getCountryName()==country) {
                    person.setMyCountry(TheCountry[i]);
                }
            }
            mycountry.setCountryName(scanner.next());
            person.setMyCountry(mycountry);
            System.out.println("请输入您的出发日期,例如：2021-3-06");
            data=scanner.next();
            person.setData(CreatData.createMyData(data));
            System.out.println("请输入您要去的国家。1.Malaysia，2.American，3.China，4.Britain，,5.Russia，6.other");
            country=scanner.next();
            for (int i = 0; i < 6; i++) {
                if (TheCountry[i].getCountryName()==country) {
                    person.setToCountry(TheCountry[i]);
                }
            }
            country=person.getToCountry().getCountryName();
            SwitchCountry=TheCountry[0].getCountryName();
            switch(country){
                case "Malaysia":
                    System.out.println(msg);
                case "American":
                    System.out.println(msg);
                case "China":
                    System.out.println(msg);
                case "Britain":
                    System.out.println(msg);
                case "Russia":
                    System.out.println(msg);
                default:
                    System.out.println(msg);

            }


        }




    }



}
