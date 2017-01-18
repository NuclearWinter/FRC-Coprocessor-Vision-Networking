import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        /* Help string to display for showing program arguments and examples */
        final String help = "Program Help:\n" +
                            "Required Arguments:\n" +
                            "\t-ip IP ADDRESS The ip address of the NetworkTable server\n" +
                            "\t-t NETWORK TABLE NAME or --tablename NETWORK TABLE NAME The name of the network table" +
                            " to write to\n";
        /* The IP address of the NetworkTable server */
        String IPAddress = "10.39.26.2";
        /* The name of the network table */
        String tableName = "yeah";

        for (int i = 0; i < args.length; ++i) {

            if (Objects.equals(args[i], "-ip") || Objects.equals(args[i], "-IP"))
                IPAddress = args[++i];
            else if (Objects.equals(args[i], "-t") || Objects.equals(args[i], "--tablename"))
                tableName = args[++i];
            else {
                System.out.println("Error, unknown argument " + args[i] + " see below for possible commands");
                System.out.print(help);
            }

        }

        if (IPAddress == null) {
            System.out.print("An IP address was not set, please try again. Here is some help:\n" + help);
            return;
        }

        if (tableName == null) {
            System.out.print("A table name was not set, please try again. Here is some help:\n" + help);
            return;
        }

        //NetworkTable.setIPAddress(IPAddress);

        TableHandler<GripPipeline> test = new TableHandler<>("yeah", 0);

        test.updateTable();

    }
}
