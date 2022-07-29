package frameworks.lombok;

import frameworks.lombok.pojos.*;
import frameworks.lombok.util.FibonacciCalculatorUtil;
import frameworks.lombok.original.RealEstate;

import java.util.HashSet;
import java.util.Set;

public class LombokMain {
    public static void main(String[] args) {
        /* Getter and setter check */
        RealEstate myHouse = new RealEstate();
        myHouse.setAddress("ul. Nowowiejska 54/3 Katowice");
        System.out.println(myHouse:.getAddress());

        /* Accessors check */
        RealEstateLombok emptyRealEstate = new RealEstateLombok();
        emptyRealEstate.address("ul. Nowowiejska 54/3 Katowice").code("12345");
        System.out.println(emptyRealEstate.address());

        /* Generate constractor check */
        RealEstateLombok myCottage = new RealEstateLombok(1L, "12345", "ul. Nowowiejska 54/3 Katowice");
        System.out.println(myCottage);

        /* Hide checked exception test */
        myCottage.writeFile();

        /* Logger test */
        myCottage.showMessage();

        /* Equals and hashcode example - collision test */
        Set<RealEstateLombok> realEstates = new HashSet<>();
        realEstates.add(new RealEstateLombok(1L, "12345", "ul. Nowowiejska 17 Katowice"));
        realEstates.add(new RealEstateLombok(1L, "12345", "ul. Nowowiejska 17 Katowice"));
        System.out.println(realEstates);

        /* Nullability test */
        NonNullCar car = new NonNullCar("Skoda", "Octavia");
        System.out.println(car);

        /* Builder test */
        CarBuilder.builder()
                .brand("Opel")
                .age(5)
                .colour("red")
                .build();

        /* Data object test */
        CarDataObject carDO = new CarDataObject();
        carDO.setBrand("Audi");
        carDO.setAge(4);
        carDO.setColour("white");
        System.out.println(carDO);

        /* Car value object test */
        CarValueObject carVO = new CarValueObject("Opel", 5, "red");
        System.out.println(carVO);

        /* Utility class test */
        System.out.println(FibonacciCalculatorUtil.countValue(4));
    }
}
