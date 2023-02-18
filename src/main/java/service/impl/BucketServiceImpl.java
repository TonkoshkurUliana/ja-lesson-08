package service.impl;

import dao.BucketDao;
import dao.UserDao;
import dao.impl.BucketDaoImpl;
import dao.impl.UserDaoImpl;
import domain.Bucket;
import org.apache.log4j.Logger;
import service.BucketService;
import servlet.LoginServlet;

import java.sql.SQLException;
import java.util.List;

public class BucketServiceImpl implements BucketService {
    private BucketDao bucketDao;
    private static final Logger LOGGER = Logger.getLogger(BucketServiceImpl.class);

    public BucketServiceImpl() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        bucketDao = new BucketDaoImpl();
    }

    @Override
    public Bucket create(Bucket bucket) {
        return bucketDao.create(bucket);
    }

    @Override
    public Bucket read(Integer id) {
        return bucketDao.read(id);
    }

    @Override
    public Bucket update(Bucket bucket) {
        return bucketDao.update(bucket);
    }

    @Override
    public void delete(Integer id) {
    bucketDao.delete(id);
    }

    @Override
    public List<Bucket> readAll() {
        return bucketDao.readAll();
    }
}
