package com.team2final.minglecrm.review.domain.dining.repository;

import com.team2final.minglecrm.ai.dto.vo.DiningReviewForSummary;
import com.team2final.minglecrm.review.dto.dining.request.DiningReviewConditionSearchRequest;
import com.team2final.minglecrm.reservation.dto.dining.response.DiningReviewConditionSearchResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;

public interface DiningReviewQueryDslRepository {

    Page<DiningReviewConditionSearchResponse> searchByExpression(DiningReviewConditionSearchRequest condition, Pageable pageable);

    List<DiningReviewForSummary> findAllByStartDateCondition(LocalDateTime startDate);

}
