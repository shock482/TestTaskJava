import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Graph user = null;

        try {
            user = mapper.readValue(new File("C:\\Users\\user\\IdeaProjects\\TestTask\\data.json"), Graph.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new MainForm(user).view);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
