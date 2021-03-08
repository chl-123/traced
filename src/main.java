import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        String theCountry[][]={{"Malaysia","American","China","Britain","Russia","other"},{"07天","07天","10天","14天","14天","14天"}};
        //String location[][]={{"supermarket","hospital","residence ","airport","plaza"},{"4","5","1","3","2"}};
        String locationName[]={"supermarket","hospital","residence ","airport","plaza"};
        Integer warn_level[]={4,5,1,3,2};
        Map<String,Integer> locationMap=new HashMap<>();
        for (int i = 0; i < 5; i++) {
            locationMap.put(locationName[i],warn_level[i]);
        }
        Location supermarket = null,hospital=null,residence=null,airport=null,plaza=null;
        Country Malaysia=new Country();
        Country American=new Country();
        Country China=new Country();
        Country Britain=new Country();
        Country Russia=new Country();
        Country other=new Country();
        Country country[] ={Malaysia,American,China,Britain,Russia,other};
        Location[] locations={supermarket,hospital,residence,airport,plaza};
        for (int i = 0; i < 5; i++) {
            locations[i].setLocationName(locationName[i]);
            locations[i].setWarn_level(warn_level[i]);
        }
        for (int i = 0; i < 6; i++) {
            country[i].setCountryName(theCountry[0][i]);
            country[i].setQuarantine_data(theCountry[1][i]);
            country[i].setLocation(locations);
        }

        IncomingPassenger.travel(country);
        Suggest.doSuggest();

    }
}
