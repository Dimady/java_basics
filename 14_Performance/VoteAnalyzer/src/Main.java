import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.sql.SQLException;

public class Main {
    private static final String name = "Красненко Аникей";
    public static void main(String[] args) throws SQLException {
        String fileName = "res/data-1572M.xml";
        long start = System.currentTimeMillis();
        try {
            parseFileSax(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Время заполнения БД: ");
        System.out.print((System.currentTimeMillis() - start)/1000F);
        System.out.println(" сек.");
        DBConnection.printVoterCounts();
        start = System.currentTimeMillis();
        System.out.print(name);
        System.out.print(": id = ");
        System.out.println(DBConnection.customSelect(name));
        System.out.print("Время работы customSelect: ");
        System.out.print((System.currentTimeMillis() - start)/1000F);
        System.out.println(" сек.");
        DBConnection.connectionClose();
    }

    private static void parseFileSax(String fileName) throws Exception {
        DBConnection.getConnection();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        XMLHandler handler = new XMLHandler();
        parser.parse(new File(fileName), handler);
        DBConnection.executeMultiInsert();
    }
}
