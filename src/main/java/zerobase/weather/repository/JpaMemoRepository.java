package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

@Repository // <class name, key >
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {
}
