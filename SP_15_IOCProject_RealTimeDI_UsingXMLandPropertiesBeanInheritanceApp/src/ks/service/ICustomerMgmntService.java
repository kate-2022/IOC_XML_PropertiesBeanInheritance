package ks.service;

import ks.dto.CustomerDTO;

public interface ICustomerMgmntService {
	public String calcuateSimpleInterest(CustomerDTO dto) throws Exception;
}

