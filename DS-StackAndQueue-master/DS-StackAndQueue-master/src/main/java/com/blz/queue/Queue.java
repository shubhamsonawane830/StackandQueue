package com.blz.queue;

import com.blz.queue.MyLinkedList;

public class Queue<K> extends MyLinkedList<K>{

	private final MyLinkedList myLinkedList;

	public Queue() {
		this.myLinkedList = new MyLinkedList<>();
	}
	
	public void enque(INode myNode) {
		myLinkedList.append(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}
	
}
