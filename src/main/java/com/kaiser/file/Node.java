package com.kaiser.file;

import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Node {
	protected String name;
	
	public abstract int size();
	
	public abstract Iterator<Node> createIterator();
}
