public class main {
    public static void main(String[] args) {
       /* enum TheCountry {
            American, Chinese,Britain,Russia;

        }*/
        String theCountry[][]={{"Malaysia","American","China","Britain","Russia","other"},{"07天","07天","10天","14天","14天","14天"}};
        Country Malaysia=new Country();
        Country American=new Country();
        Country China=new Country();
        Country Britain=new Country();
        Country Russia=new Country();
        Country other=new Country();
        Malaysia.setCountryName(theCountry[0][0]);
        Malaysia.setQuarantine_data(theCountry[0][1]);
        American.setCountryName(theCountry[0][0]);
        Malaysia.setQuarantine_data(theCountry[0][1]);
        Malaysia.setCountryName(theCountry[0][0]);
        Malaysia.setQuarantine_data(theCountry[0][1]);
        Malaysia.setCountryName(theCountry[0][0]);
        Malaysia.setQuarantine_data(theCountry[0][1]);
        Malaysia.setCountryName(theCountry[0][0]);
        Malaysia.setQuarantine_data(theCountry[0][1]);
        Malaysia.setCountryName(theCountry[0][0]);
        Malaysia.setQuarantine_data(theCountry[0][1]);
        Country country[] ={Malaysia,American,China,Britain,Russia,other};

        /*for (int i = 0; i < 6; i++) {
            country[i].setCountryName(theCountry[i][0]);
            country[i].setQuarantine_data(theCountry[i][1]);
        }*/
        IncomingPassenger incomingPassenger=new IncomingPassenger();
        incomingPassenger.travel(country);


    }
}
