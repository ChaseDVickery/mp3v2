
package jenkins.model;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.jvnet.hudson.test.Issue;
//import IdStrategy.CaseSensitive;

public class IdStrategyTest {

    @Test
    public void testidFromFilenameBasic() {
        String filename = "abcXYZ_. -";
        IdStrategy.CaseSensitive cs = new IdStrategy.CaseSensitive();
        String id = cs.idFromFilename(filename);
        assertEquals(filename, id);
    }

    @Test
    public void testidFromFilename() {
        String filename = "abc~a";
        IdStrategy.CaseSensitive cs = new IdStrategy.CaseSensitive();
        String id = cs.idFromFilename(filename);
        assertEquals(id, "abcA");
    }
}