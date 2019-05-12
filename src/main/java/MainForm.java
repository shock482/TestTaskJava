import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton button1;
    public JPanel view;
    private JTextArea textArea1;

    private String comboBoxItem1;
    private String comboBoxItem2;


    public MainForm(final Graph graph) {
        fillComboBox(graph);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxItem1 = (String) comboBox1.getSelectedItem();
                comboBoxItem2 = (String) comboBox2.getSelectedItem();

                Node startNode = null;
                Node endNode = null;

                for (Node node1 : graph.getNodes()) {
                    if (node1.getName().equals(comboBoxItem1)) {
                        startNode = node1;
                    } else if (node1.getName().equals(comboBoxItem2)) {
                        endNode = node1;
                    }
                }
                calculateGraph(startNode, graph, endNode);
            }
        });
    }

    private void fillComboBox(Graph graph) {
        comboBox1.setModel(new DefaultComboBoxModel(graph.getNodeNames()));
        comboBox2.setModel(new DefaultComboBoxModel(graph.getNodeNames()));
    }

    private void calculateGraph(Node node1, Graph graph, Node endNode) {
        Graph graphObj1 = Dijkstra.calculateShortestPathFromSource(graph, node1);

        for (Node node : graph.getNodes()) {
            if (node.getName().equals(endNode.getName())) {
                switch (endNode.getName()) {
                    case "B":
                        System.out.println("Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName());
                        textArea1.append("Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName() + '\n');
                        printShortestPath(node);
                        break;
                    case "C":
                        System.out.println("Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName());
                        textArea1.append('\n' + "Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName() + '\n');
                        printShortestPath(node);
                        break;
                    case "D":
                        System.out.println("Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName());
                        textArea1.append('\n' + "Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName() + '\n');
                        printShortestPath(node);
                        break;
                    case "E":
                        System.out.println("Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName());
                        textArea1.append('\n' + "Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName() + '\n');
                        printShortestPath(node);
                        break;
                    case "F":
                        System.out.println("Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName());
                        textArea1.append('\n' + "Кратчайшее расстояние от точки " + node1.getName() + " до " + endNode.getName() + '\n');
                        printShortestPath(node);
                        break;
                }
            }
        }
    }

    private void printShortestPath(Node node) {
        for (Node node1 : node.getShortestPath()) {
            System.out.print(node1.getName() + " ");
            textArea1.append(node1.getName() + " ");
        }

        System.out.print(node.getName());
        textArea1.append(node.getName());
        System.out.println(" ");
        textArea1.append(" " + '\n');
    }
}
