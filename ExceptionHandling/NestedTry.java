import java.io.IOException;

public class ThrowsException {
    public static void main(String args[]) {
        try {
            n();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void n() throws IOException {
        System.out.println("Error");
        throw new IOException("Device error occurred");
    }
}
