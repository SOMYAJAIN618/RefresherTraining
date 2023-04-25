package SingletonImplementaion;//Serialization and Deserialization in singleton
import java.io.*;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }


    protected Object readResolve() {
        return getInstance();
    }

    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();

        // Serialize the singleton object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SingletonImplementaion/singleton.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialize the singleton object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SingletonImplementaion/singleton.ser"));
        Singleton instance2 = (Singleton) in.readObject();
        in.close();

        // Test
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
    }
}