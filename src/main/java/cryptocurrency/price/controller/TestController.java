package cryptocurrency.price.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import cryptocurrency.price.http.SlackHttpClient;
import cryptocurrency.price.http.UpbitHttpClient;
import cryptocurrency.price.repository.ReportHistoryRepository;
import cryptocurrency.price.service.UpbitSlackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final UpbitSlackService upbitSlackService;

    @GetMapping("/api/v1/ticker/{market}")
    public void test(@PathVariable String market){
            upbitSlackService.execute(market);

    }
}
