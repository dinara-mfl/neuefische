import guest.GuestList;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestListTest {

    @Test
    void shouldBeEmptyInitially() {
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of());

        List<String> actual = guestList.getGuests();

        assertEquals(List.of(), actual);
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore() {
        GuestList guestList = new GuestList();
        List<String> expected = List.of("Karl", "Ute");
        guestList.setGuests(expected);

        List<String> actual = guestList.getGuests();

        assertEquals(expected, actual);
    }

    @Test
    void shouldWriteToFileSystem() throws IOException {
        GuestList guestList = new GuestList();
        Path path = Path.of("guests.txt");
        Files.deleteIfExists(path);

        List<String> expected = List.of("Theodor", "Anette");

        assertTrue(Files.exists(path));
        assertEquals(
                List.of("Theodor", "Anette"),
                Files.readAllLines(path));
    }

    @Test
    void shouldReadFromFileSystem() throws IOException {
        Path path = Path.of("guests.txt");
        List<String> expected = List.of("Stephan", "Max");
        Files.write(path, expected);
        GuestList guestList = new GuestList();

        List<String> actual = guestList.getGuests();

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowExceptionWhenFileDoesNotExist() throws IOException {
        Files.deleteIfExists(Path.of("guests.txt"));
        GuestList guestList = new GuestList();

        assertThrows(
                UncheckedIOException.class,
                () -> guestList.getGuests()
        );
    }

    @Test
    void shouldAppendGuestToFile() throws IOException {
        Path path = Path.of("guests.txt");
        Files.write(path, List.of("Karl", "Ute"));
        GuestList guestList = new GuestList();

        guestList.addGuest("Max");

        assertEquals(
                List.of("Karl", "Ute", "Max"),
                Files.readAllLines(path)
        );
    }
}