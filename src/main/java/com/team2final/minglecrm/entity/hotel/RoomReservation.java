package com.team2final.minglecrm.entity.hotel;

import com.team2final.minglecrm.controller.hotel.reservation.request.UpdateRoomReservationRequest;
import com.team2final.minglecrm.entity.customer.Customer;
import com.team2final.minglecrm.entity.payment.Payment;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoomReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "hotel_room_id")
    private HotelRoom hotelRoom;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private LocalDateTime reservationDate;

    private LocalDateTime checkinTime;

    private LocalDateTime checkoutTime;

    private Long price;

    public void updateHotelReservationInfo(
            UpdateRoomReservationRequest updateRoomReservationRequest) {
        this.price = updateRoomReservationRequest.getPrice();
        this.reservationDate = updateRoomReservationRequest.getReservationDate();
        this.customer.updateCustomerReservationDetail(updateRoomReservationRequest.getMemo(), updateRoomReservationRequest.getName());
    }

    public void deleteHotelReservation() {
        this.payment.cancelHotelReservation(true);
    }
}
