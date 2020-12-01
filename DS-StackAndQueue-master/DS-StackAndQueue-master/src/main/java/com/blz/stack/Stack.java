package com.blz.stack;

public class Stack<K> extends MyLinkedList<K> {
	
	private final MyLinkedList myLinkedList;

	public Stack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	
	public INode peak() {
		return myLinkedList.head;
	}
}
