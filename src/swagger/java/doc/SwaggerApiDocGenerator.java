package doc;

import doc.config.SwaggerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import com.aukhatov.template.Application;

import java.io.PrintWriter;

/**
 * Создаем файл swagger.json и кладем его в папку ресурсов приложения
 * Это нужно, чтобы генерировать документацию на этапе сборки, а не динамически при старте приложения
 * Таким образом приложение стартует быстрее и не нужно тащить завивсимости swagger в рантайм
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = {Application.class, SwaggerConfig.class})
public class SwaggerApiDocGenerator {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void generateDocs() throws Exception {
        String swaggerJson = this.restTemplate.getForObject("/v2/api-docs", String.class);
        PrintWriter out = new PrintWriter("src/main/resources/static/swagger.json", "UTF-8");
        out.write(swaggerJson);
        out.close();
    }
}
