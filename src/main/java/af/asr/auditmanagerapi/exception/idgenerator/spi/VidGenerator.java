package af.asr.auditmanagerapi.exception.idgenerator.spi;

/**
 * This is an interface for the generation of RID
 *
 */
public interface VidGenerator<T> {

	T generateId();

}
