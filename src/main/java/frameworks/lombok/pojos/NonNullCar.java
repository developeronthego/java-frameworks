package frameworks.lombok.pojos;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class NonNullCar {
    @NonNull private String brand;
    private Integer age;
    @NonNull private String colour;
}
