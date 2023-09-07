// Test generated by RoostGPT for test knote-java using AI Type Open AI and AI Model gpt-4

package alahyaoui.curriculum.business;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.stereotype.Component;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
public class CourseGraph_getNodes_9b592d3b00_Test {

    @InjectMocks
    CourseGraph courseGraph;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetNodes() {
        Set<CourseNode> expectedNodes = new HashSet<>();
        CourseNode courseNode1 = new CourseNode();
        CourseNode courseNode2 = new CourseNode();
        expectedNodes.add(courseNode1);
        expectedNodes.add(courseNode2);

        courseGraph.setNodes(expectedNodes);

        Set<CourseNode> actualNodes = courseGraph.getNodes();

        assertEquals(expectedNodes, actualNodes);
    }

    @Test
    public void testGetNodesWhenNoNodes() {
        Set<CourseNode> expectedNodes = new HashSet<>();

        courseGraph.setNodes(expectedNodes);

        Set<CourseNode> actualNodes = courseGraph.getNodes();

        assertEquals(expectedNodes, actualNodes);
    }
}
