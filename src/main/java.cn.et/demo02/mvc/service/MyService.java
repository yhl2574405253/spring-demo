package demo02.mvc.service;

import demo02.mvc.dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	private MyDao myDao;

	public String query(String sql){
		return myDao.queryMyResult(sql).toString();
	}

}
