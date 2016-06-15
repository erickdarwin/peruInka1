package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.StatusHotel;

public interface HotelDAO {

	List<Hotel> findAllHotel();

	List<StatusHotel> findStatusHotel();

	void saveHotel(Hotel hotel);

	void deleteHotel(Long id);

	Hotel findHotelById(Long id);

}
