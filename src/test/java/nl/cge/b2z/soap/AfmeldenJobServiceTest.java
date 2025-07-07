package nl.cge.b2z.soap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkiverse.cxf.test.QuarkusCxfClientTestUtil;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class AfmeldenJobServiceTest {

    @Test
    void afmeldenJob() {
        AfmeldenJobService client = QuarkusCxfClientTestUtil.getClient(AfmeldenJobService.class, "/soap/afmeldenJob");
        Assertions.assertEquals("Job 1 afgemeld", client.afmeldenJob(1));
    }
}
