package io.pivotal.dmfrey.client.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode.LOCAL;

@RunWith( SpringRunner.class )
@SpringBootTest
@AutoConfigureStubRunner(
        stubsMode = LOCAL,
        ids = "io.pivotal.dmfrey:api"
)
public class HelloClientTests {

    @Autowired
    private HelloClient client;

    @Test
    public void testCallHello() {

        ResponseEntity<String> actual = this.client.callHello( "Dan" );

        assertThat( actual.getStatusCode() ).isEqualTo(HttpStatus.OK );

    }

}
