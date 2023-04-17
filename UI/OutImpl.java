package UI;

import Logger.Logger;
import Model.ComplexNumber;

public class OutImpl implements Out {
    @Override
    public void print(ComplexNumber result) {
        Logger logger = new Logger();
        logger.update(result, "Результат: ");
        System.out.println(result.toString());
    }
}
