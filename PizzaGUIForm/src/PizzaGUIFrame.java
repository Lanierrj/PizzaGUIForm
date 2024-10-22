import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class PizzaGUIFrame extends JFrame {
    JPanel mainPnl;
    JPanel buttons;
    JPanel toppings;
    JPanel receipt;
    JPanel functions;

    JButton orderBtn;
    JButton clearBtn;
    JButton quit;

    JRadioButton thin;
    JRadioButton regular;
    JRadioButton deep;

    JComboBox sizes;
    String[] sizesList = {"Small","Medium","Large","Super"};

    JCheckBox normal;
    JCheckBox cheese;
    JCheckBox ice;
    JCheckBox gravy;
    JCheckBox doubleIce;
    JCheckBox peeperoniss;


    JTextArea orderInfo;


    public PizzaGUIFrame() {
        setTitle("Pizza Order Service");
        mainPnl = new JPanel();
        mainPnl.setLayout(new GridLayout(4, 1));
        createButtons();
        mainPnl.add(buttons);
        createToppings();
        mainPnl.add(toppings);
        createReceipt();
        mainPnl.add(receipt);
        createFunctions();
        mainPnl.add(functions);

        add(mainPnl);

        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void createReceipt() {
        receipt = new JPanel();
        receipt.setBorder(new TitledBorder(new EtchedBorder(),"Your Order:"));

        orderInfo = new JTextArea();
        orderInfo.setEditable(true);

        receipt.add(orderInfo);
    }


    private void createToppings() {
        toppings = new JPanel();
        toppings.setLayout(new GridLayout(2, 3));
        toppings.setBorder(new TitledBorder(new EtchedBorder()," Select Toppings ($1.00/each)"));

        normal = new JCheckBox("Normal");
        cheese = new JCheckBox("Cheese");
        ice = new JCheckBox("Ice");
        gravy = new JCheckBox("Gravy");
        doubleIce = new JCheckBox("Double Ice");
        peeperoniss = new JCheckBox("Peeperoniss");

        toppings.add(normal);
        toppings.add(cheese);
        toppings.add(ice);
        toppings.add(gravy);
        toppings.add(doubleIce);
        toppings.add(peeperoniss);
    }

    private void createButtons() {
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(2, 3));
        buttons.setBorder(new TitledBorder(new EtchedBorder(),"Select your Crust Type and Size"));

        thin = new JRadioButton("Thin");
        regular = new JRadioButton("Regular");
        deep = new JRadioButton("Deep-Dish");
        sizes = new JComboBox(sizesList);


        buttons.add(thin);
        buttons.add(regular);
        buttons.add(deep);
        buttons.add(sizes);
    }

    private void createFunctions() {
        functions = new JPanel();
        orderBtn = new JButton("Order");
        quit = new JButton("Quit");
        clearBtn = new JButton("Clear");

        functions.add(orderBtn);
        functions.add(clearBtn);
        functions.add(quit);

    }
}