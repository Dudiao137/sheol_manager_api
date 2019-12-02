package win.ots.hell.api.core.base;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public interface BaseService<T> {

    T findOne(Long id);

    T saveOrUpdate(T t);

    int delete(T t);
}
