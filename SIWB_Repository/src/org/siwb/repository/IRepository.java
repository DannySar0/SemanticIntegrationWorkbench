package org.siwb.repository;

public interface IRepository
{
	// Generic Base Interface for a Repository

	String getName();
	
	boolean allowsObjectCollection(String name);
	
	boolean allowsObjectCollection(IObjectCollection oc);

}
