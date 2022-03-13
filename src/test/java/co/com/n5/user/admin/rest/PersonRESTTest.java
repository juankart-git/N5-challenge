package co.com.n5.user.admin.rest;

import co.com.n5.user.admin.helper.ProductorKafka;
import co.com.n5.user.admin.model.Person;
import co.com.n5.user.admin.service.PersonService;
import co.com.n5.user.admin.utils.Constants;
import co.com.n5.user.admin.utils.UUIDGenerate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.RequestBuilder;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PersonREST.class)
@WithMockUser
public class PersonRESTTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonService personService;

    @MockBean
    private UUIDGenerate uuidGenerate;

    @MockBean
    private ProductorKafka productorKafka;

    @MockBean
    private Constants constants;

    private Person mockPerson;

    private String personJson =
            "[{" +
                "\"id\":1," +
                "\"firstName\":\"First Name\"," +
                "\"lastName\":\"Last Name\"," +
                "\"birthday\":\"01/01/1991\", " +
                "\"documentNumber\":\"123456\"," +
                "\"gender\":1," +
                "\"documentType\":1" +
            "}]";

    @BeforeEach
    void setUp() {
        mockPerson = new Person();
        mockPerson.setId(1L);
        mockPerson.setFirstName("First Name");
        mockPerson.setLastName("Last Name");
        mockPerson.setDocumentNumber("123456");
        mockPerson.setGender(1L);
        mockPerson.setBirthday("01/01/1991");
        mockPerson.setDocumentType(1L);
    }

    @Test
    public void retrieveDetailsForCourse() throws Exception {
        Mockito.when(personService.getAll()).thenReturn(Arrays.asList(mockPerson));
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/v1/person").accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        JSONAssert.assertEquals(personJson, result.getResponse().getContentAsString(), true);
    }
}