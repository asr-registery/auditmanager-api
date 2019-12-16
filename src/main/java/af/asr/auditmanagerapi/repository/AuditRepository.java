/**
 * 
 */
package af.asr.auditmanagerapi.repository;

import af.asr.auditmanagerapi.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface with data access and data modification functions on
 * {@link Audit}
 */
public interface AuditRepository extends JpaRepository<Audit, Long> {

}
