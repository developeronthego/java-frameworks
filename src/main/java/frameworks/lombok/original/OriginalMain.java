package frameworks.lombok.original;

import java.util.HashSet;
import java.util.Set;

public class OriginalMain {
    public static void main(String[] args) {
        /* Getter and setter */
        RealEstate myHouse = new RealEstate();
        myHouse.setAddress("ul. Piękna 8, Zakopane");
        System.out.println(myHouse.getAddress());

        /* Parametrized constractor */
        RealEstate myCottage = new RealEstate(1L, "12345", "ul. Nowowiejska 17 Katowice");

        /* ToString test */
        System.out.println(myCottage);

        /* Hide checked exception test */
        myCottage.writeFile();

        /* Logger test */
        myCottage.showMessage();

        /* Equals and hashcode example - collision test */
        Set<RealEstate> realEstates = new HashSet<>();
        realEstates.add(new RealEstate(1L, "12345", "ul. Nowowiejska 17 Katowice"));
        realEstates.add(new RealEstate(1L, "12345", "ul. Nowowiejska 17 Katowice"));
        System.out.println(realEstates);

        /* Helper class usage example */
        System.out.println(FibonacciCalculator.countValue(4));
    }
}
