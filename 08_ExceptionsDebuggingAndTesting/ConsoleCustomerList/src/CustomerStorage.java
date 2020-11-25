import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage
{
    private static final int MAX_DIGIT = 10;
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        String[] components = data.split("\\s+");
        try {
        if (components.length != 4) {
            throw new Exceptions.CommandException(Main.addError);
        }
        } catch (Exceptions.CommandException e) {
            System.out.println(e.getMessage());
            return;
        }
        Pattern phones = Pattern.compile("[+?0-9]");
        Pattern letter = Pattern.compile("[а-яА-Яa-zA-Z]");
        String name = components[0] + " " + components[1];
        try {
            try {
                try {
                    Matcher isLetter1 = letter.matcher(components[0]);
                    Matcher isLetter2 = letter.matcher(components[1]);
                    if (!isLetter1.find() || !isLetter2.find()) {
                        throw new Exceptions.CommandException(Main.addError);
                    }
                } catch (Exceptions.CommandException e) {
                  System.out.println(e.getMessage());
                }
                Matcher matchPhone = phones.matcher(components[3]);
                if (!matchPhone.find() || (components[3].length() != MAX_DIGIT + 2)
                        || (components[3].charAt(0) != '+') || (components[3].charAt(1) != '7')) {
                    throw new Exceptions.PhoneException(Main.phoneError);
                }
            } catch (Exceptions.PhoneException e) {
                System.out.println(e.getMessage());
            }
            if (!components[2].matches("(.*)@(.*)\\.(.*)") || (components[2].length() < 5)) {
                throw new Exceptions.EmailException(Main.emailError);
            }
            else storage.put(name, new Customer(name, components[3], components[2]));
        } catch (Exceptions.EmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        String[] components = name.split("\\s+");
        try {
            if (components.length != 2) {
                throw new Exceptions.CommandException(Main.removeError);
                } else storage.remove(name);
        } catch (Exceptions.CommandException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getCount()
    {
        return storage.size();
    }

}

