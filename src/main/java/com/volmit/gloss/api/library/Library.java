package com.volmit.gloss.api.library;

import mortar.lang.collection.GList;

public interface Library<T>
{
	public GList<T> getRegistries();

	public void register(T t);

	public T get(String id);
}
