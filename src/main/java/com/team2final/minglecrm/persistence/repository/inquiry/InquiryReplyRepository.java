package com.team2final.minglecrm.persistence.repository.Inquiry;

import com.team2final.minglecrm.entity.inquiry.InquiryReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryReplyRepository extends JpaRepository<InquiryReply, Long> {
}
