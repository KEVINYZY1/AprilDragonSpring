package me.dragon.biz.service.impl;

import me.dragon.base.core.Page;
import me.dragon.biz.dao.TestDao;
import me.dragon.biz.dao.impl.TestDaoImpl;
import me.dragon.biz.entity.Person;
import me.dragon.biz.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragon on 4/2/2017.
 */

@Service
@Transactional
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;

    @Override
    public List<Person> getList() {
        List<Person> personList = new ArrayList<Person>();
        personList = testDao.getList();
        return personList;
    }

    @Override
    public Person getSinglePerson() {
        Person person = new Person();
        person = testDao.getSinglePerson();
        return person;
    }

    @Override
    public void saveSinglePerson() {
        testDao.saveSinglePerson();
    }

    @Override
    public void updateSinglePerson() {
        testDao.updateSinglePerson();
    }

    @Override
    public void deleteSinglePerson() {
        testDao.deleteSinglePerson();
    }

    @Override
    public Page<Person> getPage(int pageNum) {
        Page<Person> personPage = new Page<Person>();
        personPage = testDao.getPage(pageNum);
        return personPage;
    }

    @Override
    public Page<Person> getResultWithPage(Page flagPage) {
        Page<Person> personPage = new Page<Person>();
        personPage = testDao.getResultWithPage(flagPage);
        return personPage;
    }
}
