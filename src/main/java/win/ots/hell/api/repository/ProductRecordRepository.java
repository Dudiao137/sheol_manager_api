package win.ots.hell.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import win.ots.hell.api.entity.ProductRecord;

/**
 * @author : sy.wang
 * @date : 2019-12-06
 */
public interface ProductRecordRepository extends JpaRepository<ProductRecord, Long> {
}
