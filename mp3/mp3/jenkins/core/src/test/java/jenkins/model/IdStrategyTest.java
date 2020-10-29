
package jenkins.model;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.jvnet.hudson.test.Issue;
import CaseInsensitive;

public class IdStrategyTest {

    @Test
    public void testidFromFilenameBasic() {
        String filename = "abcXYZ_. -";
        String id = CaseInsensitive.idFromFilename(filename);
        assertEquals(filename, id);
    }

    @Test
    public void testidFromFilename() {
        String filename = "abc~a";
        String id = CaseInsensitive.idFromFilename(filename);
        assertEquals(id, "abcA");
    }
}