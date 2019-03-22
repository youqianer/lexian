
package com.chinasofti.lexian.manager.common.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.chinasofti.lexian.manager.common.dao.BaseDao;
import com.chinasofti.lexian.manager.common.util.ApplicationContextUtil;
import com.chinasofti.lexian.manager.common.util.PageHelper;

@Repository
public class BaseDao extends SqlSessionTemplate {
	protected Logger logger = Logger.getLogger(getClass());

	public BaseDao() {
		super((SqlSessionFactory) ApplicationContextUtil.getBean(SqlSessionFactory.class));
	}

	// 分页列表数据 （不获取条数）
	public <T> List<T> pagationData(String statementId, PageHelper<?> pageHelper) {
		pageHelper.setIsgetTotal(false);
		return selectList(statementId, pageHelper);
	}

	public <T> PageHelper<T> pagationPageHelper(String statementId, PageHelper<T> pageHelper) {
		pageHelper.setIsgetTotal(true);
		List<T> list = selectList(statementId, pageHelper);
		pageHelper.setResults(list);
		return pageHelper;
	}
}
