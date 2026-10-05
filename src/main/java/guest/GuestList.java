package guest;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class GuestList {
    private List<String> guests = List.of();
    private final Path path = Path.of("guests.txt");

    public void setGuests(List<String> guests) {
        try {
            Files.write(Path.of("guests.txt"), guests);
            this.guests = guests;
        } catch (IOException e) {
            throw new UncheckedIOException(
                    "Failed to write guest list", e
            );
        }
    }

    public List<String> getGuests() {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new UncheckedIOException(
                    "Unable to read guest list", e
            );
        }
    }

    public void addGuest(String guest) {
        try {
            Files.write(
                    path,
                    List.of(guest),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new UncheckedIOException(
                    "Failed to add guest", e
            );
        }
    }
}