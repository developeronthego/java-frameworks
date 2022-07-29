package frameworks.lombok.pojos;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.extern.java.Log;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;

@Getter
@Setter
@Accessors(fluent = true, chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString(of={"id", "address"})
@EqualsAndHashCode(exclude={"address"})
@Log
public class RealEstateLombok {
    private Long id;
    private String code;
    private String address;

    @SneakyThrows
    public void writeFile() {
        Path filePath = Paths.get("real_estate.txt");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(filePath, UTF_8)) {
            bufferedWriter.write(toString() + "\n");
        }
    }

    public void showMessage() {
        log.info("Real estate class");
    }
}
