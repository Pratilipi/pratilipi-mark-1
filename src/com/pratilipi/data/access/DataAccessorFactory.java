package com.pratilipi.data.access;

import com.claymus.data.access.DataAccessor;

public class DataAccessorFactory {

	public static DataAccessor getDataAccessor() {
		return new DataAccessorGAEImpl();
	}
	
}
