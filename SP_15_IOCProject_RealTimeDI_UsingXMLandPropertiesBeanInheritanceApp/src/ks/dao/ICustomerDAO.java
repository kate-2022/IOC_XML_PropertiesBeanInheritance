package ks.dao;

import ks.bo.CustomerBO;

public interface ICustomerDAO {
	public int save(CustomerBO bo) throws Exception;
}