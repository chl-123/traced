public class Print {
    public static void PrintPartOneMsg(Person person){
        System.out.println("----------------------------------");
        System.out.println("    名  字："+person.getName());
        System.out.println("    出发地："+person.getMyCountry());
        System.out.println("    出发时间："+person.getData());
        System.out.println("    目的地："+person.getToCountry().getCountryName());
        System.out.println("    目的地隔离时间："+person.getToCountry().getQuarantine_data());
        System.out.println("    解除隔离时间：");
        System.out.println("----------------------------------");

    }
    public static void PrintPartTwoMsg(Person person){
        System.out.println("----------------------------------");
        System.out.println("    "+person.getName()+"你好");
        /*System.out.println("    你的目的地是："+person.getToCountry().getLocation().getLocationName());
        System.out.println("    目的地风险等级："+person.getToCountry().getLocation().getWarn_level());*/
        System.out.println("    这边给您的建议：");
        System.out.println("----------------------------------");

    }

}
