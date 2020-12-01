package com.blz.queue;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.blz.queue.INode;
import com.blz.queue.MyNode;
import com.blz.queue.Queue;

public class TestQueue {

	@Test
	public void Enquegiven3Numbers() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		Queue<Integer> queue = new Queue<Integer>();
		queue.enque(myFirstNode);
		queue.enque(mySecondNode);
		queue.enque(myThirdNode);
		INode peak = queue.peak();
		queue.printMyNodes();
		Assert.assertEquals(myFirstNode, peak);
	}
	
	@Test
	public void given3NumbersEnquedShouldDequeElementsUntilItIsEmptyTillItsPeak() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		Queue<Integer> queue = new Queue<Integer>();
		queue.enque(myFirstNode);
		queue.enque(mySecondNode);
		queue.enque(myThirdNode);
		INode deque = null;
		deque = queue.deque();
		Assert.assertEquals(myFirstNode, deque);
	}
}
