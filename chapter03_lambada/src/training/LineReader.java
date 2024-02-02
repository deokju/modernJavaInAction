package training;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface LineReader {
    public String read(BufferedReader br) throws IOException;
}
