package packages.function;

import java.util.logging.Logger;

import com.automation.services.LogService;

public class StringOrdenation {

    private Logger logger = LogService.getLogger();

    /**
     * This function allows you to sort a string of numbers in ascending order.
     * 
     * @param inicialData -> Unsorted string of numbers
     * @return Sorted string of numbers
     */
    public String orderNumbers(String inicialData) {
        logger.config("loadding initial data to process");
        String[] arrayInicial = inicialData.split("");
        String[] arrayToOrder = inicialData.split("");
        logger.finer("create array with length of string original");
        String[] datosOrdenados = new String[arrayInicial.length];
        logger.finer("setting the min value to 0");
        int minValue = 0;
        int auxValue = 0; // for compare value and store while process numbers
        int indexFromValue = 0;

        logger.fine("sorting data");
        for (int i = 0; i < arrayInicial.length; i++) {
            logger.finer(String.format("iteration index: %d", i));
            for (int x = 0; x < arrayToOrder.length; x++) {
                while (!inicialData.contains(String.valueOf(minValue))) {
                    logger.finest(String.format("min value matching in string: %d", minValue));
                    minValue++;
                }
                // convert string to number to makes math operations
                logger.finer("casting data to integer to math operations");
                int actualValue = -1;
                if (!arrayToOrder[x].equals("#"))
                    actualValue = Integer.parseInt(arrayToOrder[x]);
                // search min value to order
                logger.finer("search min value in array to order");
                if (actualValue == minValue) {
                    logger.finer(String.format("value found -> actual: %d; saving to order array", actualValue));
                    auxValue = actualValue;
                    logger.finest("getting index from value actual -> index: " + x);
                    indexFromValue = x;
                    logger.finest("setting value to ignore in the next array iteration");
                    arrayToOrder[x] = "#";
                    logger.finest("setting value into 'initial data' top ignore in the next iteration");
                    inicialData = inicialData.substring(0, x) + "#"
                            + inicialData.substring(x + 1, inicialData.length());
                    if (inicialData.indexOf(String.valueOf(actualValue)) == -1) {
                        logger.finest("update minvalue to next iteration");
                        minValue++;
                    }
                    break;
                }
            }
            if (Integer.parseInt(arrayInicial[indexFromValue]) == auxValue) {
                datosOrdenados[i] = String.valueOf(auxValue);
                logger.finer(String.format("storing number (sorted) -> {index: %d, value: %d}", i, auxValue));
            }
        }
        logger.fine("return data sorted");
        return String.join("", datosOrdenados);
    }
}
