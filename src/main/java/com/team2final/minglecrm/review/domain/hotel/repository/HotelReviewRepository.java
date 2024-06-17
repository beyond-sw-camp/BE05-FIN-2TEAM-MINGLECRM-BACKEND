package com.team2final.minglecrm.review.domain.hotel.repository;


import com.team2final.minglecrm.review.domain.hotel.HotelReview;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelReviewRepository extends JpaRepository<HotelReview, Long> {

    @EntityGraph(value = "HotelReview.withRoomReservationAndCustomer", type = EntityGraph.EntityGraphType.LOAD)
    Page<HotelReview> findAll(Pageable pageable);

}
