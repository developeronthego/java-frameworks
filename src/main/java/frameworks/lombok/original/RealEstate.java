package frameworks.lombok.original;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.logging.Logger;

import static java.nio.charset.StandardCharsets.UTF_8;

public class RealEstate {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(RealEstate.class.getName());
    private Long id;
    private String code;
    private String address;

    public RealEstate() {
    }

    public RealEstate(Long id, String code, String address) {
        this.id = id;
        this.code = code;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void writeFile() {
        Path filePath = Paths.get("real_estate.txt");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(filePath, UTF_8)) {
            bufferedWriter.write(toString() + "\n");
        } catch (IOException e) {
            LOGGER.warning("Can't write result to file with content:" + e.getMessage());
        }
    }

    public void showMessage() {
        Logger.getGlobal().info("Real estate class");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealEstate that = (RealEstate) o;
        return Objects.equals(id, that.id) && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
