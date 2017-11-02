/*
 * All GTAS code is Copyright 2016, The Department of Homeland Security (DHS), U.S. Customs and Border Protection (CBP).
 * 
 * Please see LICENSE.txt for details.
 */
package gov.gtas.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import gov.gtas.model.Passenger;
import gov.gtas.model.PaxWatchlistLink;

public interface PaxWatchlistLinkRepository extends JpaRepository<PaxWatchlistLink, Long> {
	public List<PaxWatchlistLink> findByPassengerId(Long id);
	@Modifying
	@Transactional
	@Query(value="insert into pax_watchlist_link (last_run_timestamp, percent_match, verified_status, passenger_id, watchlist_item_id) VALUES (:lastDate, :percentMatch, :verifiedStatus, :passengerId, :watchlistItemId)", nativeQuery=true)
	public void savePaxWatchlistLink(@Param("lastDate") Date lastDate, @Param("percentMatch") float percentMatch, @Param("verifiedStatus") int verifiedStatus, @Param("passengerId") Long passengerId, @Param("watchlistItemId") Long watchlistItemId);

}