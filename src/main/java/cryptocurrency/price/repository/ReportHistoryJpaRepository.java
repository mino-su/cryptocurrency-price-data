package cryptocurrency.price.repository;

import cryptocurrency.price.entity.ReportHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportHistoryJpaRepository extends JpaRepository<ReportHistory,Integer> {
}
