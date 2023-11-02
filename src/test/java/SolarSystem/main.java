package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys=new solarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

//        *******Feature Sun*******
        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="-1223124kelvin";

//        *********planet2*********
        Planet2 xaros=new Planet2();
        xaros.name="nehaio";
        xaros.color="blue";
        xaros.size="32432432324324km";
    }
}
