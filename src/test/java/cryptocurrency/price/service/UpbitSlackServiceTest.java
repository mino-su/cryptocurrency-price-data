package cryptocurrency.price.service;

import cryptocurrency.price.http.SlackHttpClient;
import cryptocurrency.price.http.UpbitHttpClient;
import cryptocurrency.price.http.UpbitTickerDto;
import cryptocurrency.price.repository.ReportHistoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UpbitSlackServiceTest {
    @Mock
    private SlackHttpClient slackHttpClient;

    @Mock
    private UpbitHttpClient upbitHttpClient;

    @Mock
    private ReportHistoryRepository repository;

    @InjectMocks
    private UpbitSlackService sut;

    @Test
    void test() {
        List<UpbitTickerDto> list = new ArrayList<>();

        //given
        String market = "KRW-BTC";
        when(upbitHttpClient.getTickerByMarket(market))
                .thenReturn(
                        list
                );


        //when
        sut.execute(market);

        //then
        verify(upbitHttpClient,atMostOnce()).getTickerByMarket(market);
    }



}