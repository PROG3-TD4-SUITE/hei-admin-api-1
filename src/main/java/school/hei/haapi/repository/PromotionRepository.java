package school.hei.haapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.haapi.model.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, String> {
    Promotion getPromotionById(String promotionId);

    Promotion getPromotionByPromotionName(String promotionName);
    Boolean existsPromotionByPromotionName(String name);
}