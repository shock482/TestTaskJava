import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonParser {
    private String jsonSourceString;
    private Graph graph = null;

    public JacksonParser(String jsonSourceString) {
        this.jsonSourceString = jsonSourceString;
    }

    public void readValue() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            graph = mapper.readValue(new File(jsonSourceString), Graph.class);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
}