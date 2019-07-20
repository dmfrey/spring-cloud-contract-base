package io.pivotal.dmfrey.api.contracts;

import io.pivotal.dmfrey.api.web.HelloController;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.mockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith( SpringRunner.class )
@WebMvcTest( HelloController.class )
@Ignore
public abstract class HelloBase {

    @Autowired
    private HelloController controller;

    @Before
    public void setup() {

        mockMvc(
                standaloneSetup( controller ).build()
        );

    }

}
