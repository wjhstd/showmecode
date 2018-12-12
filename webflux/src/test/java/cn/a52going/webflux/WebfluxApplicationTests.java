package cn.a52going.webflux;

import cn.a52going.webflux.model.Quote;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebfluxApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void fetchQuotes() {
        webTestClient
                // We then create a GET request to test an endpoint
                .get().uri("/quotes?size=20")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                // and use the dedicated DSL to test assertions against the response
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(Quote.class)
                .hasSize(20)
                // Here we check that all Quotes have a positive price value
                .consumeWith(allQuotes ->
                        assertThat(allQuotes.getResponseBody())
                                .allSatisfy(quote -> assertThat(quote.getPrice()).isPositive()));
    }

    @Test
    public void fetchQuotesAsStream() {
        List<Quote> result = webTestClient
                // We then create a GET request to test an endpoint
                .get().uri("/quotes")
                // this time, accepting "application/stream+json"
                .accept(MediaType.APPLICATION_STREAM_JSON)
                .exchange()
                // and use the dedicated DSL to test assertions against the response
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_STREAM_JSON)
                .returnResult(Quote.class)
                .getResponseBody()
                .take(30)
                .collectList()
                .block();

        assertThat(result).allSatisfy(quote -> assertThat(quote.getPrice()).isPositive());
    }

}
