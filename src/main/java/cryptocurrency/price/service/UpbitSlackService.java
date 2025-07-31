package cryptocurrency.price.service;

import cryptocurrency.price.http.SlackHttpClient;
import cryptocurrency.price.http.UpbitHttpClient;
import cryptocurrency.price.http.UpbitTickerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UpbitSlackService {
    private final SlackHttpClient slackHttpClient;
    private final UpbitHttpClient upbitHttpClient;

    public void execute(String market) {
        // upbit 호출
        List<UpbitTickerDto> tickerByMarkets = upbitHttpClient.getTickerByMarket(market);

        // slack 메세지 전송
        for (UpbitTickerDto data : tickerByMarkets) {
            StringBuilder sb = new StringBuilder();
            sb.append("[실시간 데이터]");
            sb.append(market);
            sb.append("price = ");
            sb.append(data.getTrade_price());
            slackHttpClient.send(sb.toString());
        }
    }
}
