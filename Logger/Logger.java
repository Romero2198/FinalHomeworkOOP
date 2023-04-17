package Logger;

import Model.ComplexNumber;

import java.io.FileWriter;

public class Logger implements Log {
    @Override
    public void update(ComplexNumber numb, String message) {
        try (FileWriter fw = new FileWriter("calculateLog.txt", true)) {
            fw.append(message + numb.toString() + "\n");
            fw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
