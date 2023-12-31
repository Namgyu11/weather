package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.DateWeather;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {

    // date 에 따라서 그날의 dateWeather 값을 가져옴
    List<DateWeather> findAllByDate(LocalDate localDate);
}
