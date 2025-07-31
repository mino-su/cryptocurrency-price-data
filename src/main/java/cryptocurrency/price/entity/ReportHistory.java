package cryptocurrency.price.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "report_histories")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReportHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String market;

    @Column
    private String price;

    @Column(name = "reported_at")
    private LocalDateTime reportedAt;

    public ReportHistory(String market, String price) {
        this.price = price;
        this.market = market;
        this.reportedAt = LocalDateTime.now();
    }
}
