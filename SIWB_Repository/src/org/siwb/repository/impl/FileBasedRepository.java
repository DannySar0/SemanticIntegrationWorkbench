package org.siwb.repository.impl;

import java.io.File;

import org.siwb.repository.IObjectCollection;
import org.siwb.repository.IRepository;

public class FileBasedRepository
	implements IRepository
{
	private String name;
	private File rootDir;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean allowsObjectCollection(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean allowsObjectCollection(IObjectCollection oc) {
		// TODO Auto-generated method stub
		return false;
	}

}
