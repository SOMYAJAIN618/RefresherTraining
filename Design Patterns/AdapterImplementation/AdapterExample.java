package AdapterImplementation;

// Adaptee interface
interface LegacyPrinter {
    void print(String text);
}

// Adaptee implementation
class LegacyPrinterImpl implements LegacyPrinter {
    @Override
    public void print(String text) {
        System.out.println("Legacy Printer: " + text);
    }
}

// Target interface
interface Printer {
    void printText(String text);
}

// Adapter implementation
class LegacyPrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printText(String text) {
        legacyPrinter.print(text);
    }
}

// Client code
public class AdapterExample {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinterImpl();
        Printer printer = new LegacyPrinterAdapter(legacyPrinter);
        printer.printText("This is the new Printer.");
    }
}
