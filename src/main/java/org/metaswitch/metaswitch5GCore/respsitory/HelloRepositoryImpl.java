package org.metaswitch.metaswitch5GCore.respsitory;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {

	@Override
	public String get() {
		return "Hello there, Manu!";
	}

}
